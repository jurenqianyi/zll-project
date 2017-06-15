package com.zll.search;

import java.io.IOException;
import java.io.StringReader;

import javacommon.util.StringUtil;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class IKAnalyzerUtil {

	public static IKAnalyzer analyzer = new IKAnalyzer();

	public static void main(String[] args) throws Exception {
		String keyword = analyze("立水桥");
		System.out.println(keyword);
		System.out.println(PinYinUtil.pinYin(keyword));
	}
	
	public static String analyze(String text) {  
		if(StringUtil.isEmpty(text)) return "";
	    String keyword = null;
		try {
			TokenStream tokens = analyzer.reusableTokenStream("content", new StringReader(text));  
			OffsetAttribute offsetAttr = tokens.getAttribute(OffsetAttribute.class);  
			CharTermAttribute charTermAttr = tokens.getAttribute(CharTermAttribute.class); 
			keyword = "";
			while (tokens.incrementToken()) {  
			    char[] charBuf = charTermAttr.buffer();  
			    String term = new String(charBuf, 0, offsetAttr.endOffset() - offsetAttr.startOffset());  
			   // System.out.println(term + ", " + offsetAttr.startOffset() + ", " + offsetAttr.endOffset());  
			    keyword += term + " ";
			}  
			tokens.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	    return keyword;
	}  

}