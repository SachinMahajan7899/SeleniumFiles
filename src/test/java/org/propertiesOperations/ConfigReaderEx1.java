package org.propertiesOperations;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderEx1 {
	public static void main(String[] args) {
		try {
			String fileName = "./propertiesFiles/ConfigReader.properties";
			FileInputStream fis = new FileInputStream(fileName);
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
