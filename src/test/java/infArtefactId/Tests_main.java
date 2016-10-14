package infArtefactId;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Tests_main {
	 public static RemoteWebDriver driver;
	@BeforeClass
	public void init(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public  void checkPageIsOpen() {
		driver.get("https://www.infusion.com");
		Assert.assertEquals(driver.getTitle(),"Infusion | www.infusion.com");
		WebElement footer = driver.findElementByXPath("//footer[contains(.,'Infusion')]");
		Assert.assertTrue("Footer is missing!",footer.isDisplayed());
	}
	
	@Test 
	public void contentOfHamburgerMenu(){
		driver.get("https://www.infusion.com");
		WebElement menu = driver.findElementByXPath("//small[@class='INF-mainMenu_icon']");
		Assert.assertTrue("Hamburger menu is disabled!",menu.isEnabled());
		menu.click();
		
		List<WebElement> hamburgerContent = driver.findElementsByXPath("//ul[@class='INF-mainMenu_link']/li/a");
		
	}

}
