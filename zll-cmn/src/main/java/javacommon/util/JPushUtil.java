package javacommon.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.APIConnectionException;
import cn.jpush.api.common.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.PushPayload.Builder;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

/**
 * android 消息推送
* @ClassName: AndroidPush
* @Description: TODO(这里用一句话描述这个类的作用)
* @author chenwei qizi3294@163.com
* @date 2015年3月6日 上午9:34:59
*
 */
public class JPushUtil {

	static final Logger logger = LoggerFactory.getLogger(JPushUtil.class);
	
	private static final String appKey = "575c09ffbea371065ae99361";
	private static final String masterSecret = "bf213bddd561333160d82209";

	// 外部从此获取工具类实例
	public static JPushUtil getInstance() {
		return JPushUtil.JPushUtilHolder.instance;
	}

	static class JPushUtilHolder {
		static final JPushUtil instance = new JPushUtil();
	}

	/**
	 * 
	 */
	private JPushUtil() {
	}

	
	/**
	 * 极光推信息
	 * @param phone 手机
	 * @param param 参数
	 * @param content 内容
	 * @return
	 */
	public boolean pushMsg(String phone, String param,String content) {
		boolean result = false;
		
		PushPayload payload = null;
		if(phone==null||phone.length()==0){
			payload = PushPayload.alertAll(content).messageAll(param);
		}else{
			payload = JPushUtil.alertAll(phone,param,content);
		}
		
		JPushClient jpushClient = new JPushClient(masterSecret, appKey, 3);
		try {
			PushResult pushResult = jpushClient.sendPush(payload);
			result = pushResult.isResultOK();
			System.out.println(result);
		} catch (APIConnectionException e) {
			System.out.println(e.getMessage());
		} catch (APIRequestException e) {
			System.out.println(e.getErrorMessage());
		}
		return result;
	}
	
	 public static PushPayload alertAll(String phone, String param,String content) {
	        return new Builder()
	            .setPlatform(Platform.all())
	            .setAudience(Audience.alias(phone))
	            .setMessage(Message.content(param))
	            .setNotification(Notification.alert(content)).build();
	    }
	 
	public static void main(String[] args) {
		String type = "{\"param\":{\"id\":\"55\"},\"page\":\"detail\",\"type\":\"information\"}";
		JPushUtil.getInstance().pushMsg("15010546384",type,"test");//13370129987  15010546384 18612626458 15893686726
	}

}