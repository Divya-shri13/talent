package Webpages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import generic.BaSeClass;

public class offers_Divya extends BaSeClass {

	WebDriver driver;

	public offers_Divya(WebDriver driver) {
		this.driver = driver;
	}
//shopre 
	By Xmark = By.xpath("//button[@class='leadinModal-close']");
	By offer = By.xpath("(//div[@class='dropdown-festive']/button)[2]");
	By online = By.xpath("(//div[@class='dropdown-festive'])[2]/div/a[1]");
	By search = By.xpath("(//div[@class='dropdown-content-festive'])[2]/a[2]");
	By text = By.xpath("(//h3[@class='header3 p-color-cement-dark font-weight-900'])[1]");
	By shoplink = By.xpath("//img[@alt='amazon']");
	By apptext = By.xpath("//h1[@class=' txt_01 mr_txt11']");
	By field = By.xpath("//div[@class='section campaign-section top-border']");
	By chtx = By.xpath("//span[@class='icon-ic_close']");
	By collectcup = By.xpath("(//a[@class='btn btn-secondary btn-read-more'])[1]");
	By gmail = By.xpath("//button[@class='bg-white-only']");
	By personal = By.xpath("//a[text()[normalize-space()='Personal Shopper Offers']]");
	// By.linkText("\r\n"
	// + "Personal Shopper Offers");
	// By.xpath("//a[text()=[' Personal Shopper Offers']");

	public void offer() throws IOException {
//xmark			
//			 driver.getTitle();
//			  WebElement xm = driver.findElement(Xmark);
//			  ClickMethods(xm);
//offers option			  
		WebElement off = driver.findElement(offer);
		ClickMethods(off);
		log.debug("offer option is clicked ");// clicking sub option
		System.out.println(driver.getCurrentUrl());
		Actions actions = new Actions(driver);
		WebElement QA = driver.findElement(online);
		actions.moveToElement(QA).click().perform();
		log.debug("sub option is choosed");
//				get text of the 
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");
		WebElement tet = driver.findElement(text);
		System.out.println(tet.getText());
		log.debug("text is printed");
		// clicking on the shopping link
		WebElement shp = driver.findElement(shoplink);
		ClickMethods(shp);
		log.debug("clicked on shopping website");

		// get heading and valiadating
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		log.debug("windows handling");
		WebElement apt = driver.findElement(apptext);
		String st = apt.getText();
		String act1 = "Amazon India Online Shopping";
		Assert.assertEquals(st, act1);
		System.out.println("Amazon India Online Shopping");
		log.debug("validated the text");
		// scroll page
		Actions act = new Actions(driver);
		int scrollCount = 32;
		for (int i = 0; i <= scrollCount; i++) {
			act.sendKeys(Keys.PAGE_DOWN).perform();
		}

//	public void field() throws IOException {
//		WebElement fld = driver.findElement(field);
//		if (fld.isDisplayed()) {
//			ClickMethods(fld);
//			System.out.println("fld is clicked");
//		} else {
//			System.out.println("fld is not clicked");
//		}
//
//		WebElement botx = driver.findElement(Xmark);
//		if (botx.isDisplayed()) {
//			ClickMethods(botx);
//			System.out.println("click is performed");
//		} else {
//			System.out.println("element not found");
//		}

		WebElement pr = driver.findElement(personal);
		ClickMethods(pr);
		driver.getCurrentUrl();
		takecreenshots("child_window");
		log.debug("screenshot has been taken");

		// move to main window

		driver.switchTo().window(mainWindow);
		waits(driver, 10, Xmark);

		// xmark
		WebElement xm = driver.findElement(Xmark);
		ClickMethods(xm);
		log .debug("pop up has been removed");
//offers option			  
		WebElement off1 = driver.findElement(offer);
		ClickMethods(off1);
		log .debug("clicked on offers option");
//clicking sub option 
		System.out.println(driver.getCurrentUrl());

		WebElement off2 = driver.findElement(offer);
		ClickMethods(off2);
		Actions actions2 = new Actions(driver);
		WebElement QA2 = driver.findElement(search);
		actions.moveToElement(QA2).click().perform();

		WebElement cup = driver.findElement(collectcup);
		ClickMethods(cup);
		log .debug("collect cupons has been choosen");
	}
}
