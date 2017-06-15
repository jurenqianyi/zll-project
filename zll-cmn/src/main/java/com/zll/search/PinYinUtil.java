package com.zll.search;

import javacommon.util.StringUtil;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;

public class PinYinUtil {

	public static void main(String[] args) {
		System.out.println(pinYin("癌症 是 一种 让人 谈之色变 的 恐怖 疾病"));
	}

	public static String pinYin(String text) {
		if(StringUtil.isEmpty(text)) return "";
		String pinYin = "";
		try {
			char[] array = text.toCharArray();
			String[] data = new String[array.length];
			// 设置汉字拼音输出的格式
			HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
			hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
			hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
			hanyuPinyinOutputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
			for (int i = 0; i < array.length; i++) {
				// 判断能否为汉字字符
				if (Character.toString(array[i]).matches("[\\u4E00-\\u9FA5]+")) {
					data = PinyinHelper.toHanyuPinyinStringArray(array[i],hanyuPinyinOutputFormat);// 将汉字的几种全拼都存到data数组中
					pinYin += data[0];// 取出该汉字全拼的第一种读音并连接到字符串pinYin后
				} else {
					// 如果不是汉字字符，间接取出字符并连接到字符串pinYin后
					pinYin += Character.toString(array[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pinYin;
	}

}
