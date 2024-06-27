package Webpages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaSeClass;

public class NTLM_divya extends BaSeClass {

	WebDriver driver;

	public NTLM_divya(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.id("notloggedin");
	By mail = By.id("user-email");
	By pass = By.id("user-password");
	By submit = By.xpath("//button[@type='submit']");
	By search = By.id("searchHomePage");
	By ntlm = By.xpath("(//a[text()='NTLM Hash Generator'])[1]");
	By tr = By.xpath("//a[@class='is-pulled-right']");
	By textaera = By.id("inputTextArea");
	By optxt = By.id("outputTextArea");

	public void NTLMdivya(String username, String password) throws InterruptedException, IOException {
		//login 
		WebElement log = driver.findElement(login);
		ClickMethods(log);
		
		WebElement email = driver.findElement(mail);
		//waits(driver,Duration.ofSeconds(10), mail);
		//SendkeysMethod(email, "divyasrichilakabhathini@gmail.com");
	//	WebDriverWait wait = new WebDriverWait(driver,TimeUnit.toSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated( By.id("user-email")));
		SendkeysMethod(email, username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement passwod = driver.findElement(pass);
		//SendkeysMethod(passwod, "code@13");
		SendkeysMethod(passwod, password);
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		WebElement sub = driver.findElement(submit);
		ClickMethods(sub);
		
		
		//search
		WebElement serch = driver.findElement(search);
		SendkeysMethod(serch, "Cryptograp");
		Thread.sleep(5000);
//serch.sendKeys(Keys.ARROW_DOWN);
		serch.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
// returns string , get unique Id of current window
		List<String> list = new ArrayList<String>(allWindows); // oraganisation of data
		Iterator<String> i = allWindows.iterator(); // iterating
		while (i.hasNext()) {
			String childWindow = i.next();
			if (!(mainWindow.equals(childWindow))) {
				driver.switchTo().window(childWindow);
//		break;
			}
		}
		takecreenshots("windows of codebeauty");
		//ntlm button click
		WebElement ele = driver.findElement(ntlm);
		ClickMethods(ele);
		js1.executeScript("window.scrollBy(0,2000)");
		
		WebElement tryit = driver.findElement(tr);
		ClickMethods(tryit);
		WebElement ele1 = driver.findElement(textaera);
		ClickMethods(ele1);
		ele1.clear();
		SendkeysMethod(ele1, "fdsfgdutgyjh123458976ujghik{P:>?L:>EDASFDWDSCF");
		WebElement ele2 = driver.findElement(optxt);
		ele2.getText();

		driver.switchTo().window(mainWindow);
		serch.sendKeys("NTLM Hash");
		Thread.sleep(5000);
		serch.sendKeys(Keys.ENTER);
		takecreenshots("ntlmhash");

	}

}
