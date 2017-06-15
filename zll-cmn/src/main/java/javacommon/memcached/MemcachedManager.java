package javacommon.memcached;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javacommon.util.PropsUtil;
import net.spy.memcached.AddrUtil;
import net.spy.memcached.ConnectionFactoryBuilder;
import net.spy.memcached.ConnectionFactoryBuilder.Protocol;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.auth.AuthDescriptor;
import net.spy.memcached.auth.PlainCallbackHandler;
import net.spy.memcached.internal.GetFuture;
import net.spy.memcached.internal.OperationFuture;
import net.spy.memcached.transcoders.SerializingTranscoder;

import org.apache.log4j.Logger;
public class MemcachedManager {

	final static Logger logger = Logger.getLogger(MemcachedManager.class);
	private static MemcachedClient client = null;
	private static SerializingTranscoder serializingTranscoder = new SerializingTranscoder();
	
	public static final int TIME_OUT = 60 * 30;//缓存时间60 * 30 30分钟
	
	public static final int TIME_OUT_LESS = 60 * 1;//缓存时间60 * 30 30分钟
	
	static {
		String host = PropsUtil.getString(null, "memcached_host");
		String port = PropsUtil.getString(null, "memcached_port");;
		
		logger.info("准备连接缓存服务器");
		
		InetSocketAddress ad = new InetSocketAddress(host,Integer.parseInt(port));
		try {
			client = new MemcachedClient(ad);
			logger.info("连接缓存服务器成功！");
		} catch (IOException e) {
			logger.info("连接缓存服务器失败！" + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected static MemcachedManager instance = new MemcachedManager();
	
	protected MemcachedManager(){}
	
	public static MemcachedManager getInstance () {
	   return instance;
	}
	/**
	 * 缓存数据
	 * @param key
	 * @param expired(超时时间以秒为单位)
	 * @param value
	 * @return
	 */
	public boolean set(String key, Object value, int expired) {
		MemcachedManager.getInstance().delete(key);
		Boolean flag = false;
		OperationFuture<Boolean> future = client.add(key, expired, value,serializingTranscoder);
		if(future !=null){
			try {
			    synchronized (future) {  
					future.get();
					flag = true;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	/**
	 * 获取缓存对象
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		GetFuture f = client.asyncGet(key,serializingTranscoder);
		try {
	      return f.get(1L, TimeUnit.SECONDS);
	    } catch (Exception e) {
	      f.cancel(false);
	    }
		return null;
	}
	
	/**
	 * 更新缓存并设置超时时间
	 * @param key
	 * @param expired
	 * @param value
	 * @return
	 */
	public boolean update(String key,int expired, Object value){
		Boolean flag = false;
		OperationFuture<Boolean> future = client.set(key,expired,value,serializingTranscoder);
		if(future !=null){
			try {
			    synchronized (future) {  
					future.get();
					flag = true;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	/**
	 * 关闭连接
	 */
	public void shutdown(){
		client.shutdown();
	}
	/**
	 * 删除对象
	 * @param key
	 */
	public void delete(String key) {
		OperationFuture<Boolean> future = client.delete(key);
		if(future !=null){
			try {
				future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MemcachedManager.getInstance().set("aa", "00", 1);
		System.out.println(MemcachedManager.getInstance().get("aa"));
	}
}
