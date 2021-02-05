import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnit 
{
	public static void main(String[] args)
	{
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://ui.freecrm.com");
		
	}

}
