package infArtefactId;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Tests_main {
	 public static RemoteWebDriver driver;
	
	@Test
	public  void test1() {
		driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com");
		driver.findElementByXPath("//a[@class='sign-in']").click();
	}

}
