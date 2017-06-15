package javacommon.exception;

/**
 * 
 * @author qy
 *
 */
public class ZLLException extends RuntimeException {

	private static final long serialVersionUID = -3585616564496392771L;
	
	private String message = "系统异常，请联系系统管理员!";
	private int code;

	public ZLLException() {
	}

	public ZLLException(String message) {
		if (message != null)
			this.message = message;
	}

	public ZLLException(int code, String message) {

		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
