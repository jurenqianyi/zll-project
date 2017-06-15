package javacommon.view;
/**
 * 	客户端的请求实体模型
 */
public class RequestModel<T extends Body> {
	
	/**
	 * 用户uuid，标识一个用户，对应一次会话
	 */
	protected String uuid;

	/**
	 * 请求时间戳
	 */
	protected long requestTimestamp ;

	/**
	 * 请求体
	 */
	protected T body;

	/**
	 * 创建一个空参数体的请求
	 * 
	 * @param uuid
	 * @return
	 */
	public static RequestModel<EmptyBody> build(String uuid) {
		RequestModel<EmptyBody> build = build(uuid, new EmptyBody());
		return build;
	}

	/**
	 * 创建一个请求
	 * @param uuid
	 * @param body
	 * @return
	 */
	public static <T extends Body> RequestModel<T> build(String uuid, T body) {
		RequestModel<T> request = new RequestModel<T>(uuid, body);
		if(request.getRequestTimestamp() == 0L)
			request.setRequestTimestamp(System.currentTimeMillis());
		return request;
	}

	public RequestModel() {
		super();
	}

	public RequestModel(String uuid, T body) {
		super();
		this.uuid = uuid;
		this.body = body;
	}

	public T getBody() {
		return body;
	}

	public long getRequestTimestamp() {
		return requestTimestamp;
	}

	/**
	 * uuid是登录和注册时，服务器传递过来的，是服务器随机产生的标识，每次获得的都不一样。
	 * @return
	 */
	public String getUuid() {
		return uuid;
	}

	public void setBody(T body) {
		this.body = body;
	}

	/**
	 * 如果没有设置，调用{@linkplain RequestModel#build(String, Body)}时，会默认设置为当前时间戳。
	 * @param requestTimestamp
	 */
	public void setRequestTimestamp(long requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
	}

	/**
	 * uuid是登录和注册时，服务器传递过来的，是服务器随机产生的标识，每次获得的都不一样。
	 * 如果本地有缓存的uuid，在请求时需要设置在request里面
	 * @param uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
