package com.hrm.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import com.hrm.constants.FrameworkConstants;
import com.hrm.utils.ReadPropertyFile;

public final class Driver {
	
	private Driver() {
		
	}

	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());			
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.get("url"));
		}
	}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}



}
