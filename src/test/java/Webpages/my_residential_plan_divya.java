package Webpages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import generic.BaSeClass;

public class my_residential_plan_divya extends BaSeClass{

	WebDriver driver;

	public my_residential_plan_divya(WebDriver driver) {
		this.driver = driver;
	}
	
By login =  By.xpath("(//div[text()='Log in'])[1]");
By  phone_no = By.xpath("(//input[@class='form-control'])[1]");
By  contie = By.id("signUpSubmit");
By radiopass = By.xpath("(//label[@class='nb-radio radio-inline'])[2]");
By password = By.id("login-signup-form__password-input");
By xmark = By.xpath("//div[text()='x']");
By profile = By.id("profile-icon");
By myresedential_dropdown = By.xpath("(//span[@class='float-right'])[1]");
By subopt = By.xpath("//a[text()='For Tenants']");
By subcribe = By.xpath("(//button[@class='btn  nb__H72T-'])[2]");
By amount = By.xpath("(//span[text()='₹4,128.82'])[2]");
By owners = By.linkText("For Owners");
By ownertxt  = By.xpath("//span[@class='block text-28 text-bluish-grey']");
By click = By.xpath("//span[text()='Super Relax']");
public void login() throws InterruptedException, IOException {
	//login in the page
	WebElement icon = driver.findElement(login);
	ClickMethods(icon);
	waits(driver, 3, login);
	Thread.sleep(5000);
	WebElement number = driver.findElement(phone_no);
	SendkeysMethod(number, "8463942578");
	 waits(driver, 4, contie);
	WebElement cnt = driver.findElement(contie);
	ClickMethods(cnt);
	
	//waits(driver, 10, login);
	Thread.sleep(10000);
	WebElement radio = driver.findElement(radiopass);
	ClickMethods(radio);
	waits(driver, 3, radiopass);
	Thread.sleep(1000);
	WebElement pass = driver.findElement(password);
	SendkeysMethod(pass, "divy1628");
	waits(driver, 3, password);
	WebElement conti = driver.findElement(contie);
	ClickMethods(conti);
//	WebElement x = driver.findElement(xmark);
//	ClickMethods(x);
	Thread.sleep(1000);
	log.debug("login in the page");
	//profile 
	WebElement picon = driver.findElement(profile);
	ClickMethods(picon);
	Thread.sleep(5000);
	Actions actions = new Actions(driver);
	log.debug("profile click");
	//clicking on the dropdown
	WebElement QA = driver.findElement(myresedential_dropdown);
	actions.moveToElement(QA).click().perform();
	waits(driver, 3, subopt);
	log.debug("clicking on the dropdown");
	//choosing suboption
	WebElement subp = driver.findElement(subopt);
	actions.moveToElement(subp).click().perform();
	Thread.sleep(5000);
	log.debug("choosing suboption");
	//another window opens
	String mainWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();  
	// returns string , get unique Id of current window
	List<String> list = new ArrayList<String>(allWindows); // oraganisation of data
	Iterator<String> i = allWindows.iterator(); // iterating 
	while (i.hasNext()) {
		String childWindow = i.next();
		if (!(mainWindow.equals(childWindow))) {
			driver.switchTo().window(childWindow);
//			break;
		}
	}
//clicking on subscribe button 

	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)");
	WebElement subscri = driver.findElement(subcribe);
	ClickMethods(subscri);
	//clicking on amount
	WebElement money = driver.findElement(amount);
String exp = 	money.getText();
	String act = "₹4,128.82";
	Assert.assertEquals(exp, act);
	System.out.println("the price is same");
	Thread.sleep(5000);
	//moving back to mAIN window 
	driver.switchTo().window(mainWindow);
	
	WebElement picon1= driver.findElement(profile);
	ClickMethods(picon1);
	WebElement QA1 = driver.findElement(myresedential_dropdown);
	actions.moveToElement(QA1).click().perform();
	waits(driver, 3, subopt);
	WebElement subp2 = driver.findElement(owners);
	actions.moveToElement(subp2).click().perform();
	Thread.sleep(5000);
takecreenshots("2ndwindow");
	
Set<String> set = driver.getWindowHandles(); 
	 
	List<String> index = new ArrayList<String>(set);
	Iterator<String> I = set.iterator();
String parent = driver.getWindowHandle();
System.out.println(driver.getTitle());
	while (I.hasNext()) {
		driver.switchTo().window(index.get(2));
		System.out.println(index.size());
//		break;
	}
	}
public void ndpage() {
	

WebElement clc = driver.findElement(click);
ClickMethods(clc);
	WebElement trt = driver.findElement(ownertxt);
     String str =  trt.getText();
    System.out.println(str);
}

}

