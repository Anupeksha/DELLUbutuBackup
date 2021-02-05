package SortingDDalphabetically;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyAlphabeticalOrderBySortMethod 
{

	@Test
	public void verifyDropdown() throws InterruptedException
	{

		//		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//		System.setProperty("webdriver.chrome.driver", arg1)
		WebDriver driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.qtpselenium.com/contact-us");

		WebElement dropdwn =driver.findElement(By.xpath("//*[@id='userCountry']"));
		Select s = new Select(dropdwn);
		List<WebElement> CountryDD=s.getOptions();

		ArrayList<String> originalList = new ArrayList<String>();

		for (int i=0;i<CountryDD.size();i++)
		{
			//System.out.println(webElement.getText());	
			originalList.add(CountryDD.get(i).getText());
		}
		System.out.println("Orginial list size : "+originalList.size());

		ArrayList<String> sort=originalList;
		Collections.sort(sort);
		System.out.println("Sorted list size : "+sort.size());

		//		for (int i = 0; i < sort.size(); i++) {
		//			System.out.println(sort.get(i));
		//		}

		for (int i = 0; i < originalList.size(); i++) 
		{
			String str=sort.get(i);
			if(originalList.get(i).equals(str))
			{
				System.out.println(originalList.get(i)+"   =   "+str);
			}
			else
			{
				System.out.println(originalList.get(i)+"   !=   "+str+"   ------   Mismatch found");
			}
		}

		driver.quit();
	}

}


