package TestPages;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.Tricentis_electronics_chisri;
import generic.DriVerclass;

public class Tricentis_Test  extends DriVerclass{
@Test

public void electrinics() throws InterruptedException {
	Tricentis_electronics_chisri trts = new  Tricentis_electronics_chisri(driver);
	trts.tricenties();
	test = report.startTest("tricentis report");
	test.log(LogStatus.PASS, "pass");
	report.endTest(test);
	report.flush();
}

}
