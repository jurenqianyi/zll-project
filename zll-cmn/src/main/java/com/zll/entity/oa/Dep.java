package com.zll.entity.oa;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;


public class Dep extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//名称   
	private String name;
	//上级id   
	private int pid;
	//是否显示 1：显示 0：不显示   
	private int isShow;
	//层级   
	private String level;
	//属性   
	private String attr;
	//描述   
	private String content;
	//用户id   
	private int userId;

	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPid(int value) {
		this.pid = value;
	}
	
	public int getPid() {
		return this.pid;
	}
	
	public void setIsShow(int value) {
		this.isShow = value;
	}
	
	public int getIsShow() {
		return this.isShow;
	}
	
	public void setLevel(String value) {
		this.level = value;
	}
	
	public String getLevel() {
		return this.level;
	}
	
	public void setAttr(String value) {
		this.attr = value;
	}
	
	public String getAttr() {
		return this.attr;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return this.userId;
	}

}

