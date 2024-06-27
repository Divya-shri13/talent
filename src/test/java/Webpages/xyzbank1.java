package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.BaSeClass;

public class xyzbank1 extends BaSeClass {
	WebDriver driver ;
	public xyzbank1(WebDriver driver) {
	this.driver = driver;
	}
By managerlogin = By.linkText("Bank Manager Login");
By addcustomer  = By.xpath("//button[@ng-class='btnClass1']");
By firstname  = By.xpath("//input[@placeholder='First Name']");    
By lastname = By.xpath("(//div[@class='form-group'])[2]/input");
By codepost = By.xpath("//input[@placeholder='Post Code']");
By buttonaddcustomer = By.linkText("Add Customer");
By openacunt = By.xpath("//button[@ng-class='btnClass2']");
By submitbutton = By.linkText("Process");
By Customer = By.xpath("//button[@ng-class='btnClass3']");
public void scenario1() {
	//click on managerlogin button
	WebElement bankmagerlogin = driver.findElement(managerlogin);
ClickMethods(bankmagerlogin);
//click on add customer 
WebElement addcustm = driver.findElement(addcustomer);
ClickMethods(addcustm);
 // enter the 1st name 
 WebElement namefirst = driver.findElement(firstname);
 SendkeysMethod(namefirst, "divya");
 // enter the last name 
 WebElement namelast = driver.findElement(lastname);
 SendkeysMethod(namelast, "sri");
 //postcode
 WebElement postcode = driver.findElement(codepost);
 SendkeysMethod(postcode, "507003");
 //click on add customer 
 WebElement addcustomerbutton = driver.findElement(buttonaddcustomer);
 ClickMethods(addcustomerbutton);
 //click on open account 
 WebElement  openaccount = driver.findElement(openacunt);
 ClickMethods(openaccount);
 //SELECT THE customer.
 Select select = new Select(driver.findElement(By.id("userSelect")));
	select.selectByVisibleText("divya sri");
	//select currency 
	Select selct = new Select(driver.findElement(By.id("currency")));
	selct.selectByIndex(3);
//click on process button
	WebElement process = driver.findElement(submitbutton);
	ClickMethods(process);
	
	
}
}