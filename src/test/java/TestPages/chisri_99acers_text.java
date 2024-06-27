package TestPages;

import org.testng.annotations.Test;

import Webpages.chisri_99acers;
import generic.DriVerclass;

public class chisri_99acers_text extends DriVerclass {
	@Test
	
	public void acers99_method() {
		chisri_99acers arc = new chisri_99acers(driver);
		arc.forowners();
	}

}
