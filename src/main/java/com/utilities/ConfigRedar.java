package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRedar {
	private Properties prop;
	
	public Properties ini_prop() throws Throwable {
		
		prop=new Properties();
		FileInputStream ip=new FileInputStream("./src/test/resources/Config/config.properties");
		prop.load(ip);
		
		return prop;
	}
	

}
