package testcases;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Xls_Reader;

//import utilities.DataUtil;

public class HomePageTest extends testbase.BaseTest {

	@Test
	public void VerifyHomePageTitle() throws InterruptedException {
		System.out.println("reached inside the test");
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "VerifyHomePageTitle");//pass the data
		
		
	}
		//String runmode = "Y";
		//String browserName="chrome";		
		
		/*if (runmode.equals("N")) {
			test.info("Test Skipped");
			throw new SkipException("Skipping the test as the run mode is NO");
		} else {
			try {
			app.openBrowser(browserName);	
			app.navigate("TEST_URL");
			app.wait(1);
			app.softAssert.assertEquals(app.getText("HOME_PAGE_TITLE"), app.envProp.getProperty("EXPECTED_HOMEPAGE_TITLE"));
			test.info("Validated the home page title of Petstore");
			//app.assertAll();
			}catch(Exception e ) {
				e.getStackTrace();
			}
		}
	}*/
}
