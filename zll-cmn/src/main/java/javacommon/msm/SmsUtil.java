package javacommon.msm;

public class SmsUtil {

	public static void main(String[] args) {
		send("15010546384", "test");
	}

	public static String send(String mobile, String content) {
		// http服务端url
		// String httpPath =
		// "http://58.68.247.151:8022/sendSms.ashx ";/*老HTTP测试环境*/
		// String httpPath =
		// "http://58.68.247.137:9053/communication/sendSms.ashx";/*新HTTP线上环境*/
		String httpPath = "http://58.68.247.137:9053/communication/sendSms.ashx";/* 新HTTP测试环境 */
		StringBuffer params = new StringBuffer();
		// 客户端ID
		String cid = "8390";
		// 客户端密码
		String pwd = "zll123";
		// 通道组id
		String productid = "201604061";
		// 手号机
		//String mobile = "15110013520";
		// long mobile=15110013520;13521297871
		// 短信内容3
		//String content = "中科达奥    上行测试12【商务测试】";
		// 子号码
		String lcode = "123";
		// 短信唯一标识,用于匹配状态报告
		String ssid = "20160406";
		// 短信类型:15普通短信,32长短信
		String format = "32";
		// 客户自定义签名,可以不填
		String sign = "";
		// 客户自定义内容,目前没有用到,不用填写
		String custom = "";
		try {
			params.append("cid=").append(CodingUtils.encodeBase64URL(cid))
			.append("&").append("pwd=").append(CodingUtils.encodeBase64URL(pwd))
			.append("&").append("productid=").append(CodingUtils.encodeURL(productid))
			.append("&").append("mobile=").append(CodingUtils.encodeBase64URL(mobile+""))
			.append("&").append("content=").append(CodingUtils.encodeBase64URL(content))
			.append("&").append("lcode=").append(lcode)
			.append("&").append("ssid=").append(ssid)
			.append("&").append("format=").append(format)
			.append("&").append("sign=").append(CodingUtils.encodeBase64URL(sign))
			.append("&").append("custom=").append(CodingUtils.encodeURL(custom));
			System.out.println(params.toString());
			String result = HttpUtil.sendPostRequestByParam(httpPath,params.toString());
			System.out.println("r=" + result);
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
