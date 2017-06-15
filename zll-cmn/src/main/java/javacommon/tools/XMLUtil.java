package javacommon.tools;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

public class XMLUtil {

	public static HashMap<String, String> xmlStringReader(String xmlString) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		// 创建一个新的字符串
		StringReader read = new StringReader(xmlString);
		// 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
		InputSource source = new InputSource(read);
		// 创建一个新的SAXBuilder
		SAXBuilder saxbBuilder = new SAXBuilder();
		try {
			// 通过输入源构造一个Document
			Document doc = saxbBuilder.build(source);
			// 取的根元素
			Element root = doc.getRootElement();
//			System.out.println(root.getName());
			List<?> node = root.getChildren();
			for (int i = 0; i < node.size(); i++) {
				Element element = (Element) node.get(i);
//				System.out.println(element.getName());
				hashMap.put(element.getName(), element.getValue());
				List<?> subNode = element.getChildren();
				for (int j = 0; j < subNode.size(); j++) {
					Element subElement = (Element) subNode.get(j);
					hashMap.put(subElement.getName(), subElement.getValue());
				}
			}
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hashMap;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testStr="<xml>"
				+ "<return_code><![CDATA[SUCCESS]]></return_code>"
				+ "<return_msg><![CDATA[OK]]></return_msg>"
				+ "<appid><![CDATA[wxfab8917d8150f6f5]]></appid>"
				+ "<mch_id><![CDATA[1302386701]]></mch_id>"
				+ "<nonce_str><![CDATA[J1zd1ZsU4SpIczmT]]></nonce_str>"
				+ "<sign><![CDATA[55D1741D85BBE94C412FF9104D8EE205]]></sign>"
				+ "<result_code><![CDATA[SUCCESS]]></result_code>"
				+ "<prepay_id><![CDATA[wx201512301851221d2ee51bd40136896329]]></prepay_id>"
				+ "<trade_type><![CDATA[APP]]></trade_type>"
				+ "</xml>";
		System.out.println(xmlStringReader(testStr));
		System.exit(0);
	}
}
