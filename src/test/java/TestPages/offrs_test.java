package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.offers_Divya;
import generic.DriVerclass;

public class offrs_test extends DriVerclass {
	@Test
	
	public void off_method() throws IOException {
		offers_Divya off = new offers_Divya(driver);
		off.offer();
		//off.field();
	}

}
