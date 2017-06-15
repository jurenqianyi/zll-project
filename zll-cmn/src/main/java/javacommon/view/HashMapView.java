package javacommon.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class HashMapView extends HashMap<Object, Object> implements Body{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getString(Object key) {
		Object value = this.get(key);
		if(null != value) {
			if(value instanceof Integer) {
				Integer v = (Integer)value;
				return v.toString();
			} else if(value instanceof BigInteger) {
				BigInteger v = (BigInteger)value;
				return v.toString();
			} else if(value instanceof BigDecimal) {
				BigDecimal v = (BigDecimal)value;
				return v.toString();
			} else if(value instanceof Long) {
				Long v = (Long)value;
				return v.toString();
			} else if(value instanceof String) {
				String v = (String)value;
				return v;
			}
		}
		return "";
	}
	
	public Integer getInt(Object key) {
		Object value = this.get(key);
		if(null != value) {
			if(value instanceof Integer) {
				Integer v = (Integer)value;
				return v.intValue();
			} else if(value instanceof BigInteger) {
				BigInteger v = (BigInteger)value;
				return v.intValue();
			} else if(value instanceof BigDecimal) {
				BigDecimal v = (BigDecimal)value;
				return v.intValue();
			} else if(value instanceof Long) {
				Long v = (Long)value;
				return v.intValue();
			} else if(value instanceof String) {
				String v = (String)value;
				return Integer.parseInt(v);
			}
		}
		return 0;
	}
	
}
