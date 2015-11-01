package project.m;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.IOException;
import java.awt.Desktop;

public class Output {
	
	public static void CreateNew()throws Exception 
	   {
		   //Blank Document
		   XWPFDocument document= new XWPFDocument(); 
		   //Write the Document in file system
		   FileOutputStream out = new FileOutputStream(
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
		   while(true){
		   XWPFParagraph paragraph = document.createParagraph();
		   XWPFRun run=paragraph.createRun();
		   run.setText(outputString);
		   document.write(out);
		   out.close();
		   }
	   }}

