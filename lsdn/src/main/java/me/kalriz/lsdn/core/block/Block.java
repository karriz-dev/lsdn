package me.kalriz.lsdn.core.block;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import me.kalriz.lsdn.core.transaction.Transaction;

@Getter
@AllArgsConstructor
@ToString
public abstract class Block
{
	private Long timestamp = 0L;
	
	private String blockHash = null;
	private String prevBlockHash = null;
	
	private String merkleHash = null;
	
	private Integer nonce = 0;
	
	private List<Transaction> txlist = null;
}
