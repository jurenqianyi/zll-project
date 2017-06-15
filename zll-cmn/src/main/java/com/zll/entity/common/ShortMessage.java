package com.zll.entity.common;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;

public class ShortMessage extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// phone
	private String phone;
	// content
	private String content;
	// serialNumber
	private String serialNumber;
	// status
	private int status;

	public void setPhone(String value) {
		this.phone = value;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setContent(String value) {
		this.content = value;
	}

	public String getContent() {
		return this.content;
	}

	public void setSerialNumber(String value) {
		this.serialNumber = value;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setStatus(int value) {
		this.status = value;
	}

	public int getStatus() {
		return this.status;
	}

}
