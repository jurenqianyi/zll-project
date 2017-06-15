package com.zll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javacommon.util.StringUtil;

/**
 * 律师领域分类工具类
 * @author qianyi
 *
 */
public class FieldUtil {

	/**
	 * 保存与更新时使用
	 * @param text（如：1-1,1-2；即一级分类与二级分类）
	 * @return
	 */
	public static Map<String,String> convertStringToMap(String text) {
		Map<String,String> map = new HashMap<String,String>();
		
		Set<String> fieldId1sSet = new HashSet<String>();
		Set<String> fieldId2sSet = new HashSet<String>();
		if(StringUtil.isNotEmpty(text)) {
			String[] array1 = text.split(",");
			for(int i=0; i<array1.length; i++) {
				if(StringUtil.isNotEmpty(array1[i]) && array1[i].indexOf("-") != -1) {
					String[] array2 = array1[i].split("-");
					String filedId1 = array2[0];
					String filedId2 = array2[0];
					if(StringUtil.isDigits(filedId1) && StringUtil.isDigits(filedId2)) {
						
						fieldId1sSet.add(filedId1);
						fieldId2sSet.add(filedId2);
					}
				}
			}
		}
		
		StringBuffer fieldId1s = new StringBuffer();
		StringBuffer fieldId2s = new StringBuffer();
		Iterator<String> fieldId1sIterator = fieldId1sSet.iterator();  
        while(fieldId1sIterator.hasNext()) {  
        	fieldId1s.append(fieldId1sIterator.next()).append(",");
        } 
        Iterator<String> fieldId2sIterator = fieldId2sSet.iterator();  
        while(fieldId2sIterator.hasNext()) {  
        	fieldId2s.append(fieldId2sIterator.next()).append(",");
        } 
		
		map.put("fieldId1s", fieldId1s.toString());
		map.put("fieldId2s", fieldId2s.toString());
		return map;
	}
	
}
