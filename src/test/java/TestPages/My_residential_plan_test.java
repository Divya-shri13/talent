package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.my_residential_plan_divya;
import generic.DriVerclass;

public class My_residential_plan_test extends  DriVerclass {
@Test
public void MY_RESmethod() throws InterruptedException, IOException{
	my_residential_plan_divya myrp = new my_residential_plan_divya(driver);
	myrp.login();
}
}
