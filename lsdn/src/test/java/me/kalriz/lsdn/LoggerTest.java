package me.kalriz.lsdn;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.AttributeNotFoundException;

import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.util.Logger;

public class LoggerTest {
	@Test
	public void loggerDebugTest() throws AttributeNotFoundException
	, FileNotFoundException
	, IOException
	{
		assertTrue(Logger.debug("debug test", this.getClass().getName()).contains("[TEST]"));
	}
	
	@Test
	public void loggerInfoTest() throws AttributeNotFoundException
	, FileNotFoundException
	, IOException
	{
		assertTrue(Logger.info("info test", this.getClass().getName()).contains("[INFO]"));
	}
	
	@Test
	public void loggerWarnTest() throws AttributeNotFoundException
	, FileNotFoundException
	, IOException
	{
		assertTrue(Logger.warn("warn test", this.getClass().getName()).contains("[WARN]"));
	}
	
	@Test
	public void loggerErrorTest() throws AttributeNotFoundException
	, FileNotFoundException
	, IOException
	{
		assertTrue(Logger.error("error test", this.getClass().getName()).contains("[ERROR]"));
	}
	
	@Test
	public void loggerFatalTest() throws AttributeNotFoundException
	, FileNotFoundException
	, IOException
	{
		assertTrue(Logger.fatal("fatal test", this.getClass().getName()).contains("[FATAL]"));
	}
}
