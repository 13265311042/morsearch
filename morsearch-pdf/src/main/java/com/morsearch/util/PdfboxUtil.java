package com.morsearch.util;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
//import org.apache.pdfbox.util.PDFTextStripper;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class PdfboxUtil {
    private  String  FTP_PORT;
    private  String  FTP_ADDRESS;
    private  String  FTP_USERNAME;
    private  String  FTP_PASSWORD;


    /**PDF转换文字例子
     * simply reader all the text from a pdf file.
     * You have to deal with the format of the output text by yourself.
     * 2008-2-25
     * @return all text in the pdf file
     */
/*    public static String getTextFromPDF(String pdfFilePath)
    {
        String result = null;
        FileInputStream is = null;
        PDDocument document = null;
        try {
            is = new FileInputStream(pdfFilePath);
            PDFParser parser = new PDFParser(is);
            parser.parse();
            document = parser.getPDDocument();
            PDFTextStripper stripper = new PDFTextStripper();
            result = stripper.getText(document);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (document != null) {
                try {
                    document.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return result;
    }*/

    public  static void main(String[] args)
    {
/*
        String str= pdfbox.getTextFromPDF("E:\\leoli/pdf/springMVC.pdf");
        System.out.println(str);
*/
        //   pdfbox app = new pdfbox();

        //     new File("/tmp/one/two/three").mkdir();

        //    app.pdf2img("e:\\11.pdf", "e:\\112",IMG_TYPE_PNG);

/*
        String str2= pdfbox.getTextFromPDF("E:\\leoli/pdf/Mybatis.pdf");
        System.out.println(str2);
*/
    }

    // public final  static String  IMG_TYPE_JPG = "jpg";
    public final  static String  IMG_TYPE_PNG = "png";


    public static int PDF2ImagPDFbox(String pdfPath,String savePath,String fid,String imgType) {
        String fileName = "";
        int x = 0;
        /*判断文件夹是否存在，不存在则建立*/
        File file = new File(savePath+fid+"/");
        if (!file.exists()) {file.mkdir();};

        PDDocument pdf = null;
        try {
            pdf = PDDocument.load(new File(pdfPath));
            PDFRenderer pdfRenderer = new PDFRenderer(pdf);
            PDPageTree pageTree = pdf.getPages();
            int pageCounter = 0;
            for(PDPage page : pageTree){
                float width = page.getCropBox().getWidth();
                float scale = 1.0f;
                if(width<800){
                    scale = (float) ((800/width)+0.2);
                }
                BufferedImage bim = pdfRenderer.renderImage(pageCounter,scale, ImageType.ARGB);
                String aa=savePath+fid+"/"+String.format("%04d",pageCounter+1)+".png";
                ImageIO.write(bim, "PNG", new File(savePath+fid+"/"+String.format("%04d",pageCounter+1)+".png"));
                pageCounter=pageCounter+1;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }

/*

    public int pdf2img(String pdfPath,String savePath,String fid,String imgType){
        String fileName = "";
        int x = 0;
        */
/*判断文件夹是否存在，不存在则建立*//*

        File file = new File(savePath+fid+"/");
        if (!file.exists()) {file.mkdir();};

        InputStream is = null;
        PDDocument pdDocument = null;
        readftpconfig();*/
/*读取配置*//*

        try {
            is = new BufferedInputStream(new FileInputStream(pdfPath));
            PDFParser parser = new PDFParser(is);
            parser.parse();
            pdDocument = parser.getPDDocument();

             List<PDPage> pages = pdDocument.getDocumentCatalog().getAllPages();
            x = pages.size();
            for (int i = 0; i < pages.size(); i++) {
           //     String saveFileName = savePath+fileName+String.format("%04d", i+1) +"."+imgType;
                PDPage page =  pages.get(i);
                pdfPage2Img(page,savePath,fid,String.format("%04d", i+1) +"."+imgType,imgType);
            }

*/
/*修改目录权限 begin*//*

            String command = "chown -R morsearch:morsearch " +savePath+fid+"/";
            Runtime runtime = Runtime.getRuntime();
            try {
                Process proc = runtime.exec(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
*/
/*修改目录权限 end*//*



        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(pdDocument != null){
                try {
                    pdDocument.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return x;

    }


    */
    /**
     * pdf页转换成图片
     * @throws IOException
     *//*

    public void pdfPage2Img(PDPage page,String savePath,String Fid,String FileName,String imgType) throws IOException{
        BufferedImage img_temp  = page.convertToImage();
    //    BufferedImage img_temp1 = resize(img_temp, (int)(img_temp.getWidth()*0.7),(int)(img_temp.getHeight()*0.7));//产生缩略图
        Iterator<ImageWriter> it = ImageIO.getImageWritersBySuffix(imgType);
        ImageWriter writer = (ImageWriter) it.next();
        ImageOutputStream imageout = ImageIO.createImageOutputStream(new FileOutputStream(savePath+Fid+"/"+FileName));
        writer.setOutput(imageout);
        writer.write(new IIOImage(img_temp, null, null));

*/
/*
        InputStream input = new FileInputStream(savePath+Fid+FileName);  //imgPath是图片的路径
        boolean result = FtpUtil.uploadFile(FTP_ADDRESS,Integer.parseInt(FTP_PORT),FTP_USERNAME,FTP_PASSWORD,"images_pdf",FileName,
                input);
*//*


    }
*/



    private static BufferedImage resize(BufferedImage source, int targetW,  int targetH) {
        int type=source.getType();
        BufferedImage target=null;
        double sx=(double)targetW/source.getWidth();
        double sy=(double)targetH/source.getHeight();
        if(sx>sy){
            sx=sy;
            targetW=(int)(sx*source.getWidth());
        }else{
            sy=sx;
            targetH=(int)(sy*source.getHeight());
        }
        if(type==BufferedImage.TYPE_CUSTOM){
            ColorModel cm=source.getColorModel();
            WritableRaster raster=cm.createCompatibleWritableRaster(targetW, targetH);
            boolean alphaPremultiplied=cm.isAlphaPremultiplied();
            target=new BufferedImage(cm,raster,alphaPremultiplied,null);
        }else{
            target=new BufferedImage(targetW, targetH,type);
        }
        Graphics2D g=target.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.drawRenderedImage(source, AffineTransform.getScaleInstance(sx, sy));
        g.dispose();
        return target;
    }


    /*读取 ftp配置*/
    private void readftpconfig(){
        Properties ftppps = new Properties();
        try {
            ftppps.load(PdfboxUtil.class.getResourceAsStream("/ftp.properties"));
            FTP_PORT=ftppps.getProperty("FTP_PORT");
            FTP_ADDRESS=ftppps.getProperty("FTP_ADDRESS");
            FTP_USERNAME=ftppps.getProperty("FTP_USERNAME");
            FTP_PASSWORD=ftppps.getProperty("FTP_PASSWORD");

        } catch (IOException e) {
            e.printStackTrace();
        }

    };



}