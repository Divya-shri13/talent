package Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import generic.BaSeClass;

public class Tricentis_electronics_chisri extends BaSeClass {
	WebDriver driver;

	public Tricentis_electronics_chisri(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("//a[@class='ico-login']");
	By email = By.xpath("//input[@class='email']");
	By pass = By.xpath("//input[@class='password']");
	By rember = By.xpath("(//input[@name='RememberMe'])[1]");
	By submit = By.xpath("//input[@class='button-1 login-button']");
	By accname = By.xpath("(//a[@class='account'])[1]");
	By electronics = By.xpath("//ul[@class='top-menu']/li[3]/a");
	By camera = By.xpath("(//div[@class='sub-category-item'])[1]");
	
	By display = By.cssSelector("#products-pagesize");
By prd = By.xpath("//img[@alt='Picture of 1MP 60GB Hard Drive Handycam Camcorder']");
By maill = By.xpath("//input[@class='button-2 email-a-friend-button']");
By frndml = By.xpath("//input[@class='friend-email']");
By textmssg = By.xpath("(//div[@class='inputs']/label[1])[3]");
By sendmil = By.xpath("//input[@class='button-1 send-email-a-friend-button']");
By elements = By.xpath("//div[@class='item-box']");
By filterbyprice500 = By.xpath("(//span[@class='PriceRange'])[2]");
By above500prod = By.xpath("(//span[@class='price actual-price'])[1]");

	public void tricenties() throws InterruptedException {
		// log in
		WebElement logn = driver.findElement(login);
		ClickMethods(logn);
	log.debug(" log in");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		// log in email
		WebElement mail = driver.findElement(email);
		SendkeysMethod(mail, "divyachilakabhathini@gmail.com");
		// password
		WebElement password = driver.findElement(pass);
		SendkeysMethod(password, "Tricentis@13");
		// remember checkbox
		WebElement remberme = driver.findElement(rember);
		ClickMethods(remberme);
//submit
		WebElement sub = driver.findElement(submit);
		ClickMethods(sub);
	
//useraccount name
		WebElement accnm = driver.findElement(accname);
		System.out.println(accnm.getText());
//eclectronics 
		WebElement electr = driver.findElement(electronics);
		Actions act = new Actions(driver);
		System.out.println(electr.getText());
		act.moveToElement(electr);
		ClickMethods(electr);
//sub option camera
		System.out.println(driver.getTitle());
		WebElement cam = driver.findElement(camera);
		ClickMethods(cam);
		// dispaly items are displaying as per the required functionality
		WebElement noofitems = driver.findElement(display);
		//int ItemCountDisplay = Integer.parseInt(noofitems.getText());

	//	int ItemCountList = driver.findElements(By.xpath("//div[@class='item-box']")).size();
//		if (ItemCountList == ItemCountDisplay) {
//			System.out.println("Number of items in the cart matches the displayed count.");
//		} else {
//			System.out.println("Number of items in the cart doesn't matches the displayed count.");
//
//		
		Select select = new Select(driver.findElement(By.id("products-pagesize")));
		select.selectByVisibleText("4");
		
	List<WebElement> gridprod = driver.findElements(elements);
	System.out.println(gridprod.size());
int  expectedproductsize = gridprod.size();
int actualproductsize = 4;
Assert.assertEquals(expectedproductsize, actualproductsize);

	for (WebElement webElement : gridprod) {
		System.out.println(webElement.getText());		
	}
	WebElement ele = driver.findElement(filterbyprice500);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,450)");
	ClickMethods(ele);
	double expectedproductprice = 500.00;
	WebElement product1 = driver.findElement(above500prod);
double   Actualproductprice = Double.parseDouble(product1.getText());
	if (Actualproductprice > expectedproductprice) {
		System.out.println("The sorting is correct");
	}else {
			System.out.println("There is bug in sorting");
	}
	
//		WebElement product = driver.findElement(prd);
//		ClickMethods(product);
//		WebElement emil = driver.findElement(maill);
//		ClickMethods(emil);
//		WebElement frd = driver.findElement(frndml);
//		SendkeysMethod(frd, "hgfuyfuyu");
//		Thread.sleep(3000);
//		WebElement text = driver.findElement(textmssg);
//		Thread.sleep(3000);
//		SendkeysMethod(text, "jhwgfycujwevhc");
//		WebElement submit1 = driver.findElement(sendmil);
//		ClickMethods(submit1);
	}
}