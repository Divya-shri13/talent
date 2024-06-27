package TestPages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.nestaway_forownerproperty;
import generic.DriVerclass;

public class nestaway_test  extends DriVerclass{
	@Test(dataProvider = "getData")
	public void  nxst(String email,String Password) throws InterruptedException {
		nestaway_forownerproperty nxt = new nestaway_forownerproperty(driver);
		nxt.owners(email,Password);
//		test = report.startTest("forpropertyoweners-nestaway");
//		test.log(LogStatus.PASS, "pass");
//		report.endTest(test);
//		report.flush();
	}
	//	@DataProvider
	//	public Object[][] getData() {
			String sheetname = "Sheet1";
//			int rows = excel.getRowCount(sheetname)-1;
//			int cols = excel.getColumnCount(sheetname);
//			Object[][] data = new Object[rows ][cols];
//			for (int rowNum = 2; rowNum <= rows; rowNum++) {
//				for (int colNum = 0; colNum < cols; colNum++) {
//					// data[0][0]
//					data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
//				}
//			}
	//		return data;
	//	}
	

}
