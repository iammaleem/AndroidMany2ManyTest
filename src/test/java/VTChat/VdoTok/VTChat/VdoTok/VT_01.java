package VTChat.VdoTok.VTChat.VdoTok;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import VTChat.VdoTok.DesiredCapability;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import vdotokPageObj.Smoke;

//import static io.appium.java_client.touch.TapOptions.tapOptions;
//import static io.appium.java_client.touch.offset.ElementOption.element;


public class VT_01 extends DesiredCapability  {
@Test
		public void SmokeTest() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AppiumDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Logger logger = Logger.getLogger("");
		
		//PropertyConfigurator.configure("/Users/aleem/Documents/vdotokWeb/log.properties");
		
		Smoke VdoTokSmoke = new Smoke(driver);
		
		/*
		String expectedtapSignup = "Sign In";
		String resulttapSignup = VdoTokSmoke.SignUpTitle.getText();
		AssertJUnit.assertEquals(resulttapSignup, expectedtapSignup, "Sign In");
		//System.out.println(resulttapAccommodation);
		System.out.println(resulttapSignup);
		*/

		WebDriverWait driverWait = new WebDriverWait (driver, 10);
		VdoTokSmoke.EnterUser.click();
		VdoTokSmoke.EnterUser.sendKeys("flutter@backend.com");
		VdoTokSmoke.EnterPassword.click();
		VdoTokSmoke.EnterPassword.sendKeys("12345678");
		driver.hideKeyboard();
		//driver.navigate().back();
		VdoTokSmoke.ClickSignUp.click();
		String expectedtitle = "Chat Rooms";
		String resulttapTitle = VdoTokSmoke.homeTitle.getText();
		AssertJUnit.assertEquals(resulttapTitle, expectedtitle, "Chat Rooms");

		logger.info("Screen Title is" + expectedtitle);


		if( VdoTokSmoke.homeTitle.isDisplayed() )
			{
			System.out.println("Landed on Home Screen");
			}
			else
			{
			System.out.println("Navigation Failed");

			}
		VdoTokSmoke.OpenGroup.click();
		logger.info("Group Opened");
		//logger.error("Accommodation button is not click able");
		//logger.debug("Test Action Button");
		VdoTokSmoke.CreateGroup.click();
		String expectedGroupTitle = "Create Group Chat";
		String resulttapGroupTitle = VdoTokSmoke.createGroupTitle.getText();
		AssertJUnit.assertEquals(resulttapGroupTitle, expectedGroupTitle, "Create Group Chat");
		logger.info("Screen Title is " + expectedGroupTitle);

		// System.out.println(expectedGroupTitle);
		VdoTokSmoke.SelectParticipantsA.click();
		logger.debug("Test Action Button");

		VdoTokSmoke.SelectParticipantsB.click();


		VdoTokSmoke.TickToCreateChat.click();
		VdoTokSmoke.enterGroupTitle.click();
		VdoTokSmoke.enterGroupTitle.sendKeys("Aleem@Norgic");
		logger.info("Screen Title is " + expectedGroupTitle);

		//driver.findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"About the accommodation & rules\").instance(0))");

		VdoTokSmoke.SaveTitle.click();
		VdoTokSmoke.startTyping.click();
		VdoTokSmoke.startTyping.sendKeys("Smoke test is in progress");
		VdoTokSmoke.sendMessage.click();
		VdoTokSmoke.startTyping.sendKeys("Thank You");
		VdoTokSmoke.sendMessage.click();

		//driver.findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"About the accommodation & rules\").instance(0))");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.hideKeyboard();
		driver.navigate().back();

		//driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\\\"LOG OUT\\\"]")));
		VdoTokSmoke.clickLogout.click();
		logger.info("User Logged Out Successfully");
		logger.debug("Test Action Button");
		}

		}