package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.tracktickets;
import generic.DriVerclass;

public class tracktickets_test extends DriVerclass {

	@Test
	public void tt_method() throws InterruptedException, IOException {
		tracktickets tt1 = new tracktickets(driver);
		tt1.tracticket();
		tt1.ticket_details();
		tt1.booking_ID();
		tt1.phone();
		tt1.fQa();
		tt1.topbus();
		
	}
	

}
