package soccerPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetNoOfGoogleSearchResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNoOfGoogleSearchResults obj=new GetNoOfGoogleSearchResults();
		int[]arr1={2,5,8,50,1,58,3,4,49,5,11};
		int[]arr2={2,5,8,50,11,4,5,4,49,5,11,4};
		
		String[] strArray = {"xyz", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		obj.DuplicateElement(strArray);
		obj.BubbleSortProgram(arr1);
		obj.DuplicateElementInArray(arr2);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Arun Old System Data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");

		List<WebElement> searchResults = driver.findElements(By
				.linkText("issue tracker"));
		
				System.out.println("The Total Count are :" + searchResults.size());
		ArrayList<String> arrlst = new ArrayList<String>();
		/*
		for (int i = 0; i < searchResults.size(); i++) {
			System.out.println("The list item of " + i + ":"
					+ searchResults.get(i).getAttribute("href"));
			arrlst.add(searchResults.get(i).getAttribute("href"));

		}
		*/
		for(WebElement element:searchResults )
		{
			System.out.println("The URL is: "+element.getAttribute("href"));
			arrlst.add(element.getAttribute("href"));
			
		}

		// for(WebElement item :searchResults)
		for (String item : arrlst) {
			// searchResults.get(i).click();
			// String s1=item.getAttribute("href");
			// driver.get(s1);
			driver.navigate().to(item);
			String str = driver.getCurrentUrl();
			System.out.println(str);
			
		}
driver.close();
	}
void BubbleSortProgram(int[] arr)

{
	int arrsize= arr.length;
	for(int i=0;i<arrsize-1;i++)
	{
	for(int j=0;j<arrsize-i-1;j++)
	{
		if(arr[j]>arr[j+1])
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
	}
	for(int k=0;k<arrsize;k++)
	{
		System.out.print(arr[k]+" ");
	}
	
	
	}
void DuplicateElementInArray(int[]arr2)
{
	
	int arr2size=arr2.length;
	for(int l=0;l<arr2size-1;l++)
	{
		for(int m=l+1;m<arr2size;m++)
		{
		if((arr2[l]==arr2[m])&&(l!=m) )
		{
			System.out.println("The duplicate element is: "+arr2[m]);
		}
		}
	}
	
	/*
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int l=0;l<arr2.length;l++)
	{
		if(!hs.add(arr2[l]))
		{
			System.out.println("Duplicate Integer value is :"+arr2[l]);
		}
	}
	*/
	
	
	}
void DuplicateElement(String[]str)
{
	
HashSet<String> set = new HashSet<String>();

for (String arrayElement : str)
{
    if(!set.add(arrayElement))
    {
        System.out.println("Duplicate Element is : "+arrayElement);
    }
}
}    
	}

