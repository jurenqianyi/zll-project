package javacommon.upload;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.aliyun.openservices.oss.OSSClient;
import com.aliyun.openservices.oss.model.ObjectMetadata;
import com.aliyun.openservices.oss.model.PutObjectResult;

public class OSSUtil {
    
    /**
	 * 阿里云ACCESS_ID
	 */
	private static String ACCESS_ID = "zChyMr69AhoqrZxQ";
	/**
	 * 阿里云ACCESS_KEY 
	 */
	private	 static String ACCESS_KEY = "ZkFk0TLZweKAwUCI43ixpMa2VA8SX7";
	/**
	 *  阿里云OSS_ENDPOINT  北京Url
	 */
	private static String OSS_ENDPOINT = "http://oss-cn-beijing.aliyuncs.com";
	
	/**
	 * 阿里云BUCKET_NAME  OSS
	 */
	private static String BUCKET_NAME = "zllserver";;
	
	private static String BASE_PATH = "http://zllserver.oss-cn-beijing.aliyuncs.com/";
	private static final int MAX_SIZE = 200 * 1024 * 1024;   //文件的默认上传大小
	private static final String TYPE = "jpg,jpeg,gif,png,JPG,JPEG,GIF,PNG,";  //文件的默认上传类型
	
	private static final String NOT_EXIST = "上传文件不存在";
	private static final String TOO_LARGE = "上传文件太大";
	private static final String TYPE_MSIMATCH = "上传文件类型不匹配";
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
	
	static {
//		BUCKET_NAME = ConfigUtil.getValueByKey("image_path");
//		BASE_PATH = "http://" + BUCKET_NAME + "-image.yunnengclub.com/";
	}
	
