package me.kalriz.lsdn.core.transaction.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import me.kalriz.lsdn.core.transaction.Transaction;

public class SimpleTransactionTests
{
	@Test
	public void simpleTransactionTest()
	{
		Transaction tx = SimpleTransaction.builder().merkleHash("0x00")
				.blockHeight(0L).from("0x00").to("0x00")
				.speedy("000000000000000000000")
				.maxSpeedy("000000000000000000000")
				.value("000000000000001000000").data(null).build();

		// data check
		assertEquals(tx.getBlockHeight(), Long.valueOf(0));
		assertEquals(tx.getMerkleHash(), "0x00");
		assertEquals(tx.getFrom(), "0x00");
		assertEquals(tx.getTo(), "0x00");
		assertEquals(tx.getValue(), "000000000000001000000");
		assertEquals(tx.getData(), null);
	}

	@Test
	public void simpleTransactionJsonTest()
	{
		Transaction tx = SimpleTransaction.builder().merkleHash("0x00")
				.blockHeight(0L).from("0x00").to("0x00")
				.speedy("000000000000000000000")
				.maxSpeedy("000000000000000000000")
				.value("000000000000001000000").data(null).build();

		// json check
		Gson gson = new Gson();

		String jsonObj = gson.toJson(tx);

		Transaction txObj = gson.fromJson(jsonObj, SimpleTransaction.class);

		// data check
		assertEquals(txObj.getMerkleHash(), "0x00");
		assertEquals(txObj.getValue(), "000000000000001000000");
	}
}
