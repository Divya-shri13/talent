package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.BaSeClass;

public class divya_ntlm  extends BaSeClass{
	
WebDriver driver;
public  divya_ntlm(WebDriver driver) {
	this.driver = driver;
}
By login =  By.id("notloggedin");
By mail = By.id("user-email");
By pass  = By.id("user-password");
By submit = By.xpath("//button[@type='submit']");
public void NTLMdivya() throws InterruptedException {
	WebElement log = driver.findElement(login);
	ClickMethods(log);
WebElement email = driver.findElement(mail);
waits(driver, 3, mail);
SendkeysMethod(email, "divyasrichilakabhathini@gmail.com");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement password = driver.findElement(pass);
SendkeysMethod(password, "code@13");
Thread.sleep(3000);
WebElement  sub = driver.findElement(login);
ClickMethods(sub);
}

}
