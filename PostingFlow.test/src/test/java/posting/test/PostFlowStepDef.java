package posting.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Assert;

//cucumber libraries
import cucumber.annotation.Before;
import cucumber.annotation.en.*;
import cucumber.junit.Cucumber;

//WebDriver libraries
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.internal.*;

//Appium libraries
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class PostFlowStepDef {

	IOSDriver<WebElement> driver;
	List<String> variables = new ArrayList<String>();
	List<String> values = new ArrayList<String>();	
	

	
	
	public void setupEnv(String env) throws Exception {
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		if(env.equalsIgnoreCase("local")) {
			desiredCapabilities.setCapability("deviceName", "TheVagabond");
	        desiredCapabilities.setCapability("platformVersion", "12.1.3");
	        desiredCapabilities.setCapability("udid", "0b56d307266091978fd3ee7b64248d9b8c260528");
	        desiredCapabilities.setCapability("app", "/Users/Aniket/Desktop/SminqAutomation/Sminq 2019-02-01 14-43-48.ipa");
	        desiredCapabilities.setCapability("automationName", "XCUITest");
	        //‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨Aniket⁩ ▸ ⁨Desktop⁩ ▸ ⁨SminqAutomation⁩
	       // desiredCapabilities.setCapability("noReset", "true");
	       // desiredCapabilities.setCapability("fullReset", "false");
	        desiredCapabilities.setCapability("autoAcceptAlert", true);
	        desiredCapabilities.setCapability("newCommandTimeout", 100000);
	        desiredCapabilities.setCapability("updatedWDABundleID", "com.WebDriverAgentRunner.*");
	        desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
	        desiredCapabilities.setCapability("xcodeOrgId", "XXPN5NHK97");
	        
	        driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
	        
	       
		}
		//else sauce-labs. Setting this up for now. But we can have multiple options.
		else if (env.equalsIgnoreCase("sauce")) 
		
		{
			desiredCapabilities.setCapability("testobject_api_key","CE17944D61E54E58BA4D9CB87F850C69");
	        desiredCapabilities.setCapability("testobject_device", "iPhone_6_free");
	        desiredCapabilities.setCapability("locationServicesEnabled", true);
	        driver = new IOSDriver<WebElement>(new URL("https://us1.appium.testobject.com/wd/hub"),desiredCapabilities);
	       
		}
		
		else
		{
			
			  String accessKey = "6xXym7ofsvwTkcPZtqKb";
			  String userName = "aniketdeshpande3";

			    
			    desiredCapabilities.setCapability("device", "iPhone 8 Plus");
			    desiredCapabilities.setCapability("os_version", "11");
			    desiredCapabilities.setCapability("app", "bs://<hashed app-id>");
			    

			     driver = new  IOSDriver<WebElement>(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);	
			
		}
	}
		
	
	@Given("^the Sminq Mobile App is opened on \"([^\"]*)\"$")
	public String the_Sminq_Mobile_App_is_open(String arg1) throws Throwable {
		String mode = arg1;
		setupEnv(arg1);
		 return mode; 
		
	}
	
	@When("^I allow \"([^\"]*)\" access$")
	public void I_allow_access(String arg1) throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		switch(arg1)
		{
		case "Notification":
			driver.switchTo().alert().accept();
			break;
			
		case "Google Sign In":
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			break;
			
		case "Sminq Location":
			
			waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("GIVE LOCATION PERMISSION")));
			driver.findElementByAccessibilityId("GIVE LOCATION PERMISSION").click(); 
			break;	
						
		case "iOS Location":
	
		driver.switchTo().alert().accept();
		break;
		
		case "Sminq Camera":
		
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("ENABLE CAMERA ACCESS")));	
		driver.findElementByAccessibilityId("ENABLE CAMERA ACCESS").click();
		break;
		
		case  "iOS Camera" :
		driver.switchTo().alert().accept();
		break;
		
		case "Sminq Microphone":
		
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("ENABLE MICROPHONE ACCESS")));	
		driver.findElementByAccessibilityId("ENABLE MICROPHONE ACCESS").click();
		break;
		
		case "iOS Microphone":
		driver.switchTo().alert().accept();
		break;
		
		}
		
	}
	
	@When("^I login with Google$")
	public void I_login_with_Google() throws Throwable {
		Properties prop = Locator.fetchLocator();
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		
		waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("googleLogin"))));
		driver.findElement(By.xpath(prop.getProperty("googleLogin"))).click();
	}
	
	@When("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void I_enter_as_username_and_as_password(String arg1, String arg2) throws Throwable {
		
		
		//Wait for Use Another account and click on Use another account
		Properties prop = Locator.fetchLocator();
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("useAnotherAccount"))));
		driver.findElement(By.xpath(prop.getProperty("useAnotherAccount"))).click();
		
		
		//Wait for email field and fill email address
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(prop.getProperty("emailField"))));
		driver.findElementByAccessibilityId(prop.getProperty("emailField")).click();	
		driver.findElementByAccessibilityId(prop.getProperty("emailField")).sendKeys(arg1);
		
		driver.findElementByAccessibilityId(prop.getProperty("closeKeyboardEmail")).click();
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(prop.getProperty("Next"))));
		driver.findElementByAccessibilityId(prop.getProperty("Next")).click();
		
		
		//Wait for password field and fill password
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(prop.getProperty("passwordField"))));
		driver.findElementByAccessibilityId(prop.getProperty("passwordField")).click();
		driver.findElementByAccessibilityId(prop.getProperty("passwordField")).sendKeys(arg2);
		
		waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("closeKeyboardPassword"))));
		driver.findElementByXPath(prop.getProperty("closeKeyboardPassword")).click();
		waitFor.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(prop.getProperty("Next"))));
		driver.findElementByAccessibilityId(prop.getProperty("Next")).click();
				
	}
		
	
	@Then("^the home page is displayed$")
	public void the_home_page_is_displayed() throws Throwable {
		Properties prop = Locator.fetchLocator();
	  Thread.sleep(7000);
	  Assert.assertTrue("Homepage Dispayed ", driver.findElementByAccessibilityId(prop.getProperty("camerIcon")).isDisplayed());
		
   	}
	
	@When("^I click on the camera icon to create a post$")
	public void I_click_on_the_camera_icon_to_create_a_post() throws Throwable {
		Properties prop = Locator.fetchLocator();
		driver.findElementByAccessibilityId(prop.getProperty("camerIcon")).click();
		driver.switchTo().alert().accept();

	}
	
	@When("^I click a photograph$")
	
	public void I_click_a_photograph() throws Throwable {
		Properties prop = Locator.fetchLocator();
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("clickButton"))));
		driver.findElementByXPath(prop.getProperty("clickButton")).click();
			
	}
	
	
	@When("^I select the first location as \"([^\"]*)\"$")
	public void I_select_the_first_location_as(String arg1) throws Throwable {
		Properties prop = Locator.fetchLocator();
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		variables.add(arg1);
		waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("myLocation"))));
		values.add(driver.findElementByXPath(prop.getProperty("myLocation")).getText());
		waitFor.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("myLocation"))));
		driver.findElementByXPath(prop.getProperty("myLocation")).click();
		
	}
	
	@When("^I select mood icon \"([^\"]*)\"$")
	public void I_select_mood_icon(String arg1) throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		switch (arg1) {
		
		case "DEAD":
			waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("moodIcon1")));
			driver.findElementByAccessibilityId("moodIcon1").click();
			break;
		case "MEH":
			waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("moodIcon2")));
			driver.findElementByAccessibilityId("moodIcon2").click();
			break;
		case "OKAY":
			waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("moodIcon3")));
			driver.findElementByAccessibilityId("moodIcon3").click();
			break;
		case "LIT":
			waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("moodIcon4")));
			driver.findElementByAccessibilityId("moodIcon4").click();
			break;
		case "DOPE":
			waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("moodIcon5")));
			driver.findElementByAccessibilityId("moodIcon5").click();
			break;
		}
	}
	
	@When("^I click on \"([^\"]*)\"$")
	public void I_click_on(String arg1) throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		
		switch(arg1) {
	    case "DONE":
	    	waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("DONE")));
	    	driver.findElementByAccessibilityId("DONE").click();
	    	break;
	    case "POST":
	    	waitFor.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("POST")));
	    	driver.findElementByAccessibilityId("POST").click();
	    	break;
	    }
	}
	
	@Then("^the post should be added to the home page$")
	public void the_post_should_be_added_to_the_home_page() throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		
		waitFor.until(ExpectedConditions.invisibilityOfElementLocated(MobileBy.AccessibilityId("ADD TO STORY")));
		
		Dimension dim = driver.manage().window().getSize();
		int x=100;
		int y1=(int)(dim.height*1.35);
		int y2=(int)(dim.height*0.15);
		//driver.swipe(x,y2,x,y1, 1000);
		Thread.sleep(4000);
		driver.swipe(100, 200, 100, 900, 2000);
		
		waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]")));
		//this is the xpath of 1st story //XCUIElementTypeTable/XCUIElementTypeCell[1]
		// should not be blank
	}
	
	@Then("^the location of the post should be \"([^\"]*)\"$")
	public void the_location_of_the_post_should_be(String arg1) throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")));
	    String loc = driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]").getText();

	    Assert.assertEquals(loc,values.get(variables.indexOf(arg1)));
	   
	    
	}
	
	@Then("^the mood of the post should be \"([^\"]*)\"$")
	public void the_mood_of_the_post_should_be(String arg1) throws Throwable {
		WebDriverWait waitFor = new WebDriverWait(driver,60);
		waitFor.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[6]")));
	    Assert.assertEquals(arg1, driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[6]").getText());
				
	}
	

}
