package utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import util.Xml_Reader_tr;



public class DataUtil extends testbase.BaseTest {

	@DataProvider(name = "dp")
	public Object[][] getData(Method m) {
		String testName = m.getName();
		Object[][] data = new Xml_Reader_tr(xmlR).getDataByTestName(testName);
		
		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[0].length; j++) {
				
				System.out.println(data[i][j]);
			}
		}
		return data;
	}


/*
@DataProvider(name = "dp")
public Object[][] getData(Method m) {
	String sheetName = m.getName();
	int rowCount = excel.getRowCount(sheetName);
	int colCount = excel.getColumnCount(sheetName);

	Object[][] data = new Object[rowCount - 1][colCount];

	for (int rows = 2; rows <= rowCount; rows++) {

		for (int cols = 0; cols < colCount; cols++) {

			data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);

		}

	}

	return data;

}*/
	}