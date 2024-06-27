package Webpages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import generic.BaSeClass;

public class Workday_divya extends BaSeClass {
	WebDriver driver;

	public Workday_divya(WebDriver driver) {
		this.driver = driver;
	}

	By empsign_in = By.xpath("(//div[@data-automation-id='authSelectorOption'])[1]");
	By username = By.xpath("//input[@class='gwt-TextBox GDPVGE1BC3B']");
	By password = By.xpath("//input[@type='password']");
	By errormsg = By.xpath("//div[@class='gwt-Label GDPVGE1BDTC']");
	By sign_in = By.xpath("//button[text()='Sign In']");
	By checkbox = By.id("tdCheckbox");
	By ok = By.id("submitButton");
	By text = By.xpath("//input[@data-automation-id='globalSearchInput']");

	public void sigin() throws IOException, InterruptedException {
		WebElement sig = driver.findElement(empsign_in);
		ClickMethods(sig);
		WebElement uname = driver.findElement(username);
		SendkeysMethod(uname, "jagadeeshcv");
		WebElement pass = driver.findElement(password);
		SendkeysMethod(pass, "Tge@123456");
		WebElement submitt = driver.findElement(sign_in);
		ClickMethods(submitt);
		WebElement mssg = driver.findElement(errormsg);
		waits(driver, 5, errormsg);
		String ext = mssg.getText();
		String act = "Invalid user name or password, please try again. Note: You may not be able to change or reset your password from Workday if your account uses a corporate password.";
		Assert.assertEquals(ext, act);
		takecreenshots("error");
		System.out.println("The error message is displayed");
		driver.findElement(password).clear();
		SendkeysMethod(pass, "Tge@12345");
		WebElement submit = driver.findElement(sign_in);
		ClickMethods(submit);
		takecreenshots("login");
		WebElement select = driver.findElement(checkbox);
		ClickMethods(select);
		WebElement ko = driver.findElement(ok);
		ClickMethods(ko);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(6000);
		WebElement magnify = driver.findElement(text);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		
 //((JavascriptExecutor) driver).executeScript("arguments[0].value = 'Start proxy';", magnify);
 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", magnify);
		//SendkeysMethod(magnify, "Start");
Actions acts  = new Actions(driver);
//	acts.sendKeys(Keys.ARROW_LEFT).perform();
//	 acts.sendKeys(Keys.ENTER).perform();
magnify.sendKeys(Keys.ARROW_DOWN);
acts.sendKeys(Keys.ENTER).perform();
	}
}
