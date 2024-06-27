package Webpages;

import java.io.IOException;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaSeClass;

public class referear_divyasri  extends BaSeClass{
	WebDriver driver;

	public referear_divyasri(WebDriver driver) {
		this.driver = driver;
	}
	
By login =  By.xpath("(//div[text()='Log in'])[1]");
By  phone_no = By.xpath("(//input[@class='form-control'])[1]");
By  contie = By.id("signUpSubmit");
By radiopass = By.xpath("(//label[@class='nb-radio radio-inline'])[2]");
By password = By.id("login-signup-form__password-input");
By xmark = By.xpath("//div[text()='x']");
By menu = By.id("main-menu");
By  refer = By.linkText("Refer & Earn");
By offerdetails = By.xpath("//div[@class='nb__K5w6e']");
By cityhelp = By.xpath("(//span[@class='help-block'])[1]");
By numberhelp = By.xpath("(//span[@class='help-block'])[2]");
By validname = By.xpath("(//span[@class='help-block'])[3]");
By propertytype = By.xpath("(//span[@class='help-block'])[3]");
By button = By.xpath("//button[@class='btn btn-primary btn-lg btn-block']");
By dropdown = By.xpath("(//div[@class='css-1wy0on6 nb-select__indicators'])[1]");
By locaction = By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']/div[text()='Mumbai']");
By numberph = By.xpath("//input[@placeholder='Owner Contact Number']");
By ownerna  = By.xpath("(//input[@class='form-control'])[2]");
By typeproperty = By.xpath("(//div[@class='css-v2nw5i-control nb-select__control'])[2]");
By tellusmore = By.xpath("(//input[@class='form-control'])[3]");
By close = By.xpath("//div[@class='login-signup__modal-close-icon']");
By  upload = By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[3]/div[3]/div[1]/button[1]");
By getpic =  By.xpath("//button[@class='nb__1WOep btn btn-default btn-sm btn-block']");
By  expand  = By.xpath("(//div[@class='nb__160Vn'])[3]");
public void openlogin() throws InterruptedException, IOException {
	//login in the page
		WebElement loginicon = driver.findElement(login);
		ClickMethods(loginicon);
		waits(driver, 3, login);
		log.debug("login option is clicked");
		Thread.sleep(5000);
		WebElement numbere = driver.findElement(phone_no);
		SendkeysMethod(numbere, "8463942578");
		log.debug("pheno number is entered");
		 waits(driver, 4, phone_no);
		WebElement cnt = driver.findElement(contie);
		ClickMethods(cnt);
		log.debug("continue button is clicked");
		
		//waits(driver, 10, login);
		Thread.sleep(10000);
		WebElement radio = driver.findElement(radiopass);
		ClickMethods(radio);log.debug("i've password radio is clicked");
		
		waits(driver, 3, radiopass);
		Thread.sleep(3000);
		WebElement pass = driver.findElement(password);
		SendkeysMethod(pass, "divy1628");
		waits(driver, 3, password);
		log.debug("password is entered");
		WebElement conti = driver.findElement(contie);
		ClickMethods(conti);
		log.debug("continue button is clicked");
//		WebElement x = driver.findElement(xmark);
//		ClickMethods(x);
		Thread.sleep(3000);
		log.debug("login in the page");
		WebElement mn  = driver.findElement(menu);
		ClickMethods(mn);
		log.debug("menu icon is clicked");
		WebElement ref = driver.findElement(refer);
		ClickMethods(ref);
		takecreenshots("refer&earn");
		log.debug("refer &earn option is clicked");
//		WebElement x = driver.findElement(close);
//		ClickMethods(x);
//		
		WebElement off  = driver.findElement(offerdetails);
		ClickMethods(off);
		log.debug("owner details is clicked");
//		WebElement drpdown  = driver.findElement(dropdown);
//		ClickMethods(drpdown);
//		WebElement loc  = driver.findElement(locaction);
//		ClickMethods(loc);
		WebElement contii = driver.findElement(button);
		ClickMethods(contii);
		
		WebElement  selectcity = driver.findElement(cityhelp);
	System.out.println(selectcity.getText());
	log.debug("error mmsg of selecity is displayed");
	
	WebElement phonenumber = driver.findElement(numberhelp);
	System.out.println(phonenumber.getText());
	log.debug("error mmsg of phonenumber is displayed");
	WebElement ownername = driver.findElement(validname);
	System.out.println(ownername.getText());
	log.debug("error mmsg of validname is displayed");
	WebElement prptyp = driver.findElement(propertytype);
	System.out.println(prptyp.getText());
	log.debug("error mmsg of property type is displayed");
	WebElement drp = driver.findElement(dropdown);

//	WebElement loct  = driver.findElement(locaction);
//	ClickMethods(loct);
	
	Actions actions = new Actions(driver);
	ClickMethods(drp);
	actions.sendKeys(drp, Keys.ARROW_DOWN).build().perform();
//	actions.Sen(dropdown, Keys.ARROW_DOWN).build().perform();
   actions.sendKeys(Keys.ENTER).build().perform();

WebElement nmb = driver.findElement(numberph);
SendkeysMethod(nmb, "4678");
log.debug("entered phone number");
WebElement contiii = driver.findElement(button);
ClickMethods(contiii);
WebElement phonenumberr = driver.findElement(numberhelp);
System.out.println(phonenumberr.getText());
log.debug("error mmsg of phonenumber is displayed");
WebElement nmbb = driver.findElement(numberph);
nmbb.clear();
SendkeysMethod(nmbb, "8463942578");
log.debug("entered phonenumber is displayed");

WebElement  own = driver.findElement(ownerna);
SendkeysMethod(own, "sadrsfgfyt@EWGDSRHWDSGDV@!#$09876][';{:");
Thread.sleep(1000);
log.debug("entered ownername is displayed");

WebElement typprpr = driver.findElement(typeproperty);
Thread.sleep(1000);
ClickMethods(typprpr);
log.debug("selected dropdown is displayed");
actions.sendKeys(typprpr, Keys.ARROW_DOWN).build().perform();
//actions.Sen(dropdown, Keys.ARROW_DOWN).build().perform();
actions.sendKeys(Keys.ENTER).build().perform();

WebElement moretell = driver.findElement(tellusmore);
SendkeysMethod(moretell, "WAESDFGHJKLJHGFSDXwesdxftrgvhh1234567@#$%^&]['';DFTYRFG");
WebElement contii_i = driver.findElement(button);
ClickMethods(contii_i);
log.debug("entered  text in the tellmore  is displayed");

Actions act = new Actions(driver);
int scrollCount = 13;
for (int i = 0; i < scrollCount; i++) {
    act.sendKeys(Keys.PAGE_DOWN).perform();}
log.debug("page gets scrolled");
    
//    WebElement pic = driver.findElement(upload);
//    ClickMethods(pic);
//    WebElement pload = driver.findElement(getpic);
//    ClickMethods(pload);
//    takecreenshots("upload-image");
    
    Actions acts = new Actions(driver);
    int scrollCout = 25;
    for (int j = 0; j < scrollCout; j++) {
        acts.sendKeys(Keys.PAGE_DOWN).perform();}
        
        WebElement  plus = driver.findElement(expand);
        ClickMethods(plus);
        
    

}}

