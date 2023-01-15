package honeywell.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import honeywell.pageObjects.GetUrl;
import honeywell.utilities.XlUtils;

public class TC_DataProvider extends BaseClass {

	@Test(dataProvider="xl")
	public void dataProvider(String s1,String s2) {
		GetUrl gl=new GetUrl(driver);
			gl.url(s1);
		System.out.println("A");
}
	@DataProvider(name="xl")
	public String[][] getdata() throws IOException{
		String path="E://Java-Selenium Projects//honeywell//src//test//java//honeywell//testData//chins.xlsx";
		int rowno=XlUtils.getRowCount(path, "Sheet1");
		int colcount=XlUtils.getCellCount(path, "Sheet1",1);
		
		String[][] dp=new String[rowno][colcount];
		for(int i=1;i<=rowno;i++) {
			for(int j=0;j<colcount;j++) {
				dp[i-1][j]=XlUtils.getCellData(path,"Sheet1",i,j);
				
			}
		}
		return dp;
		
	}
	}
