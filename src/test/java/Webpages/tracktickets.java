package Webpages; 

import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import generic.BaSeClass;

public class tracktickets extends BaSeClass
{

	WebDriver driver;

	public tracktickets(WebDriver driver) {
		this.driver = driver;

}
	By tracticket = By.linkText("Track Ticket");
			//By.xpath("(//a[@class='btn  text tertiary md inactive button'])[4]");
			//By.cssSelector("#track-link");
	By ticket_details = By.xpath("//div[@class='row ']/h5");
	By booking_ID = By.xpath("//input[@placeholder='Please enter the booking ID']");
	By phone = By.xpath("//input[@placeholder='Please enter the mobile number']");
	By fQA = By.xpath("//div[@class='row card-header  lighter ']");
	By topbus = By.xpath("(//a[@class='btn  text primary sm inactive button'])[3]");
By travels = By.xpath("//a[text()='Mahalaxmi Travels']");
By soue = By.id("source");
By desti = By.id("destination");
By cale = By.cssSelector("#datepicker1");
By date = By.xpath("(//a[text()='29'])[1]");


public void tracticket() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
//	waits(driver, 5, tracticket);
	WebElement ele = driver.findElement(tracticket);
	ClickMethods(ele);
	
}
public void ticket_details() {
	System.out.println(driver.getTitle());
	String act = "Enter Ticket Details";
	WebElement text1 = driver.findElement(ticket_details);
	System.out.println(text1.getText());
	String text_1 = text1.getText();
	Assert.assertEquals(act, text_1);
}
public void  booking_ID() throws InterruptedException {
	Thread.sleep(1000);
	WebElement Id = driver.findElement(booking_ID);
SendkeysMethod(Id, "234578rtyy");
}
public void phone() {
//waits(driver, 10, booking_ID);
	WebElement number = driver.findElement(phone);
	SendkeysMethod(number, "34567891243");;
}

public void fQa() throws IOException {
	WebElement QA = driver.findElement(fQA);
	System.out.println(QA.getText());
	String text =  QA.getText();
	String fq = "Frequently Asked Questions";
	Assert.assertEquals(fq, text);
	takecreenshots("FQA");
	Actions act = new Actions(driver);
	   int scrollCount = 9;
	for (int i = 0; i <= scrollCount; i++) {
	    act.sendKeys(Keys.PAGE_DOWN).perform();
}
}
public void  topbus() {
	WebElement ele = driver.findElement(topbus);
	ClickMethods(ele);
	
	WebElement trs = driver.findElement(travels);
	ClickMethods(trs);	
	
	WebElement sc = driver.findElement(soue);
SendkeysMethod(sc, "Bangalore");;
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//waits(driver, 3, soue);
	
	WebElement ds = driver.findElement(desti);
	SendkeysMethod(ds, "Hyderabad");;
	//waits(driver, 3, desti);
	
	WebElement cl = driver.findElement(cale);
	ClickMethods(cl);
	
	WebElement dt = driver.findElement(date);
	ClickMethods(dt);
}





}


