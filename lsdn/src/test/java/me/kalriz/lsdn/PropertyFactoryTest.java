package me.kalriz.lsdn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.AttributeNotFoundException;

import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.dto.properties.impl.LoggerProperties;
import me.kalriz.lsdn.factory.PropertyFactory;

public class PropertyFactoryTest {
	@Test
	public void factoryCreateTest() throws AttributeNotFoundException, FileNotFoundException, IOException
	{
		LoggerProperties loggerProperties = (LoggerProperties)PropertyFactory.create("logger");
		
		assertEquals(loggerProperties.getPath(), "/Users/ldh/lsdn/");
		assertEquals(loggerProperties.getLevel(), "DEBUG");
		assertEquals(loggerProperties.getDb(), "ALL");
		assertEquals(loggerProperties.getMaxsize(), "30M");
		assertEquals(loggerProperties.getFormat(), "YYYY-MM-DD HH:mm:ss");
	}
	
	@Test
	public void factoryTypeNotFoundExceptionTest()
	{
		// attribute not found exception test
		assertThrows(AttributeNotFoundException.class, ()->{
			LoggerProperties loggerProperties = (LoggerProperties)PropertyFactory.create("app");
			assertEquals(loggerProperties.getPath(), "/Users/ldh/lsdn/");
			assertEquals(loggerProperties.getLevel(), "DEBUG");
			assertEquals(loggerProperties.getDb(), "ALL");
			assertEquals(loggerProperties.getMaxsize(), "30M");
			assertEquals(loggerProperties.getFormat(), "YYYY-MM-DD HH:mm:ss");
		});
		
	}
}
