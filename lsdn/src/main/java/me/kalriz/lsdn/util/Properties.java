package me.kalriz.lsdn.util;

import me.kalriz.lsdn.dto.properties.ApplicationProperties;

public class Properties {
	private static Properties instance = null;
	
	private ApplicationProperties applicationProperties = null;
	
	private Properties()
	{
		// 1. Reading Properties json file
	}
	
	public static Properties Instance() {
		if(instance==null)
			instance = new Properties();
		return instance;
	}
}
