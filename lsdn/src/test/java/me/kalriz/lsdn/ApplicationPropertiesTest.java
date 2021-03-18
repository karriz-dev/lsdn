package me.kalriz.lsdn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.dto.properties.ApplicationProperties;

public class ApplicationPropertiesTest {
	@Test
	public void Load()
	{
		ApplicationProperties applicationProperties = ApplicationProperties.builder()
																			.host("127.0.0.1")
																			.build();
																	
		String host = applicationProperties.getHost();
		int port = applicationProperties.getPort();
		
		System.out.println(applicationProperties.toString());
		
		assertEquals(host, "127.0.0.1");
		assertEquals(port, 19995);
	}
}
