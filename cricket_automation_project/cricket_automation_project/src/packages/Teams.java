package packages;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.ExcelReader;
import utility.constant;


public class Teams extends Base {
		
   @Test
  public void TC_001() throws Exception  {
	  
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	   
	    driver.navigate().to(constant.appUrl);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='arrow']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='2']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='subMenu2']/div[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='rightCol']/div/div[1]/div[1]/a[4]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Actual_TeamText=driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li[5]")).getText();	
		
		if(Actual_TeamText.matches(constant.Expected_TeamText))
		 {
	  
			 try
			   {
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  System.out.println("yo");
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
			    int totalrows=sheet.getLastRowNum();
		      for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
			if(SelectedROW.getCell(0).getStringCellValue().equals("TC_001"))
			  { 
			   ExcelReader.setCellData_Teams(constant.PassResult,i,constant.ResultStatus);
			   ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
			   break;
			  }
			  }
		      workbook.close();
		      file.close();	
		      }
		     catch(IOException e){
		    		
		    	 System.out.println(e.getMessage());
		     }    
			 }
		else
		 {
			 try
			   {
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
			    int totalrows=sheet.getLastRowNum();
		      for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
			if(SelectedROW.getCell(0).getStringCellValue().equals("TC_001"))
			  { 
				 ExcelReader.setCellData_Teams(constant.FailResult,i,constant.ResultStatus);
				 ExcelReader.setCellData_Teams("Expected element is not found on navigated page",i,constant.CommentField);
				 ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
			     break;
			  }
			  }
		      workbook.close();
		      file.close();	
		      }
		     catch(IOException e){
		    		
		    	 System.out.println(e.getMessage());
		     }    
		 } 
		
  }
  
   
  
 /* verify that left section should be news section*/
  
   
  
  @Test
  public void TC_002() throws Exception 
  
  {
 	  
 	  Date date = new Date();
 	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
 	  String formattedDate = sdf.format(date);
 	try
 	{
 	 WebElement News_Actual=driver.findElement(By.xpath("//*[@id='leftCol']/div[1]/span"));
 	
 	 if(News_Actual.isDisplayed())
 	 {
 		 
 	  try
 	   {
 		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
 	  
 	    XSSFWorkbook workbook = new XSSFWorkbook(file);
 	    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
 	    int totalrows=sheet.getLastRowNum();
 	    for(int i=0;i<=totalrows;i++)
 	    {
 	    	XSSFRow SelectedROW=sheet.getRow(i);
 	    	
 	  	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_002"))
 	    	{
 	         
 			 ExcelReader.setCellData_Teams(constant.PassResult,i,constant.ResultStatus);
 			 ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
 			   break;
 			}
 	    }
 	    workbook.close();
 	    file.close();
 	   }
 	  catch(IOException e){
 			
 			 System.out.println(e.getMessage());
 	  }
 	  
       } 
 	}
 		
    catch(Exception m)
 	  {
     	
     	try
  	   {
  		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
  	  
  	    XSSFWorkbook workbook = new XSSFWorkbook(file);
  	    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
  	    int totalrows=sheet.getLastRowNum();
  	    for(int i=0;i<=totalrows;i++)
  	    {
  	    	XSSFRow SelectedROW=sheet.getRow(i);
  	    	
  	  	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_002"))
  	    	{
  	         
  	  		ExcelReader.setCellData_Teams(constant.FailResult,i,constant.ResultStatus);
  	  		ExcelReader.setCellData_Teams(m.getMessage(),i,constant.CommentField);
  			ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
  			   break;
  			}
  	    }
  	    workbook.close();
  	    file.close();
  	   }
  	  catch(IOException e){
  			
  			 System.out.println(e.getMessage());
  	  }	
     	
   } 
 	
  }	 
  
    /*Verify that the teams section consists of the
  - country flag on top right corner 
  - coach's picture on the bottom right corner
  - displays the coach name 
  - World Ranking from the database.*/
  
   
  @Test
    public void TC_005() throws Exception 
  
  {
	 
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	    String formattedDate = sdf.format(date);
		driver.findElement(By.xpath(".//*[@id='team_menu']/div/div/ul/li[1]/a/div[2]")).click();	  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	  
		WebElement countryFlag=driver.findElement(By.xpath(".//*[@id='summary']/div[1]/div[1]/h3/div[1]/img"));
		WebElement coachPicture=driver.findElement(By.xpath(".//*[@id='summary']/div[1]/div[1]/div/div/table/tbody/tr[1]/td[1]/img"));
		WebElement coachName=driver.findElement(By.xpath(".//*[@id='summary']/div[1]/div[1]/div/div/table/tbody/tr[1]/td[2]"));
		WebElement worldRanking=driver.findElement(By.xpath(".//*[@id='summary']/div[1]/div[1]/div/div/table/tbody/tr[5]/td[1]"));
		try
		  {
			if(countryFlag.isDisplayed())
			 {
			if(coachPicture.isDisplayed())
			 {
			if(coachName.isDisplayed())
			 {
			if(worldRanking.isDisplayed()) 
			{
				
				try
				   {
					FileInputStream file = new FileInputStream(constant.TestCaseLocation);
				  
				    XSSFWorkbook workbook = new XSSFWorkbook(file);
				    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
				    int totalrows=sheet.getLastRowNum();
			     for(int i=0;i<=totalrows;i++)
				    {
				    	XSSFRow SelectedROW=sheet.getRow(i);
				    	
				if(SelectedROW.getCell(0).getStringCellValue().equals("TC_005"))
				  { 
				   ExcelReader.setCellData_Teams(constant.PassResult,i,constant.ResultStatus);
				   ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
				   break;
				   }
				   }
			     workbook.close();
			     file.close();	
			     }
			    catch(IOException e){
			    		
			    	 System.out.println(e.getMessage());
			    } 
				}
				}
				}
				}
				}
		 catch(Exception m)     
		 {       	  
			 try
			   {
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
			     int totalrows=sheet.getLastRowNum();
		     for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
			 if(SelectedROW.getCell(0).getStringCellValue().equals("TC_005"))
			  { 
				ExcelReader.setCellData_Teams(constant.FailResult,i,constant.ResultStatus);
				ExcelReader.setCellData_Teams(m.getMessage(),i,constant.CommentField); 
			    ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
			    break;
			   
			   }
			   }
		   workbook.close();
		   file.close();	
		   }
		  catch(IOException e){
		  		
		  	 System.out.println(e.getMessage());

		 }
		 }
  
  }
   
   
  
