package com.zll.view.oa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacommon.view.Body;

import com.alibaba.fastjson.JSONObject;

public class WorkFlowView implements Body {

	// 类型
	private String title;
	// 类型
	private String type;
	// 表单数据
	private JSONObject formData;
	// 审核人
	private String auditor;
	//抄送范围
	private String range;
	//统计属性
	private String attr;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public JSONObject getFormData() {
		List<Map<String,Object>> array = new ArrayList<Map<String,Object>>();
		
		Object[] keys = formData.keySet().toArray();
		Arrays.sort(keys); 
	    for(Object key : keys){
	    	 if(key.toString().endsWith("Label")) continue;
	    	 
	    	 Object value = formData.get(key);
	         Object nameValue = formData.get(key+"Label");
	         
	         Map<String,Object> object = new HashMap<String,Object>();
	         object.put("label", nameValue);
	         object.put("value", value);
	         array.add(object);
	     }
		
	     JSONObject object = new JSONObject();
	     object.put("init", formData);
	     object.put("list", array);
		
		return object;
	}
	public void setFormData(JSONObject formData) {
		this.formData = formData;
	}
	
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}

}

