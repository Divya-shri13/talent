package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.hyderabad_oyorooms;
import generic.DriVerclass;


public class oyorooma_test extends DriVerclass {
	@Test
	public void oyorooms_method() throws InterruptedException, IOException{
		hyderabad_oyorooms oorms  = new hyderabad_oyorooms(driver);
		oorms.oyo();
	}

}
