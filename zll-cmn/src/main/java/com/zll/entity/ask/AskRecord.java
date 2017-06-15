package com.zll.entity.ask;

import java.util.List;
import java.util.Date;
import javacommon.base.BaseEntity;
import javacommon.util.DateUtil;

public class AskRecord extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// 提问表id
	private int askId;
	// 回复人
	private String name;
	// 回复人头像
	private String headUrl;
	// 电话
	private String phone;
	// 回复人详情页
	private String url;
	// adress
	private String adress;
	// 内容
	private String content;
	// 回复时间
	private Date time;
	// 状态
	private int status;
	// 操作人id（来自system_user表的主键id）
	private int adminId;

	public void setAskId(int value) {
		this.askId = value;
	}

	public int getAskId() {
		return this.askId;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}

	public void setHeadUrl(String value) {
		this.headUrl = value;
	}

	public String getHeadUrl() {
		return this.headUrl;
	}

	public void setPhone(String value) {
		this.phone = value;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setUrl(String value) {
		this.url = value;
	}

	public String getUrl() {
		return this.url;
	}

	public void setAdress(String value) {
		this.adress = value;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setContent(String value) {
		this.content = value;
	}

	public String getContent() {
		return this.content;
	}

	public String getTimeString() {
		return DateUtil.formatDatetime(getTime());
	}

	public void setTimeString(String value) {
		setTime(DateUtil.parseDatetime(value));
	}

	public void setTime(Date value) {
		this.time = value;
	}

	public Date getTime() {
		return this.time;
	}

	public void setStatus(int value) {
		this.status = value;
	}

	public int getStatus() {
		return this.status;
	}

	public void setAdminId(int value) {
		this.adminId = value;
	}

	public int getAdminId() {
		return this.adminId;
	}

}
