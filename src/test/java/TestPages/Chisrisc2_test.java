package TestPages;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.CHISRIXYZbank2sc;
import generic.DriVerclass;

public class Chisrisc2_test extends DriVerclass {
	@Test(dataProvider="getData")

	public  void scenariotwo(String depositamount, String moneytook) throws InterruptedException, IOException {
		CHISRIXYZbank2sc scr2 = new CHISRIXYZbank2sc(driver);
		scr2.chisriscenario2(depositamount , moneytook);
		test = report.startTest("NTLMN hash generator");
		test.log(LogStatus.PASS, "pass");
		report.endTest(test);
		report.flush();
	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Sheet1";
		int rows = excel.getRowCount(sheetname) ;
		int cols = excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows-1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				// data[0][0]
				data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;

	}
}
	
