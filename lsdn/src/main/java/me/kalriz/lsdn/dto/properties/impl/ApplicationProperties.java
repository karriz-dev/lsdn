package me.kalriz.lsdn.dto.properties.impl;

import lombok.Builder;
import lombok.Data;
import me.kalriz.lsdn.dto.properties.IProperties;

@Data
@Builder
public class ApplicationProperties implements IProperties {
	/**
	 * General App Properties
	 */
	private String serverName;
	
	/**
	 * Connection Pool Properties
	 */
	private String host;
	private int port;
	
	/**
	 * H2 Database Properties
	 */
	private String connectionURL;
	private int connectionPort;
	private String id;
	private String password;	
}