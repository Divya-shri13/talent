package TestPages;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.legaldoc_divs;
import generic.DriVerclass;

public class legaldoc_text extends DriVerclass {
	@Test
	
	public void offletter_method() throws InterruptedException
	{
		legaldoc_divs lgdc = new legaldoc_divs(driver);
		lgdc.legal();
		test = report.startTest("NTLMN hash generator");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();
	}

}
