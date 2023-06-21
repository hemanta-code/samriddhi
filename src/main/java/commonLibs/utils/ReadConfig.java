package commonLibs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	public ReadConfig() {
		File src = new File("./configuration/config.properties");
		
		try {
			FileInputStream input = new FileInputStream(src);
			properties = new Properties();
			properties.load(input);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getBaseUrl() {
		String url = properties.getProperty("baseUrl");
		return url;
	}
	
	
	public String getChromePath() {
		String chromepath = properties.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		String firefoxpath = properties.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
	public String getEdgePath() {
		String edgepath = properties.getProperty("edgepath");
		return edgepath;
	}
	
	public String getEmail() {
		String email = properties.getProperty("email");
		return email;
	}
	
	
	public String getPassword() {
		String password = properties.getProperty("password");
		return password;
	}
}
