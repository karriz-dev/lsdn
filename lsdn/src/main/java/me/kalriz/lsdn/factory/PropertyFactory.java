package me.kalriz.lsdn.factory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.AttributeNotFoundException;

import me.kalriz.lsdn.dto.properties.IProperties;
import me.kalriz.lsdn.dto.properties.impl.LoggerProperties;

public class PropertyFactory {
	private static final String DEFAULT_PATH = System.getProperty("user.home") + "/lsdn/";

	public static IProperties create(String type) throws AttributeNotFoundException, FileNotFoundException, IOException {
		String loggerResource = "configs/logger.properties";

		Properties properties = new Properties();

		switch (type) {
		case "logger":
			try (FileReader file = new FileReader(loggerResource)) {
				properties.load(file);
				return LoggerProperties.builder()
						.path(properties.getProperty("app.logger.path", DEFAULT_PATH + "logs"))
						.level(properties.getProperty("app.logger.level", "INFO"))
						.db(properties.getProperty("app.logger.db", "FILE"))
						.maxsize(properties.getProperty("app.logger.maxsize", "30MB"))
						.format(properties.getProperty("app.logger.format", "YYYY-MM-DD HH:mm:ss")).build();
			}
		default:
			throw new AttributeNotFoundException("Cannot found type " + type + "IProperties [logger]");
		}
	}
}
