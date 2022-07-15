package demoPckg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	propertiesFile propFile;
	
	@Test(dataProvider="testdata")
	public void testDataprovider(String str1,String str2) {
		String str=propFile.readProperty("browser");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
	
	@DataProvider
	public Object[][] testdata(){
		
		Object[][] testdata = new Object[2][2];
		testdata[0][0]="Username1";
		testdata[0][1]="Password1";
		testdata[1][0]="Username2";
		testdata[1][1]="Password2";
		
		return testdata;
		
	}

}
