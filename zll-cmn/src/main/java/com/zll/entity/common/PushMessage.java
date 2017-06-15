package com.zll.entity.common;

import java.io.Serializable;
import java.util.Map;

public class PushMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	
	private String page;
	
	private Map<String,String> param;
	
	public PushMessage() {
		
	}
	
	public PushMessage(String type,String page,Map<String,String> param) {
		this.type = type;
		this.page = page;
		this.param = param;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Map<String, String> getParam() {
		return param;
	}

	public void setParam(Map<String, String> param) {
		this.param = param;
	}
	
	
}
