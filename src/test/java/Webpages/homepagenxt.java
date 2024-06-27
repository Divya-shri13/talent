package Webpages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import generic.BaSeClass;

public class homepagenxt extends BaSeClass {
	WebDriver driver;

	public homepagenxt(WebDriver driver) {
		this.driver = driver;
	}
By close = By.xpath("//span[@class='popup_close']");
	By next = By.xpath("(//div[@class='tool'])[3]/ul/li[2]");
	By email = By.cssSelector("#username");
	By continue1 = By.xpath("//span[@class='df-spinner-button__content']");
	By home = By.xpath("(//a[@class='tabnav__link ng-tns-c588-0'])[1]");
	By name = By.xpath("//a[@data-dgat='user-summary-a1d']");
	By Assignment = By.xpath("(//a[@class='l_flexbar full-width'])[2]");
	By Password = By.xpath("//button[@data-dgat='LogIn-32c']");
	By enterpass = By.id("current-password");
	By continue2 = By.id("continueBtn");
	By dismiss = By.xpath("//button[@data-highlight='Dismiss']");
	By getstart = By.xpath("//button[@data-dgat='onboardingFooter-db2']");
	By skip = By.xpath("//button[@data-dgat='onboardingFooter-da2']");
	By opencourse = By.xpath("(//button[@data-dgat='profile-assignments-531'])[2]");
By activity = By.xpath("(//div[@class='l_flexbar'])[2]");
By jobtitle = By.xpath("//div[@class='static-user-info-meta-label guts-m-b-quart ng-star-inserted']");
	
public void close() {
	WebElement ele = driver.findElement(close);
	ClickMethods(ele);
}
	// next button
	public void next() throws InterruptedException {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(next);
		ClickMethods(ele);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles(); // returns string , get unique Id of current window
		List<String> list = new ArrayList<String>(allWindows); // oraganisation of data
		Iterator<String> i = allWindows.iterator(); // iterating 
		while (i.hasNext()) {
			String childWindow = i.next();
			if (!(mainWindow.equals(childWindow))) {
				driver.switchTo().window(childWindow);
				break;
			}
		}
	}


	// email entery
	public void email() throws InterruptedException {
		Thread.sleep(1000);
		WebElement username = driver.findElement(email);
		SendkeysMethod(username, "chilakabhathini-divya.sri@capgemini.com");
	}
//continue
	public void continue1() throws InterruptedException {
		WebElement cont = driver.findElement(continue1);
		ClickMethods(cont);
		Thread.sleep(1000);
	}
//password
	public void password() {
		WebElement send = driver.findElement(Password);
		ClickMethods(send);
	}
//enter password
	public void enterpass() {
		WebElement entpass = driver.findElement(enterpass);
		SendkeysMethod(entpass, "Dlalli@13");
	}

	public void continue2() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		WebElement con = driver.findElement(continue2);
		ClickMethods(con);
	}

//	 public void dismiss() {
//		 WebElement dis = driver.findElement(dismiss);
//		 ClickMethods(dis);
//	 }
//	 public void getstart()
//	 {
//		 WebElement getstrt = driver.findElement(getstart);
//		 ClickMethods(getstrt);
//	 }
//	 public void skip() {
//		 for(int i=0;i<=2;i++) {
//		 WebElement sk = driver.findElement(skip);
//		 ClickMethods(sk);
//		 }
//	 }
	// home page
	public void home() throws IOException {
//		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebElement hom = driver.findElement(home);
		ClickMethods(hom);
		System.out.println(driver.getTitle());
		takecreenshots("home_page");
	}
//profile name 
	public void name() {
		WebElement text1 = driver.findElement(name);
		System.out.println(text1.getText());
		String text_1 = text1.getText();
		String act_1 = "chilakabhathini Divya sri";
		Assert.assertEquals(text_1, act_1);
	}
//assignment 
	public void Assignment() {
		WebElement assign = driver.findElement(Assignment);
		ClickMethods(assign);
	}

	public void opencourse() {
		WebElement opco = driver.findElement(opencourse);
		ClickMethods(opco);
		String act = "Assignments | Degreed";
		System.out.println(driver.getTitle());
		String Exp = driver.getTitle();
		Assert.assertEquals(act, Exp);
		
		Set<String> set = driver.getWindowHandles(); 
		 
		List<String> index = new ArrayList<String>(set);
 
		Iterator<String> I = set.iterator();
 
		while (I.hasNext()) {
			driver.switchTo().window(index.get(1));
			break;
		}
	}
	public void activity() throws IOException {
		WebElement ele = driver.findElement(activity);
		ClickMethods(ele);
		takecreenshots("activity");
	}
	public void jobtitle() {
		System.out.println(driver.getTitle());
		String act = "Analyst";
		WebElement title  = driver.findElement(jobtitle);
		System.out.println(title.getText());
		String job = title.getText();
		Assert.assertEquals(act, job);
		System.out.println("Analyst");
		
	}
	
}
