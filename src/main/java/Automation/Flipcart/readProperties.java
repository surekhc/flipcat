package Automation.Flipcart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {
	
	public static String loadData(String Data) throws IOException {
		
		Properties p = new Properties();
		p.load(new FileInputStream("/Users/surekhachandrasekaran/eclipse-workspace/flipcart1/src/main/java/Automation/Flipcart/data.properties"));		
		String data = p.getProperty(Data);
		return data;
	}
	
}