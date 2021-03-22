package me.kalriz.lsdn.dto.properties.impl;

import lombok.Builder;
import lombok.Data;
import me.kalriz.lsdn.dto.properties.IProperties;

@Data
@Builder
public class LoggerProperties implements IProperties {
	private String path;
	private String level;
	private String db;
	private String maxsize;
	private String format;
}
