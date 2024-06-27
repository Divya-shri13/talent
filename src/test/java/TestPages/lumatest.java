package TestPages;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.luma;
import generic.DriVerclass;

public class lumatest extends DriVerclass {
@Test(dataProvider = "getData")
public void luma_method(String username,String userkey) throws InterruptedException, IOException, AWTException {
	luma lummg = new luma(driver);
	lummg.luma_magento(username,userkey);
	test = report.startTest("Magento_luma for finding E2e functinality of the bags");
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