package com.morsearch.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageTools {

        /**
         * ImageMagick的路径
         */
        //public static String imageMagickPath = "C:/Program Files/ImageMagick-7.0.2-Q16"; ;
        /*static {
            *//**
             *
             * 获取ImageMagick的路径
             *//*
            Properties prop = new PropertiesFile().getPropertiesFile();
            //linux下不要设置此值，不然会报错
            imageMagickPath = prop.getProperty("imageMagickPath");
        } */

		/**
		 *
		 * @param
		 * @throws Exception
		 */
       public static void scaleImage(InputStream imgInputStream, OutputStream imgOutputStream, int scale) throws IOException {
                Image src = ImageIO.read(imgInputStream);
//                String format = src.get .getFormatName() ;
                int width = ( int ) (src.getWidth( null ) * scale / 100.0 );
                int height = ( int ) (src.getHeight( null ) * scale / 100.0 );
                BufferedImage bufferedImage = new
                        BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                bufferedImage.getGraphics().drawImage(src.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0 , 0 , null );
                JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(imgOutputStream);
                encoder.encode( bufferedImage);
        }

    public static String scaleImageL(String imgSrc, String imgDist, int scale) {
            String rut="succ";
        try{
            File file = new File(imgSrc);
            if( ! file.exists()) {
                    if( ! file.exists()) {
                    return "file not";
                }
            }
            InputStream is = new FileInputStream(file);
            OutputStream os = new FileOutputStream(imgDist);
            scaleImage(is, os, scale);
            is.close();
            os.close();
            return "succ";
        }catch(Exception e){
            e.printStackTrace();
            rut=e.getMessage();
        }
        return rut;
    }


/*

		public static void cutImage(File file) throws Exception {
			try {
            	FileInputStream fis = new FileInputStream(file);
            	BufferedImage bufferedImg = ImageIO.read(fis);
            	int imgWidth = bufferedImg.getWidth();
            	int imgHeight = bufferedImg.getHeight();
            	//如果宽大于200并且大于高 按宽压缩
            	if(imgWidth>200&&imgWidth>imgHeight){
            		ImageTools.cutWidthImage(200, file.getAbsolutePath(), file.getAbsolutePath().replace("images", "images/small"));
            	//如果高大于200并且大于宽按高压缩
            	}else if(imgHeight>200&&imgHeight>=imgWidth){
            		ImageTools.cutHeigthImage(200, file.getAbsolutePath(), file.getAbsolutePath().replace("images", "images/small"));
            	//如果高宽都小于200 就用原图
            	}else if(imgWidth<=200&&imgHeight<=200){
            		File newF=new File(file.getAbsolutePath().replace("images", "images/small"));
            		FileUtils.copyFile(file, newF);
            	}
            	fis.close();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
		}
*/

        /** 
         *  
         * 根据坐标裁剪图片 
         *  
         * @param srcPath   要裁剪图片的路径 
         * @param newPath   裁剪图片后的路径 
         * @param x         起始横坐标 
         * @param y         起始纵坐标 
         * @param x1        结束横坐标 
         * @param y1        结束纵坐标 
         */  
      
        public static void cutImage(String srcPath, String newPath, int x, int y, int x1,   int y1) throws Exception {  
            int width = x1 - x;  
            int height = y1 - y;  
            IMOperation op = new IMOperation();  
            op.addImage(srcPath);  
            /** 
             * width：  裁剪的宽度 
             * height： 裁剪的高度 
             * x：       裁剪的横坐标 
             * y：       裁剪的挫坐标 
             */  
            op.crop(width, height, x, y);  
            op.addImage(newPath);  
            ConvertCmd convert = new ConvertCmd();  
      
            // linux下不要设置此值，不然会报错  
           // convert.setSearchPath(imageMagickPath);  
      
            convert.run(op);  
        }  
      
        /** 
         *  
         * 根据尺寸缩放图片 
         * @param width             缩放后的图片宽度 
         * @param height            缩放后的图片高度 
         * @param srcPath           源图片路径 
         * @param newPath           缩放后图片的路径 
         */  
        public static void cutImage(int width, int height, String srcPath,  String newPath) throws Exception {  
            IMOperation op = new IMOperation();  
            op.addImage(srcPath);  
            op.resize(width, height);  
            op.addImage(newPath);  
            ConvertCmd convert = new ConvertCmd(false);  
            // linux下不要设置此值，不然会报错  
           // convert.setSearchPath(imageMagickPath);  
            convert.run(op);  
      
        }  
        
        /** 
         * 根据宽度缩放图片 
         *  
         * @param width            缩放后的图片宽度 
         * @param srcPath          源图片路径 
         * @param newPath          缩放后图片的路径 
         */  
        public static void cutWidthImage(int width, String srcPath, String newPath)  throws Exception {
            IMOperation op = new IMOperation();  
            op.addImage(srcPath);  
            op.resize(width, null);  
            op.addImage(newPath);  
            ConvertCmd convert = new ConvertCmd();  
//            // linux下不要设置此值，不然会报错  
//            convert.setSearchPath(imageMagickPath);  
            convert.run(op);  
        }  
      
        /**
         * 根据高度缩放图片
         *
         * width            缩放后的图片高度
         * @param srcPath          源图片路径
         * @param newPath          缩放后图片的路径
         */  
        public static void cutHeigthImage(int height, String srcPath, String newPath)  throws Exception {  
            IMOperation op = new IMOperation();  
            op.addImage(srcPath);  
            op.resize(null, height);  
            op.addImage(newPath);  
            ConvertCmd convert = new ConvertCmd();  
//            // linux下不要设置此值，不然会报错  
//            convert.setSearchPath(imageMagickPath);  
            convert.run(op);  
        } 
        
        /** 
         * 给图片加水印 
         * @param srcPath            源图片路径 
         */  
        public static void addImgText(String srcPath) throws Exception {  
            IMOperation op = new IMOperation();  
            op.font("宋体").gravity("southeast").pointsize(18).fill("#BCBFC8")  
                    .draw("text 5,5 juziku.com");  
            op.addImage();  
            op.addImage();  
            ConvertCmd convert = new ConvertCmd();  
            // linux下不要设置此值，不然会报错  
            //convert.setSearchPath(imageMagickPath);  
            convert.run(op, srcPath, srcPath);  
        }




    }  