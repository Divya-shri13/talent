package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.referear_divyasri;
import generic.DriVerclass;



public class referearn_test extends  DriVerclass {
	@Test
	public void earnrefer() throws InterruptedException, IOException {
	referear_divyasri refer = new referear_divyasri(driver);
	refer.openlogin();
	}

}
