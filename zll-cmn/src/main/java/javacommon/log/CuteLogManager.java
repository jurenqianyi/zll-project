package javacommon.log;

import java.io.File;
import java.util.Calendar;
import java.util.Properties;

import javacommon.log.CuteLoggerConstants.MuseumLoggerType;
import javacommon.util.PropsUtil;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 日志操作类
 * 
 * @author qy
 */
public class CuteLogManager{
	/**
	 * 日志配置
	 */
	private static Properties properties = new Properties();
	
	/**
	 * 日志路径
	 */
	private static String logPath = "D:\\log\\";
	
	static {
		logPath = PropsUtil.getString(null, "log_path");
	}
	
	/**获取日志
	 * @param loggerType  日志类型
	 * @param level	日志级别
	 * @param isCreate 如果没有声明该日志，是重新生成
	 * @return
	 */
	public static  Logger getLogger(CuteLoggerConstants loggerType,Level level,boolean isCreate){
		Logger logger=LogManager.exists(loggerType.getValue());
		if(logger==null){
			if(isCreate){//是否单独配置
				initProperties(loggerType.getValue(), level);
				PropertyConfigurator.configure(properties);
				logger=Logger.getLogger(loggerType.getValue());
			}else{
				logger=Logger.getLogger(loggerType.getValue());
			}
		}
		return logger;
	}
	
	/**获取日志
	 * @param loggerType
	 * @param level
	 * @return
	 */
	public static Logger getLogger(CuteLoggerConstants loggerType, Level level) {
		return getLogger(loggerType, level, true);
	}
	
	/**
	 * 
	 * @param loggerType
	 * @return
	 */
	public static Logger getLogger(CuteLoggerConstants loggerType) {
		return getLogger(loggerType,  Level.ERROR, true);
	}
	
	/**获取基类logger
	 * @return
	 */
	public static Logger getRootLogger(){
		return getLogger(MuseumLoggerType.ROOT, Level.ERROR);
	}
	
	/**生成log properties
	 * @param name
	 * @param level
	 * @return
	 */
	private static void initProperties(String name, Level level){
		properties.setProperty("log4j.category."+name,level.toString()+","+name);
		properties.setProperty("log4j.additivity."+name, "true");
		properties.setProperty("log4j.appender."+name,"javacommon.log.MyDailyRollingFileAppender");
		properties.setProperty("log4j.appender."+name+".DatePattern", "'.'yyyy-MM-dd");
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		String path = year + File.separator + month + File.separator + date + File.separator;
		
		properties.setProperty("log4j.appender."+name+".File", logPath+path+name);
		properties.setProperty("log4j.appender."+name+".layout","org.apache.log4j.PatternLayout");
		properties.setProperty("log4j.appender."+name+".layout.ConversionPattern","%d{yyyy-MM-dd HH:mm:ss}:%m%n");
	}
	
}
