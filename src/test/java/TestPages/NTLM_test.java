package TestPages;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.NTLM_divya;
import generic.DriVerclass;

public class NTLM_test extends DriVerclass {

	@Test(dataProvider="getData")
	public void ntlm_method(String username,String password) throws InterruptedException, IOException {
		
		NTLM_divya ntm = new NTLM_divya(driver);
		
		ntm.NTLMdivya(username,password);
		
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
