package testcases;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

import util.Xls_Reader;

public class DashBoardTest extends testbase.BaseTest {

	@Test
	public void verifyAvailablePets(ITestContext context) throws InterruptedException {	
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "verifyAvailablePets");//pass the data
		/*
		if (runmode.equals("N")) {
			test.info("Test Skipped");
			throw new SkipException("Skipping the test as the run mode is NO");
		} else {
			try {
				ds.openBrowser(browserName);	
				ds.navigate("TEST_URL");
				ds.wait(1);
				ds.click("ENTER_STORE_LINK_xpath");
				ds.wait(2);
				ds.click("SIGNIN_LINK_xpath");
				ds.Login(username, pwd);				
				ds.softAssert.assertEquals(ds.getElement("BIRDS_LOCATOR_xpath").getAttribute("href").split("=")[2],ds.envProp.getProperty("BIRDS_TEXT"));
				test.info("Validation of birds in the store completed");
				ds.softAssert.assertEquals(ds.getElement("CATS_LOCATOR_xpath").getAttribute("href").split("=")[2], ds.envProp.getProperty("CATS_TEXT"));
				test.info("Validation of cats in the store completed");
				ds.softAssert.assertEquals(ds.getElement("DOGS_LOCATOR_xpath").getAttribute("href").split("=")[2], ds.envProp.getProperty("DOGS_TEXT"));
				test.info("Validation of dogs in the store completed");
				ds.softAssert.assertEquals(ds.getElement("FISH_LOCATOR_xpath").getAttribute("href").split("=")[2], ds.envProp.getProperty("FISH_TEXT"));
				test.info("Validation of fish in the store completed");
				ds.softAssert.assertEquals(ds.getElement("REPTILES_LOCATOR_xpath").getAttribute("href").split("=")[2], ds.envProp.getProperty("REPTILES_TEXT"));
				test.info("Validation of reptiles in the store completed");
				//ds.assertAll();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}*/

	}

	@Test	
	public void verifyAllPets() throws InterruptedException {
		System.out.println("reached inside the test");
		ds.log("Starting to create a portfolio");
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\testcases\\Testcases.xlsx");
		ds.executeTest(xls, "TestCases", "verifyAllPets");//pass the data

		/*if (runmode.equals("N")) {
			test.info("Test skipped");
			throw new SkipException("Skipping the test as the run mode is NO");
		} else {

			ds.openBrowser(browserName);	
			ds.navigate("TEST_URL");
			ds.wait(1);
			ds.click("ENTER_STORE_LINK_xpath");
			ds.wait(2);
			ds.click("SIGNIN_LINK_xpath");
			ds.Login(username, pwd);
			ds.click("BIRDS_LOCATOR_xpath");
			ds.verifyTableEntities(ds.getElement("BIRDTABLE_LOCATOR_xpath"), ds.envProp.getProperty("EXPECTED_PET_BIRDS").split(","));
			ds.returnToMainMenu();
			test.info("Validation of all breeds of birds in the store completed");
			ds.click(ds.envProp.getProperty("CATS_LOCATOR_xpath"));
			ds.verifyTableEntities(ds.getElement("CATS_LOCATOR_xpath"), ds.envProp.getProperty("EXPECTED_PET_CATS").split(","));
			ds.returnToMainMenu();
			test.info("Validation of all breeds of cats in the store completed");
			ds.click(ds.envProp.getProperty("DOGS_LOCATOR_xpath"));
			ds.verifyTableEntities(ds.getElement("DOGS_LOCATOR_xpath"), ds.envProp.getProperty("EXPECTED_PET_DOGS").split(","));
			ds.returnToMainMenu();
			test.info("Validation of all breeds of dogs in the store completed");
			ds.click(ds.envProp.getProperty("REPTILES_LOCATOR_xpath"));
			ds.verifyTableEntities(ds.getElement("REPTILES_LOCATOR_xpath"), ds.envProp.getProperty("EXPECTED_PET_REPTILES").split(","));
			ds.returnToMainMenu();
			test.info("Validation of all breeds of reptiles in the store completed");
			ds.click(ds.envProp.getProperty("FISH_LOCATOR_xpath"));
			ds.verifyTableEntities(ds.getElement("FISHTABLE_LOCATOR_xpath"), ds.envProp.getProperty("EXPECTED_PET_FISH").split(","));
			ds.returnToMainMenu();
			test.info("Validation of all breeds of fish in the store completed");
		}
		// .assertAll();*/
	}
}
