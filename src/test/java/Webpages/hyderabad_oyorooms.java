package Webpages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaSeClass;

public class hyderabad_oyorooms extends BaSeClass {
	WebDriver driver;

	public hyderabad_oyorooms(WebDriver driver) {
		this.driver = driver;
	}
	
	By loc = By.xpath("//a[@href='/hotels-in-hyderabad/']");
	By title = By.xpath("//h1[@class='ListingContentHeader__h1']");
	By optdrop = By.xpath("//div[@class='dropdown']/span[2]");
	By  dropdownopt = By.xpath("(//li[@class='dropdown__item'])[3]/span");
	By  booknow = By.xpath("(//button[@class=\"c-1k6asfw d-greenButton\"])[1]");
	By title2 = By.xpath("//div[@class='c-i9gxme']");
	By name = By.xpath("(//input[@class='textInput__input'])[1]");
	By email = By.xpath("(//input[@class='textInput__input'])[2]");
	By phonenumber = By.xpath("(//input[@class='textTelInput__input textTelInput__input--noLabel textTelInput__input--margin'])[1]");
	By submit = By.xpath("//div[@class='c-1ogcbvc']/button");
	By back = By.xpath("//span[@class='c-1aivkbe']");
	By htlname = By.xpath("//h1[@class='c-1wj1luj']");
	By contiue = By.xpath("//button[@class='c-u65gu2']");
	By price = By.xpath("(//span[@class='c-2jict3'])[3]");
	By price2 = By.xpath("//div[@class='c-11tk0uk']");
public void oyo() throws InterruptedException {
	WebElement location = driver.findElement(loc);
	ClickMethods(location);
	
	driver.getTitle();
	WebElement text = driver.findElement(title);
	text.getText();
	WebElement sort = driver.findElement(optdrop);
	waits(driver, 6, optdrop);
	ClickMethods(sort);
	WebElement dropdown = driver.findElement(optdrop);
	ClickMethods(dropdown);
	
	WebElement low = driver.findElement(dropdownopt);
	ClickMethods(low);
	Actions a = new Actions(driver);
//	WebElement s = driver.findElement(By.xpath("//div[@class='input-range']"));
//	WebElement d = driver.findElement(By.xpath("(//div[@class='input-range__slider'])[2]"));
//	a.moveToElement(s).clickAndHold().dragAndDropBy(d, 0, 150).perform();

WebElement book = driver.findElement(booknow);
ClickMethods(book);

String mainWindow = driver.getWindowHandle();
Set<String> allWindows = driver.getWindowHandles();  
// returns string , get unique Id of current window
List<String> list = new ArrayList<String>(allWindows); // oraganisation of data
Iterator<String> i = allWindows.iterator(); // iterating 
while (i.hasNext()) {
	String childWindow = i.next();
	if (!(mainWindow.equals(childWindow))) {
		driver.switchTo().window(childWindow);
//		break;
	}
}	
	
		WebElement text2 = driver.findElement(title2);
		text2.getText();
		text2.getLocation();
		
		WebElement nme = driver.findElement(name);
		SendkeysMethod(nme, "Divya");
		
		WebElement emil = driver.findElement(email);
		SendkeysMethod(emil, "abcd@gmail.com");
		
		WebElement number = driver.findElement(phonenumber);
		SendkeysMethod(number, "2345678901");
		
		WebElement send = driver.findElement(submit);
		ClickMethods(send);
		
		WebElement bck = driver.findElement(back);
		ClickMethods(bck);
		
		WebElement hotel = driver.findElement(htlname);
		ClickMethods(hotel);
		
		Actions act = new Actions(driver);
		int scrollCount = 76;
		for (int z = 0; z<= scrollCount; z++) {
            act.sendKeys(Keys.PAGE_DOWN).perform();
            break;
        }
		 
		WebElement prce = driver.findElement(price);
				prce.getText();
				Thread.sleep(3000);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,1500)");
		WebElement contii = driver.findElement(contiue);
		ClickMethods(contii);
		
		WebElement prc2 = driver.findElement(price2);
		prc2.getText();
			
			
			
			
}
}