/*Verify that it should open the page with followings:  
  Summary  
  Tournament*/
  
    
  @Test
  public void TC_006() throws Exception 
  
  {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
    String formattedDate = sdf.format(date);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String App_summary=driver.findElement(By.xpath(".//*[@id='rightCol']/div/div[2]/div[3]/div[1]/ul/li[1]/a")).getText();
	String App_tournament=driver.findElement(By.xpath(".//*[@id='rightCol']/div/div[2]/div[3]/div[1]/ul/li[2]/a")).getText();
	 if(App_summary.matches(constant.Var_summary))
		  
	  {
		  if(App_tournament.matches(constant.Var_tournament))
		  {
			try
			   {
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
			    int totalrows=sheet.getLastRowNum();
		     for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
		    	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_006"))
			  {   
		    	ExcelReader.setCellData_Teams(constant.PassResult,i,constant.ResultStatus);
		    	ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
		    	break;
			  }
			    }
		     workbook.close();
		     file.close();	
		     }
		    catch(IOException e){
		 		
		 	 System.out.println(e.getMessage());
		    }
		  }
	  }
	 else
	  {
		  try
		   {
			FileInputStream file = new FileInputStream(constant.TestCaseLocation);
		  
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
		    int totalrows=sheet.getLastRowNum();
	     for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		    	
	    	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_006"))
	    	{
	    		 ExcelReader.setCellData_Teams(constant.FailResult,i,constant.ResultStatus);
				 ExcelReader.setCellData_Teams("Both items "+App_summary+" and "+App_tournament+" does not exist" ,i,constant.CommentField);
				 ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
				  break;
	    	}
	  
		    }
	     workbook.close();
	     file.close();	
	     }
	    catch(IOException e){
	 		
	 	 System.out.println(e.getMessage());
	    }
	  }
	 }  

    
 /* Verify that the default tab should be Summary tab.*/
    
    
  @Test
  public void TC_007() throws Exception 
  
  {
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	    String formattedDate = sdf.format(date);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try
	  {
			
	    if(driver.findElement(By.xpath(".//*[@id='summary']/div[1]")).isDisplayed())
		{
			try
			{
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
			    int totalrows=sheet.getLastRowNum();
		     for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
			if(SelectedROW.getCell(0).getStringCellValue().equals("TC_007"))
			  { 
			   ExcelReader.setCellData_Teams(constant.PassResult,i,constant.ResultStatus);
			   ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
			   break;
			   }
			   }
		     workbook.close();
		     file.close();	
		     }
	      
		    catch(IOException e){
		    		
		    	 System.out.println(e.getMessage());
		    } 
	  }
    }
   catch(Exception m)     
	   {       	  
		 try
		   {
			FileInputStream file = new FileInputStream(constant.TestCaseLocation);
		  
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet(constant.sheet2);
		     int totalrows=sheet.getLastRowNum();
	     for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		    	
		 if(SelectedROW.getCell(0).getStringCellValue().equals("TC_007"))
		  { 
			ExcelReader.setCellData_Teams(constant.FailResult,i,constant.ResultStatus);
			ExcelReader.setCellData_Teams(m.getMessage(),i,constant.CommentField); 
		    ExcelReader.setDateTime_Teams(formattedDate,i,constant.DateStatus);
		    break;
		   
		   }
		   }
	     
	   workbook.close();
	   file.close();	
	   }
	  catch(IOException e){
	  		
	  	 System.out.println(e.getMessage());

	 }
	 }
}
 
  
}   