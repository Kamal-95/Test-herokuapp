import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class herokuapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\newchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		WebElement l=driver.findElement(By.cssSelector("input[type='file']"));
		Thread.sleep(2000);
	    l.sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\Chat1.png");
	    Thread.sleep(2000);
	    driver.findElement(By.id("file-submit")).click();
	    Thread.sleep(2000);
	    driver.get("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("File Download")).click();
	    Thread.sleep(2000);
	    String downloadfilepath="C:\\Users\\hp\\Pictures\\Screenshots";
	    HashMap<String,Object> chromePref =new HashMap<String,Object>();
	    chromePref.put("profile.default_content_settings.popups", 0);
	    chromePref.put("download.default_directory", downloadfilepath);
	    ChromeOptions options=new ChromeOptions();
	    options.setExperimentalOption("prefs", chromePref);
	    driver=new ChromeDriver(options);
	    driver.get("http://the-internet.herokuapp.com/download");
	    driver.findElement(By.linkText("Chat1.png")).click();
	    Thread.sleep(2000);
	    driver.get("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Multiple Windows")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Click Here")).click();
	    

	}

}
