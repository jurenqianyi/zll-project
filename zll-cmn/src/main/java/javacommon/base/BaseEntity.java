package javacommon.base;

import java.io.Serializable;
import java.util.Date;

import javacommon.util.DateUtil;

public class BaseEntity implements Serializable {

	protected static final long serialVersionUID = 1;
	
	// id 
	private int id;
	// 创建时间 
	private Date createTime;
	// 更新时间 
	private Date updateTime;
	// 0:不可用 1:可用 
	private int enableFlag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateTimeString() {
		return DateUtil.formatDatetime(getCreateTime());
	}
	
	public void setCreateTimeString(String value) {
		setCreateTime(DateUtil.parseDatetime(value));
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getUpdateTimeString() {
		return DateUtil.formatDatetime(getUpdateTime());
	}
	
	public void setUpdateTimeString(String value) {
		setUpdateTime(DateUtil.parseDatetime(value));
	}

	public int getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(int enableFlag) {
		this.enableFlag = enableFlag;
	}

}
