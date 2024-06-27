package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.Workday_divya;
import generic.DriVerclass;

public class Workday_test  extends DriVerclass{
	@Test
	public void wrkday() throws IOException, InterruptedException {
		Workday_divya wrk = new Workday_divya(driver);
		wrk.sigin();
	}

}
