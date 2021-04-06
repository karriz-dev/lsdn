package me.kalriz.lsdn.core.transaction;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class Transaction {

	private String txHash = null;
	private long timestamp = System.currentTimeMillis();
	private int type = 0x00000000;
	
	protected String merkleHash = null;
	protected long blockHeight = 0L;

	protected String from = null;
	protected String to = null;

	protected String speedy = null;
	protected String maxSpeedy = null;
	
	protected String value = null;
	
	protected Map<String, String> data = null;
}
