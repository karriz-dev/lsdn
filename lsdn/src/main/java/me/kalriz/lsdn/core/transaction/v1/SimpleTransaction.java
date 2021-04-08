package me.kalriz.lsdn.core.transaction.v1;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import me.kalriz.lsdn.core.transaction.Transaction;

@Getter
public class SimpleTransaction extends Transaction
{

	@Builder
	public SimpleTransaction(String txHash, String merkleHash, long blockHeight,
			String from, String to, String speedy, String maxSpeedy,
			String value, Map<String, String> data, String signature)
	{
		super(txHash, System.currentTimeMillis(), 0x00000000, merkleHash,
				blockHeight, from, to, speedy, maxSpeedy, value, data,
				signature);
		// TODO Auto-generated constructor stub
	}
}
