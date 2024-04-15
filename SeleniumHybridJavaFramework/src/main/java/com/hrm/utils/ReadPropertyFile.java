package com.hrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.Objects;

import com.hrm.constants.FrameworkConstants;

public final class ReadPropertyFile {
	
	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
	
	
	private ReadPropertyFile() {
		
	}
	
	static {
		try {
		FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath());
		property.load(file);
		for(Map.Entry<Object, Object> entry: property.entrySet()) {
		CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
		}
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
}
	
	public static String get(String key) throws Exception {				
		if(Objects.isNull(key)|| Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("property name " + key + "is not found. please check config.properties");
		}
		return CONFIGMAP.get(key);
	}
	
	

}
