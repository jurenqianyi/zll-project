package javacommon.log;

public interface CuteLoggerConstants {
	/**如果操作超过此时间 则 进行记录    单位：秒 **/
	public static final int  LOG_OPERATION_SECONDS=1;
	/**错误信息的标示----如果多种信息并存，则可区分**/
	public static final String ERROR_LOG_HEADER="error_message:";
	/**获取类型值
	 * @return
	 */
	public String getValue();
	/**
	 * 日志类型
	 * 
	 */
	public enum MuseumLoggerType implements CuteLoggerConstants{
		/**基础日志---错误**/
		ROOT("root"),
		PAY("pay"),
		PAY_FAIL("pay_fail"),
		TRADE("trade"),
		ERROR("error");
		
		private String value;
		public String getValue() {
			return value;
		}
		private MuseumLoggerType(String value){
			this.value=value;
		}
	}
}
