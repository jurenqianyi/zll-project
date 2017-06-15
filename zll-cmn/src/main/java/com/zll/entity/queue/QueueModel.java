package com.zll.entity.queue;

import java.io.Serializable;


public class QueueModel<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 响应提示信息
	 */
	protected String message;

	/**
	 * 响应的实体
	 */
	protected T body;

	/**
	 * 请求时间戳
	 */
	protected long timestamp;
	
	/**
	 * 通道
	 */
	protected String destination;
	
	public static <T> QueueModel<T> build(T body) {
		QueueModel<T> queue = new QueueModel<T>();
		if(body != null)
			queue.setBody(body);
		if(queue.getTimestamp() == 0L)
			queue.setTimestamp(System.currentTimeMillis());
		return queue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
