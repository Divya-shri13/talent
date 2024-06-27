package Webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import generic.BaSeClass;

public class CHISRIXYZbank2sc extends BaSeClass {
	WebDriver driver ;
	public CHISRIXYZbank2sc(WebDriver driver) {
	this.driver = driver;
	}
By   customer_login  = By.xpath("	//div[@class='center'])[1]/button");
//cssSelector("btn.btn-primary btn-lg");
		//div[@class='center'])[1]/button  	 
	By  cust_name = By.id("userSelect");
	By loginbuttoon = By.linkText("Login");
	By accdetails = By.xpath("(//div[@class= 'center'])[1]");
	By depbutton = By.xpath("(//div[@class='center'])[2]/button[2]");
	By depositamt = By.xpath("//input[@class= 'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	By depositbutton = By.xpath("//button[@class= 'btn btn-default']");
	By depositmssg = By.xpath("//span[@class= 'error ng-binding']");
	By moneydep =  By.xpath("(//strong[@class='ng-binding'])[2]");
	By withdrawalbutton = By.xpath("(//button[@class='btn btn-lg tab'])[2]");
	By moneytotake =  By.xpath("//input[@class= 'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	By buttonofwithdrawl = By.xpath("//button[text()='Withdraw']");
	By transmssg = By.linkText("Transaction successful");
	public void  chisriscenario2(String depositamount, String moneytook) throws InterruptedException, IOException {
		Thread.sleep(9000);
		WebElement login_customer = driver.findElement(customer_login);
		ClickMethods(login_customer);
		 
		Select select = new Select(driver.findElement(By.id("userSelect")));
		select.selectByVisibleText("6");
		
		WebElement details_account  = driver.findElement(accdetails);
		String  actdetails =  details_account.getText();
		System.out.println(details_account.getText());
		
		WebElement ele1 = driver.findElement(depbutton);
		ClickMethods(ele1);
		
		WebElement amtdeposit = driver.findElement(depositamt);
		SendkeysMethod(amtdeposit, depositamount);
		
		WebElement buttondeposit = driver.findElement(depositbutton);
		ClickMethods(buttondeposit);
		
		String actdeposittextmssg = "Deposit Successful";
		WebElement  mssgdepoisst = driver.findElement(depositmssg);
		String expdeposittextmssg =	mssgdepoisst.getText();
		System.out.println(	mssgdepoisst.getText());
			Assert.assertEquals(actdeposittextmssg, expdeposittextmssg);	
			
			 WebElement actdetail  = driver.findElement(accdetails);
			String  expdetails =  actdetail.getText();
			 System.out.println(actdetail.getText());
			
			 WebElement amtdepst = driver.findElement(moneydep);
			 String  moneyact =   amtdepst.getText();
			 String moneyexp = "9999";
			 Assert.assertEquals(moneyact, moneyexp);
			 
			 WebElement  withdrawl = driver.findElement(withdrawalbutton);
			 ClickMethods(withdrawl);
			 
			 WebElement withdrawlmoney = driver.findElement(moneytotake);
			 SendkeysMethod(withdrawlmoney, moneytook);
			 
			 WebElement ele2  = driver.findElement(buttonofwithdrawl);
			 ClickMethods(ele2);
			 
			  String acttrsmg = "Transaction successful";
			  WebElement trsanmssg = driver.findElement(transmssg);
			String exptrnsmaag =   trsanmssg.getText();
			 Assert.assertEquals(acttrsmg, exptrnsmaag);
			 
			takecreenshots("withdrwaltext");

			 
	}
}


	