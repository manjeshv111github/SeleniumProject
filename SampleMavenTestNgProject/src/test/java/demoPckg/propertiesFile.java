package demoPckg;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesFile {
	
public static String readProperty(String key) {
		
		Properties prob =new Properties();
		try {
			InputStream readfile = new FileInputStream("C:\\Users\\Manjesh\\eclipse-workspace\\sample\\SampleMavenTestNgProject\\config.properties");
			prob.load(readfile);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prob.getProperty(key);
		
	}

	

}
