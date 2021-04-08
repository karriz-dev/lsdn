package me.kalriz.lsdn.core.service.interfaces;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

import me.kalriz.lsdn.core.transaction.SignedTransaction;
import me.kalriz.lsdn.core.transaction.Transaction;

public interface ITransactionService
{
	public Transaction create();
	public Transaction create(String from, String to, String value);
	public SignedTransaction sign(Transaction tx, ECPrivateKey prvKey);
	public Boolean isValid(SignedTransaction tx, ECPublicKey pubKey);
}
