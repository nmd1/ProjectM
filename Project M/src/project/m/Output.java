package project.m;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.IOException;
import java.awt.Desktop;

public class Output {
	 XWPFDocument document;
	 FileOutputStream out;
	public Output()throws Exception 
	   {
		   //Blank Document
		   document= new XWPFDocument(); 
		   //Write the Document in file system
		   out = new FileOutputStream(
		   new File("ProjectMOut.docx"));
		   document.write(out);
		   out.close();
		   
		   try {
			     if (Desktop.isDesktopSupported()) {
			       Desktop.getDesktop().open(new File("ProjectMOut.docx"));
			     }
			   } catch (IOException ioe) {
			     ioe.printStackTrace();
			   }
		 /* while(true){
		   XWPFParagraph paragraph = document.createParagraph();
		   XWPFRun run=paragraph.createRun();
		   run.setText(outputString);
		   document.write(out);
		   out.close();
		   }*/
		   
	   }
	public void enterText(char c)
	{
		XWPFParagraph paragraph = document.createParagraph();
		   XWPFRun run=paragraph.createRun();
		   run.setText(c+"");
		   try{
		   document.write(out);
		   out.close();
		   }catch(Exception e){}
	}
	
}

