import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
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


public class pdfbox {
    /**PDF转换文字例子
     * simply reader all the text from a pdf file.
     * You have to deal with the format of the output text by yourself.
     * 2008-2-25
     * @param pdfFilePath file path
     * @return all text in the pdf file
     */
    public static String getTextFromPDF(String pdfFilePath)
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
    }
    public  static void main(String[] args)
    {
/*
        String str= pdfbox.getTextFromPDF("E:\\leoli/pdf/springMVC.pdf");
        System.out.println(str);
*/
        pdfbox app = new pdfbox();

   //     new File("/tmp/one/two/three").mkdir();

        app.pdf2img("e:\\11.pdf", "e:\\112",IMG_TYPE_PNG);

/*
        String str2= pdfbox.getTextFromPDF("E:\\leoli/pdf/Mybatis.pdf");
        System.out.println(str2);
*/
    }

   // public final  static String  IMG_TYPE_JPG = "jpg";
    public final  static String  IMG_TYPE_PNG = "png";

    public void pdf2img(String pdfPath,String savePath,String imgType){
        String fileName = pdfPath.substring(pdfPath.lastIndexOf("\\")+1, pdfPath.length());
        fileName = fileName.substring(0,fileName.lastIndexOf("."));

        /*判断文件夹是否存在，不存在则建立*/
        File file = new File(savePath);
        if (!file.exists()) {file.mkdir();};

        InputStream is = null;
        PDDocument pdDocument = null;
        try {
            is = new BufferedInputStream(new FileInputStream(pdfPath));
            PDFParser parser = new PDFParser(is);
            parser.parse();
            pdDocument = parser.getPDDocument();

             List<PDPage> pages = pdDocument.getDocumentCatalog().getAllPages();
            for (int i = 0; i < pages.size(); i++) {
                String saveFileName = savePath+"\\"+fileName+String.format("%04d", i+1) +"."+imgType;
                PDPage page =  pages.get(i);
                pdfPage2Img(page,saveFileName,imgType);
            }
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
    }


    /**
     * pdf页转换成图片
     * @param page
     * @param saveFileName
     * @throws IOException
     */
    public void pdfPage2Img(PDPage page,String saveFileName,String imgType) throws IOException{
        BufferedImage img_temp  = page.convertToImage();
     //   BufferedImage img_temp1 = resize(img_temp, (int)(img_temp.getWidth()*0.8),(int)(img_temp.getHeight()*0.8));//产生缩略图
        Iterator<ImageWriter> it = ImageIO.getImageWritersBySuffix(imgType);
        ImageWriter writer = (ImageWriter) it.next();
        ImageOutputStream imageout = ImageIO.createImageOutputStream(new FileOutputStream(saveFileName));
        writer.setOutput(imageout);
        writer.write(new IIOImage(img_temp, null, null));
    }



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


}