package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.BaSeClass;

public class chisri_99acers extends BaSeClass{
	WebDriver driver;

	public chisri_99acers(WebDriver driver) {
		this.driver = driver;
	}
	By  usericon = By.xpath("(//div[@class='pageComponent theader__userIcon theader__arrowIcn theader__op1'])[1]");
	By  login = By.xpath("(//div[@class='P500 hyperlinks_medium bold spacer16'])[1]");
	By email = By.xpath("//span[@class='list_header_semiBold Ng800']");
	By mailtxt = By.xpath("//input[@label='Email Id/Username']");
	By contin = By.xpath("(//span[@data-sstheme='_BUTTON_SPAN'])[5]");
	By menuicon = By.xpath("(//div[@class='hmenu__op1'])[1]/i");
	
	
	public void forowners() {
		WebElement usric = driver.findElement(usericon);
		ClickMethods(usric);
		WebElement  log = driver.findElement(login);
		ClickMethods(log);
//		WebElement mail = driver.findElement(email);
//		ClickMethods(mail);
//		WebElement txt = driver.findElement(mailtxt);
//		SendkeysMethod(txt, "divyasrichilakabhathini@gmail.com");;
//         WebElement cont = driver.findElement(contin);
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", contin);
//         ClickMethods(cont);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)");
	WebElement menu = driver.findElement(menuicon);
	ClickMethods(menu);
	
	
	}
	
}
