package javacommon.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class Tools
{
	  // 签名版本名称
    public static final String SIGN_VERSION_NAME = "sign_version";
    //签名类型名称
    public static final String SIGN_TYPE_NAME    = "sign_type";
    // 签名名称
    public static final String SIGN_NAME         = "sign";
	  /**
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     *
     * @param params
     *            需要排序并参与字符拼接的参数组
     * @param encode 是否需要urlEncode
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params, boolean encode) {
        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);
        String prestr = "";
        String charset = params.get("_input_charset");
        if (charset == null) {
        	charset = "utf-8";
        }
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            if (encode) {
                try {
                    value = URLEncoder.encode(URLEncoder.encode(value, charset),charset);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
           
            	 if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
                     prestr = prestr + key + "=" + value;
                 } else {
                     prestr = prestr + key + "=" + value + "&";
                 }
          }
        return prestr;
    }

	public static String createXMLLinkString(Map<String, String> params, boolean encode) {
		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		String prestr = "";
		String charset = params.get("_input_charset");
		if (charset == null) {
			charset = "utf-8";
		}
		StringBuffer resParam = new StringBuffer();
		resParam.append("<xml>");
		boolean flag = false;
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);
			if (encode) {
				try {
					value = URLEncoder.encode(URLEncoder.encode(value, charset), charset);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			resParam.append("<").append(key).append(">");
			resParam.append(value);
			resParam.append("</").append(key).append(">");
			flag = true;
		}
		resParam.append("</xml>");

		if (flag) {
			prestr = resParam.toString();
		}
		return prestr;
	}
    
    /**
     * request 转map
     * @param request
     * @return
     */
    public static Map getParameterMap(HttpServletRequest request,boolean isFilter) {
        // 参数Map
        Map properties = request.getParameterMap();
        // 返回值Map
        Map returnMap = new HashMap();
        Iterator entries = properties.entrySet().iterator();
        Map.Entry entry;
        String name = "";
        String value = "";
        while (entries.hasNext()) {
            entry = (Map.Entry) entries.next();
            name = (String) entry.getKey();
            if(isFilter){
            if(!name.equals("sign")&&!name.equals("sign_type")&&!name.equals("sign_version")){
            Object valueObj = entry.getValue();
            if(null == valueObj){
                value = "";
            }else if(valueObj instanceof String[]){
                String[] values = (String[])valueObj;
                for(int i=0;i<values.length;i++){
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length()-1);
            }else{
                value = valueObj.toString();
            }
            returnMap.put(name, value);
        }
        }else
        {
        	 Object valueObj = entry.getValue();
             if(null == valueObj){
                 value = "";
             }else if(valueObj instanceof String[]){
                 String[] values = (String[])valueObj;
                 for(int i=0;i<values.length;i++){
                     value = values[i] + ",";
                 }
                 value = value.substring(0, value.length()-1);
             }else{
                 value = valueObj.toString();
             }
             returnMap.put(name, value);
        }
        }
        return returnMap;
    }
    
    /**
     * 从request获取IP的方法
     * @param request
     * @return
     */
	public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    public static String getValueByType(String str, String type) {
		if (str != null) {
			String[] params = str.split(",");
			if (params != null) {
				for (String param : params) {
					if (param.startsWith(type + "|")) {
						return param.substring(param.indexOf("|") + 1, param.length());
					}
				}
			}
		}
		return null;
    }
    
    public static String setValueByType(String str, String type, String value) {
    	String ret = null;
    	boolean flag = false;
		if (str != null) {
	    	String[] params = str.split(",");
			if (params != null) {
				for (String param : params) {
					if (param.startsWith(type + "|")) {
						flag = true;
						param = type + "|" + value;
					}
					if (ret == null) {
						ret = param;
					} else {
						ret = ret + "," + param;
					}
				}
			}
		}
		if(!flag){
			if (ret == null) {
				ret = type + "|" + value;
			} else {
				ret = ret + "," + type + "|" + value;
			}
		}
    	return ret;
    }
}
