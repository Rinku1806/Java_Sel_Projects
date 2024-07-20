package testcases;
import org.testng.SkipException;
import org.testng.annotations.Test;

import util.Xls_Reader;
public class StoreEntryTest extends testbase.BaseTest {

	@Test
	public void VerifySignInButtonPresence() throws InterruptedException {
		System.out.println("reached inside the test");
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "VerifySignInButtonPresence");//pass the data
		
		/*if (runmode.equals("N")) {
			test.info("Test Skipped");
			throw new SkipException("Skipping the test as the run mode is NO");
		} else {
			try {
				app.openBrowser(browserName);	
				app.navigate("TEST_URL");
				Thread.sleep(1000);
				app.click("ENTER_STORE_LINK_xpath");		
				app.softAssert.assertEquals(app.getText("SIGNIN_LINK_xpath"), app.envProp.getProperty("SIGNIN_LINK_TEXT"));
				test.info("Validated the home page title of Petstore");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//app.assertAll();
		}*/

	}

	@Test
	public void VerifyStoreEntryTitle() throws InterruptedException {
		System.out.println("reached inside the test");
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "VerifyStoreEntryTitle");//pass the data
		
		/*if (runmode.equals("N")) {
			test.info("Test Skipped");
			throw new SkipException("Skipping the test as the run mode is NO");
		} else {
			try {
				app.openBrowser(browserName);	
				app.navigate("TEST_URL");
				app.wait(1);
				app.click("ENTER_STORE_LINK_xpath");
				app.wait(2);
				//app.assertEquals(app.getPageTitle(), app.envProp.getProperty("SIGNIN_PAGE_TITLE"));				
				test.info("Validated the home page title of Petstore Entry page");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//app.assertAll();
		}*/
	}

	@Test
	public void Verifylogin() throws InterruptedException {
		System.out.println("reached inside the test");
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "Verifylogin");//pass the data

		/*if (runmode.equals("N")) {
			test.info("Test Skipped");
			throw new SkipException("Skipping the test as the run mode is NO");

		} else {
			try {
				app.openBrowser(browserName);	
				app.navigate("TEST_URL");
				app.wait(2);
				app.click("ENTER_STORE_LINK_xpath");
				app.wait(2);
				app.click("SIGNIN_LINK_xpath");
				app.Login(username, pwd);
				app.softAssert.assertEquals(app.getText("SIGNOUT_LINK_xpath"), app.envProp.getProperty("SIGNOUT_TEXT"));
			} catch (Exception e) {
				e.printStackTrace();

			}
			//app.assertAll();

		}*/

	}

}
