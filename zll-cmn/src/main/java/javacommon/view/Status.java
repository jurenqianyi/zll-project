package javacommon.view;

public interface Status {
	/**
	 * 服务器端出问题
	 */
    static final int SERVER_ERROR = 500;
    static final String SERVER_ERROR_MSG = "服务器繁忙,请稍后";
	/**
	 * 请求成功
	 */
    static final int SUCCESS = 200;
    static final String SUCCESS_MSG = "请求成功";
  
    /**
	 * 用户尚未登录
	 */
    static final int UNLOGIN_USER = 208;
    static final String UNLOGIN_USER_MSG = "用户尚未登录，请重新登录后在操作";
    
    /**
	 * 参数不合法
	 */
    static final int PARAMETER_ILLEGAL = 300;
    static final String PARAMETER_ILLEGAL_MSG = "参数不合法";
    
    /**
	 * 验证码不正确
	 */
    static final int CODE_ERROR = 301;
    static final String CODE_ERROR_MSG = "验证码不正确";
    
    /**
	 * 用户名已经存在
	 */
    static final int USERNAEM_EXIST = 302;
    static final String USERNAEM_EXIST_MSG = "用户名已经存在";
    
    /**
	 * 用户名不存在
	 */
    static final int USERNAEM_NOT_EXIST = 303;
    static final String USERNAEM_NOT_EXIST_MSG = "用户名不存在";
    
    /**
	 * 密码不正确
	 */
    static final int PASSWORD_ERROR = 304;
    static final String PASSWORD_ERROR_MSG = "密码不正确";
    
    /**
	 * 不能操作自己的业务
	 */
    static final int SELF_ERROR = 305;
    static final String SELF_ERROR_MSG = "不能操作自己的业务";
    
    /**
	 * 不能操作自己的业务
	 */
    static final int WORK_ERROR = 306;
    static final String WORK_ERROR_MSG = "律师不支持该业务";
    
    /**
	 * 律师未绑定
	 */
    static final int POLICY_BIND_ERROR = 307;
    static final String POLICY_BIND_ERROR_MSG = "律师未绑定，操作失败";
    
    
    /**
   	 * 没有权限
   	 */
   static final int AUTH_NO = 400;
   static final String AUTH_NO_MSG = "没有权限";
   
   /**
	 * session超时
	 */
   static final int SESSION_OUTTIME = 500;
   static final String SESSION_OUTTIME_MSG = "session超时";
}
