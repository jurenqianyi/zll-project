package com.zll.search;

import javacommon.util.StringUtil;

public class FullTextUtil {

	public static String convertChineseToPinYin(String text) {
		if(StringUtil.isEmpty(text)) return "";
		
		String content = IKAnalyzerUtil.analyze(text);
		
		return PinYinUtil.pinYin(content);
	}
	
	public static void main(String[] args) {
		System.out.println(IKAnalyzerUtil.analyze("昨天开庭,男方不同意离婚,该怎么办呢?要是撤诉,再次起诉要隔多长时间"));
	}
}
