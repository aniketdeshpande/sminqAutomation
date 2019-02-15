package posting.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Locator {

	
	public static Properties fetchLocator() throws Exception{
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("/Users/Aniket/Desktop/SminqAutomation/PostingFlow.test/src/test/java/posting/test/Locator.properties");
	prop.load(file);
	return prop;
	}   
	
}
