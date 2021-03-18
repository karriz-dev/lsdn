package me.kalriz.lsdn.dto.properties;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationProperties {
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