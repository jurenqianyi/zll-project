package com.zll.entity.common;


public class TemplateView {
	
	// 模板的编码
	private java.lang.String templateCode;
	//类型；1；短信，2；站内信    
	private java.lang.String templateType;
	//模板的主题  
	private java.lang.String templateTitle;
    //模板的内容
	private java.lang.String templateContent;

	public java.lang.String getTemplateCode() {
		return this.templateCode;
	}
	
	public void setTemplateCode(java.lang.String value) {
		this.templateCode = value;
	}

	public java.lang.String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(java.lang.String templateType) {
		this.templateType = templateType;
	}

	public java.lang.String getTemplateTitle() {
		return templateTitle;
	}

	public void setTemplateTitle(java.lang.String templateTitle) {
		this.templateTitle = templateTitle;
	}

	public java.lang.String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(java.lang.String templateContent) {
		this.templateContent = templateContent;
	}
	
}

