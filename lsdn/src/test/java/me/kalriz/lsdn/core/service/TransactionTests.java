package me.kalriz.lsdn.core.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.core.service.interfaces.IAccountService;
import me.kalriz.lsdn.core.service.interfaces.ITransactionService;
import me.kalriz.lsdn.core.transaction.SignedTransaction;
import me.kalriz.lsdn.core.transaction.Transaction;
import me.kalriz.lsdn.dto.account.Account;

public class TransactionTests
{
	private ITransactionService transactionService = null;
	private IAccountService accountService = null;
	
	private Account testAccount = null;
	
	@BeforeEach
	public void init()
	{
		transactionService = new TransactionService();
		accountService = new AccountService();
		
		testAccount = accountService.generate();
	}
	
	@Test
	public void transactionGenerateTest()
	{
		Transaction t = transactionService.create("genesis_account", "20f8594872badfa8471e13416963ec2a7c26034a15e08ac86188906260763ec9ceabd71f858076af078ccdd17ac84936e128e2964e8cd77bc8a47f8608b793d8", "5500000000000000000");
	
		assertNotNull(t);
	}
	
	@Test
	public void transactionSigningTest()
	{
//		Transaction t = transactionService.create();
//		
//		SignedTransaction signedTransaction = transactionService.sign(t, testAccount.getPrivateKey());	
//		
//		assertNotNull(signedTransaction);
	}
	
	@Test
	public void transactionValidationTest()
	{
//		Transaction t = transactionService.create();
//	
//		SignedTransaction signedTransaction = transactionService.sign(t, testAccount.getPrivateKey());	
//		
//		assertNotNull(signedTransaction);
//		
//		assertTrue(transactionService.isValid(signedTransaction, testAccount.getPublicKey()));
	}
}
