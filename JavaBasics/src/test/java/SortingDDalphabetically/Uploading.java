package SortingDDalphabetically;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Uploading {

	@Test
	public void UploadFile() throws InterruptedException {

		/*
		 * String userDir = System.getProperty("user.dir"); WebDriver driver=new
		 * ChromeDriver(); String jacobArchitect
		 * =System.getProperty("sun.arch.data.model").contains("32") ?
		 * "jacob-1.18-x86.dll" : "jacob-1.18-x64.dll"; String jacobArchitectPath =
		 * userDir + "/"+jacobArchitect; File filejacob = new File(jacobArchitect);
		 * System.setProperty(LibraryLoader.JACOB_DLL_PATH,filejacob.getAbsolutePath());
		 * AutoItX uploadWin = new AutoItX(); driver = new FirefoxDriver();
		 * driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		 * Thread.sleep(1000); WebElement addFile =
		 * driver.findElement(By.xpath(".//input[@type='file']")).click();
		 */
		Thread.sleep(1000);
//
//		if (uploadWin.winWaitActive("File Upload", "", 5)) {
//			if (uploadWin.winExists("File Upload")) {
//				uploadWin.sleep(100);
//				uploadWin.send("/Users/neeraj.kumar/Desktop/c1.jpeg");
//				uploadWin.controlClick("File Upload", "", "&Open");
//
//			}
//		}
	}

}
