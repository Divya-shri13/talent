package Webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import generic.BaSeClass;

public class luma extends BaSeClass {
	WebDriver driver;

	public luma(WebDriver driver) {
		this.driver = driver;
	}

	By sign = By.xpath("//div[@class='panel header']/descendant::a[2]");
	By mail = By.id("email");
	By password = By.id("pass");
	By signin = By.xpath("(//span[text()='Sign In'])[1]");
	By gear_op = By.xpath("//span[text()='Gear']");
By bag = By.xpath("(//li[@class='item'])[1]");
By bagText = By.xpath("(//a[text()='Bags'])[1]");
By styledropdown =  By.xpath("(//div[@class='filter-options-title'])[1]");
By backpack = By.xpath("(//li[@class='item'])[3]/a");
By styledropdownprice = By.xpath("(//div[@class='filter-options-title'])[1]");
By priceoption = By.xpath("(//li[@class='item'])[2]/a");
By product = By.xpath("(//li[@class='item product product-item'])[1]");
 By driven_backpack = By.xpath("(//img[@class='product-image-photo'])[1]");
 By cart = By.xpath("//a[@class='action showcart']");
 By costbefore = By.xpath("(//span[@class='price'])[1]");
 By crticn = By.xpath("//div[@class='block block-minicart ui-dialog-content ui-widget-content']");
 By checkout = By.id("top-cart-btn-checkout");
 By next = By.xpath("//button[@class='button action continue primary']");
 By errormssg = By.xpath("//div[@class='message notice']");
	public void luma_magento(String username,String userkey) throws InterruptedException, IOException, AWTException {
		WebElement sig = driver.findElement(sign);
		waits(driver, 5, sign);
		sig.click();
		
		Thread.sleep(5000);
	log.debug("click on sign in ");
		WebElement email = driver.findElement(mail);
		waits(driver, 5, mail);
		Thread.sleep(5000);
		//SendkeysMethod(email, "divyachilakabhathini@gmail.com");
		SendkeysMethod(email, username);
		Thread.sleep(5000);
		WebElement pass = driver.findElement(password);
		Thread.sleep(000);
		
	//SendkeysMethod(pass, "Testing@13");
	
		SendkeysMethod(pass, userkey);
		takecreenshots("loginpage magento");
		log.debug("enetered credentials ");
		WebElement check = driver.findElement(signin);
		Thread.sleep(3000);
		check.click();
		log.debug("clicked on signing");
		WebElement grop = driver.findElement(gear_op);
		Actions act = new Actions(driver);
		act.moveToElement(grop);
		takecreenshots("hovering on the gear ");
		grop.click();
		log.debug("clciked on gEAR OPTION ");
		WebElement firststitem = driver.findElement(bag);
		System.out.println(firststitem.getText());
		WebElement firststitemtext = driver.findElement(bagText) ;	
		firststitemtext.click();
		log.debug("bag in selection option");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", bag);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement dropdownstyle = driver.findElement(styledropdown);
		dropdownstyle.click();
		log.debug("clicked on style");
		WebElement packbag = driver.findElement(backpack);
		packbag.click();
		log.debug("clicked on backpack");
		WebElement price = driver.findElement(styledropdownprice);
		price.click();
		log.debug("clicked  on price dropdown ");
		WebElement optionprice = driver.findElement(priceoption);
		optionprice.click();
		log.debug("choosed price ");
		List<WebElement> prod = driver.findElements(product);
		System.out.println(prod.size());

		// Launch Notepad using Runtime class
        Runtime.getRuntime().exec("notepad.exe");
        log.debug("notepad is opened");
        // Delay to ensure Notepad is launched
        Thread.sleep(2000);

        // Create a StringBuilder to store all text from elements
        StringBuilder stringBuilder = new StringBuilder();	
        for (WebElement webElement : prod) {
			//System.out.println(webElement.getText());	
        	  // Copy data to clipboard
            StringSelection stringSelection = new StringSelection(stringBuilder.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            //  CTRL + V to paste data into Notepad using Robot class
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Runtime.getRuntime().exec("taskkill /f /im notepad.exe");
         //  js.executeScript("window.scrollBy(0,350)");
            Thread.sleep(5000);
           // WebElement drirvenbag = driver.findElement(driven_backpack);
            WebElement ele = driver.findElement(product);
            Thread.sleep(5000);
            ele.click();
            log.debug(" clicked on product ");
            WebElement beforecost = driver.findElement(costbefore);
            Thread.sleep(7000);
            String str1 = beforecost.getText();
           System.out.println("str1");
           WebElement carticon = driver.findElement(cart);
           carticon.click(); 
           log.debug(" clicked on cart ");
          List< WebElement> iconcart = driver.findElements(crticn);
          System.out.println(iconcart.size());
          
           WebElement checkouting = driver.findElement(checkout);
           checkouting.click();
           System.out.println(driver.getCurrentUrl());
          // js.executeScript("window.scrollBy(0,650)");
           WebElement ele1 = driver.findElement(next);
           
           ((JavascriptExecutor) driver).executeScript("arguments[0].click();",ele1 );	
           Thread.sleep(6000);
           WebElement error = driver.findElement(errormssg);
           String errortextact = "The shipping method is missing. Select the shipping method and try again.";
          System.out.println(error.getText());
          String errortextexcp = error.getText();
          Assert.assertEquals(errortextact, errortextexcp);
          log.debug("error is clicked sucessfully");
		}
	}
}
