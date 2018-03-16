package packages;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import utility.constant;
import utility.ExcelReader;


public  class ODA extends Base{
	
	/*___________________________________________________________________
                   Verify that Home page should open
     ___________________________________________________________________*/
  
		
			
  @Test
  public  void TC_001()
  
  {
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	 
	   String Home_Actual=driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li/span")).getText(); 
	 if(Home_Actual.matches(constant.Home_Expected))
		{
		  try
		  {
			  
			FileInputStream file = new FileInputStream(constant.TestCaseLocation);
		  
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    int totalrows=sheet.getLastRowNum();
		    for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		       	
		       if(SelectedROW.getCell(0).getStringCellValue().equals("TC_001"))
		    	{
		    	   ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
		    	   ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    int totalrows=sheet.getLastRowNum();
		 for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		       	
		  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_001"))
		    {
		      ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
		   	  ExcelReader.setCellData("actual is : "+Home_Actual+" and expected is :"+constant.Home_Expected,i,constant.CommentField);
		      ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	 
	
  /*_________________________________________________________________  
           Verify that left section should be the news section
    _________________________________________________________________*/
    
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
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
	    for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	  	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_002"))
	    	{
	         
			 ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
			 ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
 	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
 	    int totalrows=sheet.getLastRowNum();
 	    for(int i=0;i<=totalrows;i++)
 	    {
 	    	XSSFRow SelectedROW=sheet.getRow(i);
 	    	
 	  	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_002"))
 	    	{
 	         
 	  		ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
 	  		ExcelReader.setCellData(m.getMessage(),i,constant.CommentField);
 			ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
 
 /*_________________________________________________________________________
 
          Verify that the right section should be of series selection
   __________________________________________________________________________*/
  
  
 @Test
 public void TC_003()
 
 {
	 
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	WebElement Series_Actual=driver.findElement(By.xpath("//*[@id='select_series']/div[1]/h2"));
		
  if(Series_Actual.getText().matches(constant.Series_Expected))
	{
			
	 try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
	    for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	  	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_003"))
	    	{
	 
	   		 ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
	   		 ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    int totalrows=sheet.getLastRowNum();
		for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		    	
		  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_003"))
		    {
		 	
		    ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
			ExcelReader.setCellData("Actual and expected value are not matched.Actual is :"+Series_Actual.getText()+" and Expected is :"+constant.Series_Expected,i,constant.CommentField);
			ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	

/*________________________________________________________________________
       Verify that on clicking choose a series, a drop down should display
  _______________________________________________________________________   */
 
 @Test
 public void TC_010()throws Exception 
 
   {
	
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	 try
	 {
	  
	  driver.findElement(By.xpath("//*[@id='arrow']")).click();
	if(driver.findElement(By.xpath(".//*[@id='menu_ul_home']")).isDisplayed())
	  {
	  try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
      for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
 	  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_010"))
	  	{ 
	  
	  	  ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
	  	  ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
     for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_010"))
	  	{ 
	  
		  ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
		  ExcelReader.setCellData(m.getMessage(),i,constant.CommentField);
		  ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	  	

 
   /*_____________________________________________________________________________
  
        Verify that this drop down should display two types of series:
	          - Leagues
	          - Internationals
    _______________________________________________________________________________*/
  
    
 @Test
  public void TC_011()
  
    {
	
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	  String FirstItem=driver.findElement(By.xpath(".//*[@id='1']/a/span")).getText();
	  String SecondItem=driver.findElement(By.xpath(".//*[@id='2']/a/span")).getText();
	  if(FirstItem.matches("LEAGUES"))
		  
	  {
		  if(SecondItem.matches("INTERNATIONALS"))
		  {
			try
			   {
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			  
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
			    int totalrows=sheet.getLastRowNum();
		     for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
		    	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_011"))
			  {   
		    	ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
		    	ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    int totalrows=sheet.getLastRowNum();
	     for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		    	
	    	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_011"))
	    	{
	    		 ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
				 ExcelReader.setCellData("Both items "+FirstItem+" and "+SecondItem+" does not exist on drop down box" ,i,constant.CommentField);
				 ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
						 
	
  /*______________________________________________________________________________
   Verify that in leagues drop down, Domestic/Leagues related series should display
   ________________________________________________________________________________*/  
  
 @Test
  public void TC_012()throws Exception 
  
    { 
	  
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	 try
	 
	   {
		  
		  driver.findElement(By.xpath(".//*[@id='1']/a/span")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  if(driver.findElement(By.xpath("//*[@id='subMenu1']")).isDisplayed())
		  {
			try
			{
				FileInputStream file = new FileInputStream(constant.TestCaseLocation);
			    XSSFWorkbook workbook = new XSSFWorkbook(file);
			    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
			    int totalrows=sheet.getLastRowNum();
		    for(int i=0;i<=totalrows;i++)
			    {
			    	XSSFRow SelectedROW=sheet.getRow(i);
			    	
			if(SelectedROW.getCell(0).getStringCellValue().equals("TC_012"))
			   { 	  	
				ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
				ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
				    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
				    int totalrows=sheet.getLastRowNum();
			    for(int i=0;i<=totalrows;i++)
				    {
				    	XSSFRow SelectedROW=sheet.getRow(i);
				    	
				if(SelectedROW.getCell(0).getStringCellValue().equals("TC_012"))
				   { 	 
					 ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
					 ExcelReader.setCellData(m.getMessage(),i,constant.CommentField);
					 ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
			
 
	
  /*______________________________________________________________________
    Verify that in internationals, international series should display
    _________________________________________________________________________*/
   
 
  @Test
  public void TC_013()throws Exception
  
    { 
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	try
	
	  {
	  
	  driver.get(constant.appUrl);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='arrow']")).click();
	  driver.findElement(By.xpath(".//*[@id='2']")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 if(driver.findElement(By.xpath("//*[@id='subMenu2']")).isDisplayed())
	  {
		  
	  try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
      for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_013"))
	  { 	   
	   ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
	   ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
     for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	  if(SelectedROW.getCell(0).getStringCellValue().equals("TC_013"))
	  { 	   
		  ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
		  ExcelReader.setCellData(m.getMessage(),i,constant.CommentField);
		  ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	 
	
 /*_______________________________________________________________________
  Verify that on clicking a particular series, it should redirect to the selected 
  series and fixtures of that series
  _________________________________________________________________________*/
  
  @Test
  public void TC_014()
  
    { 
	  
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='subMenu2']/div[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  String Actual_text=driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li[5]")).getText();
	  
	if(Actual_text.matches(constant.Text_Expected))
	 {
		 
	  try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
      for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_014"))
	  { 
	   ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
	   ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
		    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
		    int totalrows=sheet.getLastRowNum();
	      for(int i=0;i<=totalrows;i++)
		    {
		    	XSSFRow SelectedROW=sheet.getRow(i);
		    	
		if(SelectedROW.getCell(0).getStringCellValue().equals("TC_014"))
		  { 
			 ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
			 ExcelReader.setCellData("Expected element is not found on navigated page",i,constant.CommentField);
			 ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
    
  /*__________________________________________________________________
    Verify that left section should display the following fields:
	  - Globe icon
	  - Football home
	  - Search news box
	  - News images
	  - News pages
	  - Ads
	  - Standings module
   ____________________________________________________________________*/
   
  
  @Test
  public void TC_015()throws Exception 
  
    { 
	  
	  Date date = new Date();
	  SimpleDateFormat sdf = new SimpleDateFormat(constant.DateFormat);
	  String formattedDate = sdf.format(date);
	try
	  {
		  
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	if(driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li[1]/a/div")).isDisplayed())
	 {
	if(driver.findElement(By.xpath(".//*[@id='leftCol']/div[3]/news-widget-dir/div/div[2]/div/a/img")).isDisplayed())
	 {
	if(driver.findElement(By.xpath("//*[@id='leftCol']/div[3]/news-widget-dir/div/form/input[1]")).isDisplayed())
	 {
	if(driver.findElement(By.xpath(".//*[@id='leftCol']/div[3]/news-widget-dir/div/div[1]/div/div")).isDisplayed())
	 {
	if(driver.findElement(By.xpath("//*[@id='leftCol']/div[3]/news-widget-dir/div/dir-pagination-controls")).isDisplayed())
	{
	if(driver.findElement(By.xpath("//*[@id='leftCol']/div[4]/a/span")).isDisplayed())
	{
	  try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	    int totalrows=sheet.getLastRowNum();
     for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	if(SelectedROW.getCell(0).getStringCellValue().equals("TC_015"))
	  { 
	   ExcelReader.setCellData(constant.PassResult,i,constant.ResultStatus);
	   ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
	}
 }
 catch(Exception m)     
 {       	  
	  
  try
	   {
		FileInputStream file = new FileInputStream(constant.TestCaseLocation);
	  
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet(constant.sheet1);
	     int totalrows=sheet.getLastRowNum();
     for(int i=0;i<=totalrows;i++)
	    {
	    	XSSFRow SelectedROW=sheet.getRow(i);
	    	
	 if(SelectedROW.getCell(0).getStringCellValue().equals("TC_015"))
	  { 
		ExcelReader.setCellData(constant.FailResult,i,constant.ResultStatus);
		ExcelReader.setCellData(m.getMessage(),i,constant.CommentField); 
	    ExcelReader.setDateTime(formattedDate,i,constant.DateStatus);
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
  
