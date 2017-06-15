package javacommon.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

public class TwoCodeUtil {

	public static void main(String[] args) {
		TwoCodeUtil.encode("dddddddddd", "D:/SysCode_00.png");

	}

//	public static void encode(String codeValue, String path) {
//		try {
//			File dstDir = new File(path).getParentFile();
//			if (!dstDir.exists()) {
//				dstDir.mkdirs();
//			}
//
//			BitMatrix byteMatrix = new MultiFormatWriter().encode(new String(
//					codeValue.getBytes("utf-8"), "iso-8859-1"),
//					BarcodeFormat.QR_CODE, 260, 260);
//			File file = new File(path);
//
//			MatrixToImageWriter.writeToFile(byteMatrix, "png", file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void encode(String content, String imgPath) { 
        try { 
            Qrcode qrcodeHandler = new Qrcode(); 
            qrcodeHandler.setQrcodeErrorCorrect('M'); 
            qrcodeHandler.setQrcodeEncodeMode('B'); 
            qrcodeHandler.setQrcodeVersion(7); 

            System.out.println(content); 
            byte[] contentBytes = content.getBytes("gb2312"); 
            BufferedImage bufImg = new BufferedImage(140, 140, 
                    BufferedImage.TYPE_INT_RGB); 
            Graphics2D gs = bufImg.createGraphics(); 
            gs.setBackground(Color.WHITE); 
            gs.clearRect(0, 0, 140, 140); 
            // 设定图像颜色> BLACK 
            gs.setColor(Color.BLACK); 

            // 设置偏移量 不设置可能导致解析出错 
            int pixoff = 2; 
            // 输出内容> 二维码 
            if (contentBytes.length > 0 && contentBytes.length < 120) { 
                boolean[][] codeOut = qrcodeHandler.calQrcode(contentBytes); 
                for (int i = 0; i < codeOut.length; i++) { 
                    for (int j = 0; j < codeOut.length; j++) { 
                        if (codeOut[j][i]) { 
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3); 
                        } 
                    } 
                } 
            } else { 
                System.err.println("QRCode content bytes length = " 
                        + contentBytes.length + " not in [ 0,120 ]. "); 
            } 
            gs.dispose(); 
            bufImg.flush(); 
            File imgFile = new File(imgPath); 
            File dstDir=imgFile.getParentFile();
	    	if(!dstDir.exists()){
	    		dstDir.mkdirs();
	    	}
            // 生成二维码QRCode图片 
            ImageIO.write(bufImg, "png", imgFile); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 

}
