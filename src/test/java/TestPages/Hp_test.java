package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.homepagenxt;
import generic.DriVerclass;

public class Hp_test extends DriVerclass {
	@Test

	public void Hp_method() throws InterruptedException, IOException {
		homepagenxt SC1 = new homepagenxt(driver);
		SC1.close();
		SC1.next();
		SC1.email();
		SC1.continue1();
		SC1.password();
		SC1.enterpass();
		SC1.continue2();
		// SC1.dismiss();
//		SC1.getstart();
//		SC1.skip();

		SC1.home();
		SC1.Assignment();
		SC1.opencourse();
		SC1.activity();
		SC1.jobtitle();
	}

}
