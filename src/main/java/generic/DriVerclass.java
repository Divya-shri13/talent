package generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ExcelReader;
import utilites.Extendedmanager;

public class DriVerclass {

	public static ExcelReader excel = new ExcelReader("C:\\Users\\CHISRI\\eclipse-workspace\\Capgemini.talent\\src\\test\\resource\\excel\\xyzbankchisri.xlsx");
	//public static ExcelReader excel = new ExcelReader("C:\\Users\\CHISRI\\eclipse-workspace\\Capgemini.talent\\src\\test\\resource\\excel\\magento.xlsx");
	//public static ExcelReader excel = new ExcelReader("C:\\Users\\CHISRI\\eclipse-workspace\\Capgemini.talent\\src\\test\\resource\\rtcks.xlsx");
	public static WebDriver driver;
		public static Logger log =Logger.getLogger("devpinoyLogger");
		public static ExtentReports report = Extendedmanager.getInstance();
		public static ExtentTest test;
		
		// TODO Auto-generated method stub
		@BeforeSuite
		public void browserSetup() {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow--origins=*");
			WebDriverManager.edgedriver().setup();
			
			//System.setProperty("webdriver.edge.driver","C:\\\\selenium\\\\edgedriver_win64");
			driver = new EdgeDriver();
			String actUrl = "https://globalsqa.com/angularJs-protractor/BankingProject/#/login";
					
						driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
					  
			driver.manage().window().maximize();
			
		//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			// driver.manage().deleteAllCookies();
			//to get the ur             
			String expUrl = driver.getCurrentUrl();
			Assert.assertEquals(expUrl, actUrl);
		System.out.println("Validation Successful");
			log.debug("Browser opened sucessfully");
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText(); // Get text of the alert
//			System.out.println("Alert Text: " + alertText);
//			alert.dismiss();
		}

//		@AfterSuite
//		public void CloseBrowser() {
//		if (driver != null) {
//				driver.quit();
//				log.debug("Browser closed");
			//}

		//}

}
