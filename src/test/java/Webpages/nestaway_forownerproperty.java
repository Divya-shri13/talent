package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaSeClass;

public class nestaway_forownerproperty extends BaSeClass {
	WebDriver driver;
	
	public  nestaway_forownerproperty(WebDriver driver) {
		this.driver = driver;
	}
	By menu = By.xpath("//p[@class='w-8']");
	By login = By.xpath("//button[text()='Login']");
	By  logmail = By.xpath("//input[@placeholder='Email id/ Phone number']");
	By  contin = By.xpath("//button[text()='Continue']");
	By  passs = By.xpath("//input[@placeholder= 'Enter Password']");
	By log = By.xpath("//button[text()='Login']");
	By fieldname = By.xpath("//input[@placeholder='Name of the house owner']");
	By appartment = By.xpath("//div[text()='Apartment']");
	By no1 = By.xpath("//div[text()='1']");
	By dropdown = By.xpath("//span[@class='h-6 w-6 text-primary']");
	By bnglr = By.xpath("(//div[@class='h-6 w-6'])[1]");
	By loc = By.xpath("//input[@placeholder='Search Society ']");
	By  number  = By.xpath("//input[@placeholder='Enter valid phone number']");
	By pgcontii = By.xpath("//button[text()='CONTINUE']");
	By back = By.xpath("//div[@class='shadow-full order-1 w-full rounded-md bg-neutral-white p-4 xl:order-2 xl:w-3/5 xl:p-10']/div/button");
	
	
	public void owners(String email,String Password) throws InterruptedException {
		WebElement mnuicon = driver.findElement(menu);
		ClickMethods(mnuicon);
		WebElement open  = driver.findElement(login);
		ClickMethods(open);
		WebElement mailid = driver.findElement(logmail);
		//SendkeysMethod(mailid, "akhilasai0209@gmail.com");
		SendkeysMethod(mailid,email);
		WebElement  proceed = driver.findElement(contin);
		ClickMethods(proceed);
		WebElement password = driver.findElement(passs);
		//SendkeysMethod(password, "18701A0405#");
		SendkeysMethod(password, Password);
		WebElement contii = driver.findElement(log);
		ClickMethods(contii);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement namee  = driver.findElement(fieldname);
		namee.clear();
		SendkeysMethod(namee, "divya");
		WebElement app = driver.findElement(appartment);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", app);
		//ClickMethods(app);
		WebElement n1o = driver.findElement(no1);
		ClickMethods(n1o);
		WebElement down = driver.findElement(dropdown);
		ClickMethods(down);
		WebElement place = driver.findElement(bnglr);
		ClickMethods(place);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)");
		WebElement location = driver.findElement(loc);
		waits(driver, 3, loc);
		//((JavascriptExecutor) driver).executeScript("arguments[0].value = 'Epip';", location);
		SendkeysMethod(location, "Epip");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	Actions acts  = new Actions(driver);
	acts.sendKeys(Keys.ENTER).perform();
	acts.sendKeys(Keys.ARROW_DOWN).perform();
	acts.sendKeys(Keys.ENTER).perform();
	WebElement ele = driver.findElement(number);
	SendkeysMethod(ele, "8463942578");
	WebElement ele1 = driver.findElement(pgcontii);
	ClickMethods(ele1);
	try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//div[@class='mr-2 h-5 w-5 rotate-180']
	
	Thread.sleep(3000);
	WebElement ele3 = driver.findElement(back);
	ClickMethods(ele3);
	WebElement nameee  = driver.findElement(fieldname);
	js1.executeScript("window.scrollBy(0,-150)");
	nameee.clear();
	
	SendkeysMethod(nameee, "DivS");
//WebElement app = driver.findElement(appartment);
	
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", app);
	//ClickMethods(app);
	//WebElement n1o = driver.findElement(no1);
	
	ClickMethods(n1o);
	//WebElement down = driver.findElement(dropdown);
	
	ClickMethods(down);
	//WebElement place = driver.findElement(bnglr);
	ClickMethods(place);
//	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,300)");
	//WebElement location = driver.findElement(loc);
	waits(driver, 3, loc);
	location.clear();
	((JavascriptExecutor) driver).executeScript("arguments[0].value = 'Epip';", location);
	
ClickMethods(location);
acts.sendKeys(Keys.ENTER).perform();
acts.sendKeys(Keys.ARROW_DOWN).perform();
acts.sendKeys(Keys.ENTER).perform();
//WebElement ele = driver.findElement(number);
SendkeysMethod(ele, "8463942578");
//WebElement ele1 = driver.findElement(pgcontii);
ClickMethods(ele1);
System.out.println("regression also done perferctly");
		
	}
}
