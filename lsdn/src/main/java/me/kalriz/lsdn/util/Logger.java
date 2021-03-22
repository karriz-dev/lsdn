package me.kalriz.lsdn.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.AttributeNotFoundException;

import me.kalriz.lsdn.dto.properties.impl.LoggerProperties;
import me.kalriz.lsdn.factory.PropertyFactory;

public class Logger {

	public static String debug(String message, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());

		String logMessage = "[DEBUG] " + formatter.format(new Date()) + " :: " + sender + " >> " + message;

		System.out.println(logMessage);

		return logMessage;
	}

	public static String info(String message, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());
		String logMessage = "[INFO] " + formatter.format(new Date()) + " :: " + sender + " >> " + message;

		System.out.println(logMessage);

		return logMessage;
	}
	
	public static String warn(String message, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());
		String logMessage = "[WARN] " + formatter.format(new Date()) + " :: " + sender + " >> " + message;

		System.out.println(logMessage);

		return logMessage;
	}

	public static String error(String message, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());
		String logMessage = "[ERROR] " + formatter.format(new Date()) + " :: " + sender + " >> " + message;

		System.out.println(logMessage);

		return logMessage;
	}

	public static String error(Exception exception, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());

		String logMessage = "[ERROR] " + formatter.format(new Date()) + " :: " + sender + " >> " + exception.toString();

		System.out.println(logMessage);

		return logMessage;
	}

	public static String fatal(String message, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());

		String logMessage = "[FATAL] " + formatter.format(new Date()) + " :: " + sender + " >> " + message;

		System.out.println(logMessage);

		return logMessage;

	}

	public static String fatal(Exception exception, String sender)
			throws AttributeNotFoundException, FileNotFoundException, IOException {
		var loggerProperties = (LoggerProperties) PropertyFactory.create("logger");
		SimpleDateFormat formatter = new SimpleDateFormat(loggerProperties.getFormat());

		String logMessage = "[FATAL] " + formatter.format(new Date()) + " :: " + sender + " >> " + exception.toString();

		System.out.println(logMessage);

		return logMessage;
	}

}
