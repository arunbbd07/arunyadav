package utility;



import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder.BorderSide;
import utility.constant;



public class ExcelReader 
{
	  
	  
	public static void setCellData(String Result,int RowNum,int Cellnum)
	{
	try {
    FileInputStream file = new FileInputStream(constant.TestCaseLocation);
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
    XSSFRow row = sheet.getRow(RowNum);
    XSSFCell cell=  row.getCell(Cellnum);  
    cell.setCellValue(Result);
    XSSFCellStyle cellstyle = workbook.createCellStyle();
    Font headerFont = workbook.createFont();
    headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
    
    if(Result==constant.PassResult)
    {
    	
    	headerFont.setColor(IndexedColors.GREEN.getIndex()); 
    	
    	
    }
    
    if(Result==constant.FailResult)
    {
    	
    	headerFont.setColor(IndexedColors.RED.getIndex());
    	
    }
     
    cellstyle.setFont(headerFont);
    cellstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);             
    cellstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);            
    cellstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);              
    cellstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
    cellstyle.setBorderColor(BorderSide.LEFT,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.RIGHT,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.TOP,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.BOTTOM,new XSSFColor(Color.BLACK));
    cell.setCellStyle(cellstyle);
    FileOutputStream fileOut = new FileOutputStream(constant.TestCaseLocation);
    workbook.write(fileOut);
    fileOut.flush();
    fileOut.close();	
    workbook.close();
    file.close();	
		}
		catch (IOException e) {
	        System.out.println(e.getMessage());
	        
	           }   	
}

	
	public static void setDateTime(String FormattedDate, int Drow, int Dcell) {
		
		try {
						
		    FileInputStream file = new FileInputStream(constant.TestCaseLocation);
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    XSSFRow row = sheet.getRow(Drow);
		    XSSFCell cell=  row.getCell(Dcell);  
		    cell.setCellValue(FormattedDate);
		    XSSFCellStyle cellstyle = workbook.createCellStyle();
		    cellstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);             
		    cellstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);            
            cellstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);              
            cellstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		    cellstyle.setBorderColor(BorderSide.LEFT,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.RIGHT,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.TOP,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.BOTTOM,new XSSFColor(Color.BLACK));
		    cell.setCellStyle(cellstyle);
		    FileOutputStream fileOut = new FileOutputStream(constant.TestCaseLocation);
		    workbook.write(fileOut);
		    fileOut.flush();
		    fileOut.close();	
		    workbook.close();
		    file.close();	
		    
		}
		catch (IOException e) {
	        System.out.println(e.getMessage());
	    } 
		
		
	}
	
	public static void setCellData_Teams(String Result,int RowNum,int Cellnum)
	{
	try {
    FileInputStream file = new FileInputStream(constant.TestCaseLocation);
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
    XSSFRow row = sheet.getRow(RowNum);
    XSSFCell cell=  row.getCell(Cellnum);  
    cell.setCellValue(Result);
    XSSFCellStyle cellstyle = workbook.createCellStyle();
    Font headerFont = workbook.createFont();
    headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
    
    if(Result==constant.PassResult)
    {
    	
    	headerFont.setColor(IndexedColors.GREEN.getIndex()); 
    	
    	
    }
    
    if(Result==constant.FailResult)
    {
    	
    	headerFont.setColor(IndexedColors.RED.getIndex());
    	
    }
     
    cellstyle.setFont(headerFont);
    cellstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);             
    cellstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);            
    cellstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);              
    cellstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
    cellstyle.setBorderColor(BorderSide.LEFT,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.RIGHT,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.TOP,new XSSFColor(Color.BLACK));
    cellstyle.setBorderColor(BorderSide.BOTTOM,new XSSFColor(Color.BLACK));
    cell.setCellStyle(cellstyle);
    FileOutputStream fileOut = new FileOutputStream(constant.TestCaseLocation);
    workbook.write(fileOut);
    fileOut.flush();
    fileOut.close();	
    workbook.close();
    file.close();	
		}
		catch (IOException e) {
	        System.out.println(e.getMessage());
	        
	           }   	
}

	
	public static void setDateTime_Teams(String FormattedDate, int Drow, int Dcell) {
		
		try {
						
		    FileInputStream file = new FileInputStream(constant.TestCaseLocation);
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
		    XSSFRow row = sheet.getRow(Drow);
		    XSSFCell cell=  row.getCell(Dcell);  
		    cell.setCellValue(FormattedDate);
		    XSSFCellStyle cellstyle = workbook.createCellStyle();
		    cellstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);             
		    cellstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);            
            cellstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);              
            cellstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
		    cellstyle.setBorderColor(BorderSide.LEFT,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.RIGHT,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.TOP,new XSSFColor(Color.BLACK));
		    cellstyle.setBorderColor(BorderSide.BOTTOM,new XSSFColor(Color.BLACK));
		    cell.setCellStyle(cellstyle);
		    FileOutputStream fileOut = new FileOutputStream(constant.TestCaseLocation);
		    workbook.write(fileOut);
		    fileOut.flush();
		    fileOut.close();	
		    workbook.close();
		    file.close();	
		    
		}
		catch (IOException e) {
	        System.out.println(e.getMessage());
	    } 
		
		
	}	
			
}
