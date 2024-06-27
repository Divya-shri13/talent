package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import generic.BaSeClass;

public class Oyorooms_hyderabad_CHISRI extends BaSeClass {
	WebDriver driver;

	public Oyorooms_hyderabad_CHISRI(WebDriver driver) {
		this.driver = driver;
	}

	By location = By.xpath("(//div[@class='mddCityItem__cityItemWrapper'])[5]");
	By loc_field = By.id("autoComplete__home");
	By date = By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']/div/span[2]");
	By rooms = By.xpath(
			"//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold u-textEllipsis guestRoomPicker__guestRoomCount']");
	By magnify = By.xpath("//button[@class='u-textCenter searchButton searchButton--home']");
	By strtdate = By.xpath("(//span[text()=3])[3]");
	By enddate = By.xpath("(//span[text()=6])[2]");
	By increament = By.xpath("//span[@class='guestRoomPickerPopUp__plus']");

public void hyd() throws InterruptedException {
 Actions act = new Actions(driver);
// WebElement ele = driver.findElement(location);
// act.moveToElement(ele).perform();
 
 WebElement field = driver.findElement(loc_field);
 SendkeysMethod(field, "Gachibowli");
 
 field.sendKeys(Keys.ARROW_DOWN);
 Thread.sleep(2000);
 field.sendKeys(Keys.ENTER);
 
	WebElement dt = driver.findElement(date);
	waits(driver, 10, date);
	ClickMethods(field);
	Thread.sleep(3000);
	System.out.println("date field is popped out");
	
	WebElement stdt = driver.findElement(strtdate);
	waits(driver, 10, strtdate);
ClickMethods(stdt);

WebElement eddt = driver.findElement(enddate);
ClickMethods(eddt);

WebElement rm = driver.findElement(rooms);
ClickMethods(rm);
	
	WebElement inc = driver.findElement(magnify);
	ClickMethods(inc);
	
	WebElement search = driver.findElement(magnify);
	ClickMethods(search);
}

}
