package me.kalriz.lsdn.core.service;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

import me.kalriz.lsdn.core.service.interfaces.ITransactionService;
import me.kalriz.lsdn.core.transaction.SignedTransaction;
import me.kalriz.lsdn.core.transaction.Transaction;
import me.kalriz.lsdn.core.transaction.v1.SimpleTransaction;

public class TransactionService implements ITransactionService
{

	@Override
	public Transaction create()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Transaction create(String from, String to, String value)
	{
		return SimpleTransaction.builder()
				.blockHeight(0L).from("genesis_account").to("20f8594872badfa8471e13416963ec2a7c26034a15e08ac86188906260763ec9ceabd71f858076af078ccdd17ac84936e128e2964e8cd77bc8a47f8608b793d8")
				.speedy("0000000000000000000")
				.maxSpeedy("0000000000000000000")
				.value("5500000000000000000").data(null).build();
	}

	@Override
	public SignedTransaction sign(Transaction tx, ECPrivateKey prvKey)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValid(SignedTransaction tx, ECPublicKey pubKey)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