	/** 
	 * 
	  * @param file  上传文件
	 * @param path  上传路径
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	public static String upload(MultipartFile file, String path, HttpServletRequest request) throws IOException {
    	if(file == null) {
			throw new RuntimeException(NOT_EXIST);
		}
    	 
    	long len = file.getSize();
		if(len > MAX_SIZE) {
			throw new RuntimeException(TOO_LARGE);
		}
		
    	if(!type(file,"")) { 
    		throw new RuntimeException(TYPE_MSIMATCH);
    	}
    	return OSSUtil.upload(file, path);
	}
	
	/**
	 * 
	 * @param file  上传文件
	 * @param path  上传路径
	 * @param fileType 上传类型
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	public static String upload(MultipartFile file, String path, String fileType, HttpServletRequest request) throws IOException {
		if(file == null) {
			throw new RuntimeException(NOT_EXIST);
		}
    	
//    	long len = file.getSize();
//		if(len > MAX_SIZE) {
//			throw new RuntimeException(TOO_LARGE);
//		}
		
		if(!type(file,fileType)) { 
    		throw new RuntimeException(TYPE_MSIMATCH);
    	}
		
		return OSSUtil.upload(file, path);
	}
	
	/**
	 * 
	 * @param file  上传文件
	 * @param path  上传路径
	 * @param size  上传大小
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	public static String upload(MultipartFile file, String path, int size, HttpServletRequest request) throws IOException {
		if(file == null) {
			throw new RuntimeException(NOT_EXIST);
		}
    	
    	long len = file.getSize();
		if(len > size*1024) {
			throw new RuntimeException(TOO_LARGE);
		}
		
//		if(!type(file,"")) { 
//    		throw new RuntimeException(TYPE_MSIMATCH);
//    	}
		return OSSUtil.upload(file, path);
	}
	
	/**
	 * 
	 * @param file  上传文件
	 * @param path  上传路径
	 * @param fileType 上传类型
	 * @param size  上传大小
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	public static String upload(MultipartFile file, String path, String fileType, int size, HttpServletRequest request) throws IOException {
		if(file == null) {
			throw new RuntimeException(NOT_EXIST);
		}
    	
    	long len = file.getSize();
		if(len > size*1024) {
			throw new RuntimeException(TOO_LARGE);
		}
		
		if(!type(file,fileType)) { 
    		throw new RuntimeException(TYPE_MSIMATCH);
    	}
		
		return OSSUtil.upload(file, path);
	}
    
	/**
	 * 上传图片
	 * @param file 上传文件
	 * @param path 上传路径
	 * @return
	 * @throws IOException
	 */
    public static String upload(MultipartFile file, String path) throws IOException {
    	OSSClient client=new OSSClient(OSS_ENDPOINT,ACCESS_ID,ACCESS_KEY);
        
        // 新建一个Bucket
        client.createBucket(BUCKET_NAME);
        
        // 获取指定文件的输入流
        InputStream content = file.getInputStream();

        // 创建上传Object的Metadata
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        meta.setContentLength(file.getSize());
        meta.setContentType("image/png");
        
        
        String fileName = file.getOriginalFilename();
        if(fileName.toLowerCase().endsWith(".gif")) {
        	meta.setContentType("image/gif");
        } else if(fileName.toLowerCase().endsWith(".jpg")) {
        	meta.setContentType("image/jpeg");
        } else if(fileName.toLowerCase().endsWith(".png")) {
        	meta.setContentType("image/png");
        } else if(fileName.toLowerCase().endsWith(".jpeg")) {
        	meta.setContentType("image/jpeg");
        } else if(fileName.toLowerCase().endsWith(".pdf")) {
        	meta.setContentType("application/pdf");
        } else if(fileName.toLowerCase().endsWith(".doc")) {
        	meta.setContentType("application/msword");
        } else if(fileName.toLowerCase().endsWith(".xls")) {
        	meta.setContentType("application/vnd.ms-excel");
        } else if(fileName.toLowerCase().endsWith(".ppt")) {
        	meta.setContentType("application/x-ppt");
        } else if(fileName.toLowerCase().endsWith(".docx")) {
        	meta.setContentType("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        } else if(fileName.toLowerCase().endsWith(".xlsx")) {
        	meta.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        } else if(fileName.toLowerCase().endsWith(".pptx")) {
        	meta.setContentType("application/vnd.openxmlformats-officedocument.presentationml.presentation");
        } else if(fileName.toLowerCase().endsWith(".txt")) {
        	meta.setContentType("text/plain TXT");
        } else if(fileName.toLowerCase().endsWith(".rar")) {
        	meta.setContentType("application/octet-stream");
        } else if(fileName.toLowerCase().endsWith(".zip")) {
        	meta.setContentType("application/x-zip-compressed");
        } 
        
        String myPath = getUploadPath(file, path);
        String myName = getUploadName(file);
        if("policy".equals(path)) myName = fileName;
        String key = myPath + myName;
        // 上传Object.
        PutObjectResult result = client.putObject(BUCKET_NAME, key, content, meta);
        System.out.println(result.toString());
//        if(meta.getContentType().indexOf("image/") != -1) {
//        	String dstPathDir=SystemContext.getRequest().getRealPath("") + File.separator + "upload" + File.separator + path + File.separator + myName;
//            ImageReduceUtil.reduceImage(file, dstPathDir, 192);
//            upload(new File(dstPathDir),myPath + "m/" + myName);
//        }
        return BASE_PATH + key;
    }
    
    /**
	 * 上传图片
	 * @param file 上传文件
	 * @param path 上传路径
	 * @return
	 * @throws IOException
	 */
    public static String upload(File file, String path) throws IOException {
    	OSSClient client=new OSSClient(OSS_ENDPOINT,ACCESS_ID,ACCESS_KEY);
        
        // 新建一个Bucket
        client.createBucket(BUCKET_NAME);
        
        InputStream content = new FileInputStream(file);
        
        // 创建上传Object的Metadata
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        BufferedInputStream in = new BufferedInputStream(content);
        meta.setContentLength(file.length());
        //meta.setContentType("image/png");
        
        String fileName = file.getName();
        
        String key = path;
        // 上传Object.
        client.putObject(BUCKET_NAME, key, content, meta);

        return BASE_PATH + key;
    }
    
    /**
     * 获取文件名称
     * @param file
     * @param path
     * @return
     */
    public static String getUploadName(MultipartFile file) {
    	String fileName=file.getOriginalFilename();  
    	
    	if(fileName.toLowerCase().endsWith(".gif") || 
    			fileName.toLowerCase().endsWith(".jpg") ||
    			fileName.toLowerCase().endsWith(".png") || 
    			fileName.toLowerCase().endsWith(".jpeg")) {
    		String type = fileName.substring(fileName.lastIndexOf("."));
        	int a = 10000;
    		int b = 99999;
    		String filename = dateFormat.format(new Date()) + String.valueOf((long)Math.rint(Math.random()*(b-a+1)+a));
        	
    		return filename + type;
    	}
    			
    	return fileName;
    }
    
    /**
     * 获取文件名称
     * @param file
     * @param path
     * @return
     */
    public static String getUploadPath(MultipartFile file,String path) {
    	
    	return path + "/" + dateFormat.format(new Date()) + "/" + timeFormat.format(new Date()) + "/";
    }
    
    private static boolean type(MultipartFile file, String types) {
		String fileType = TYPE;
		if(!"".equals(types)) {
			fileType = TYPE + types;
		}
		boolean fla = false;
		String fileName=file.getOriginalFilename();     
		if(fileName.lastIndexOf(".")>0){
	    	String type = fileName.substring(fileName.lastIndexOf("."));
	    	String[] split = null;
	    	if(!"".equals(fileType)) {
	    		split = fileType.split(",");
	    	}
	    	
	    	for(int i=0; i<split.length; i++) {
	    		String t = "." + split[i].trim();
	    		if(type.equalsIgnoreCase(t)) {
	    			fla = true;
	    			break;
	    		} 
	    	}
		}
    	return fla;
	}
}
