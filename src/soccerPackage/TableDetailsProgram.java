package soccerPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDetailsProgram {
	
	//WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Arun Old System Data\\chromedriver.exe");
		
		TableDetailsProgram tableobj= new TableDetailsProgram();
		tableobj.PeopleSoft();
		tableobj.SitemapLinksCount();
		tableobj.TableDataProgram();
		
	}
	
void TableDataProgram()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.dhflpramerica.com/Eligibility/LifeInsurance/DHFL-Pramerica-Life-Cancer+Heart-Shield");
	System.out.println("Total Links Present On Page are : "+ driver.findElements(By.tagName("a")).size());
	WebElement tbl=driver.findElement(By.xpath("//table[@class='fund_table2']"));
	System.out.println("Total no of rows in the table :"+ tbl.findElements(By.tagName("tr")).size());
	System.out.println("==============================");
	List<WebElement> lstRows=tbl.findElements(By.tagName("tr"));
	int i=0;
	for(WebElement totalcol:lstRows )
{
		i++;
		List<WebElement> lstCol= totalcol.findElements(By.tagName("td"));
		System.out.println("Total no of Coloumns in "+i+ " Row are "+ totalcol.findElements(By.tagName("td")).size());
		for(WebElement eachcol:lstCol )
		{
			System.out.print(eachcol.getText()+"  ");
		}
		System.out.println("  ");
		System.out.println("==============================");
		
}
	
	driver.close();
	
}

void SitemapLinksCount() throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.dhflpramerica.com");
	System.out.println("Total Links on the page are :"+driver.findElements(By.tagName("a")).size());
	System.out.println("===================================");
	WebElement pluselement=driver.findElement(By.xpath("//span[@class='plus']"));
	int y=pluselement.getLocation().getY();
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0,"+y+")");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='plus']")).click();
	WebElement sitemap=driver.findElement(By.xpath("//div[@id='sitemapcontainer']"));
		//List<WebElement> lstsitemap=sitemap.findElements(By.xpath("//li[@class='subLinks']"));
		List<WebElement> lstsitemap=sitemap.findElements(By.tagName("a"));
		ArrayList<String> lstTotalLinks= new ArrayList<String>();
		for (WebElement lstelement: lstsitemap){
			String lstele=lstelement.getAttribute("href");
			//System.out.println(lstele);
					lstTotalLinks.add(lstele);
								
					}
		for(String str: lstTotalLinks)
		{
			driver.get(str);;
			System.out.println(str);
		}
		
	System.out.println("Total links in sitemap are:"+ lstsitemap.size());
	//for()
	driver.close();
}

void PeopleSoft()
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Arun Old System Data\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\arun.yadav\\Desktop\\abc.html");
	List<WebElement> totalTextBoxes=driver.findElements(By.xpath("//input[@type='text']"));
	String[] str={"A","B","C","D","E","F","G","H","I","J"};
	/// New line
    for (int i=0;i<totalTextBoxes.size();i++)
    {
    	//String str1=(String)str.charAt(i);
    	if(totalTextBoxes.get(i).isEnabled())
    	{
    	//String str1=str[i];
    	totalTextBoxes.get(i).sendKeys(str[i]);
    	}
    }
}

}


