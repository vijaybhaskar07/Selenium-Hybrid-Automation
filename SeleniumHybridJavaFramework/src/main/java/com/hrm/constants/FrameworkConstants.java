package com.hrm.constants;

public class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	private static final String RESOURCEPATH = System.getProperty("user.dir");
	private static final String CHROMEDRIVERPATH = RESOURCEPATH+"./Drivers/chromedriver.exe";	
	private static final String CONFIGFILEPATH = RESOURCEPATH+"/src/test/resources/config/config.properties";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}


}
