package me.kalriz.lsdn.core.block.v1;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import me.kalriz.lsdn.core.block.Block;
import me.kalriz.lsdn.core.transaction.Transaction;

@Getter
public class GenesisBlock extends Block
{
	private String networkVersion = "lsdn://0.0.1-t";

	@Builder
	public GenesisBlock(String blockHash, String prevBlockHash,
			String merkleHash, Integer nonce, List<Transaction> txlist)
	{
		super(System.currentTimeMillis(), blockHash, prevBlockHash, merkleHash,
				nonce, txlist);
	}

}
