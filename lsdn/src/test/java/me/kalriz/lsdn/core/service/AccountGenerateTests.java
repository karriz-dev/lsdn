package me.kalriz.lsdn.core.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.core.service.interfaces.IAccountService;
import me.kalriz.lsdn.dto.account.Account;
import me.kalriz.lsdn.util.Exchanger;

public class AccountGenerateTests
{
	private IAccountService accountGenerateService = null;
	
	@BeforeEach
	public void init()
	{
		accountGenerateService = new AccountService();
	}
	
	@DisplayName("Test account generate")
	@Test
	public void generateAccountTest()
	{
		Account a = accountGenerateService.generate();
		
		assertNotNull(a);
	}
	
	@DisplayName("Test private convert")
	@RepeatedTest(value = 1000, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
	public void accountPrivateKeyConvertTest()
	{
		Account a = accountGenerateService.generate();
		
		String privatekeyToStringValue = Exchanger.privateKeyToString(a.getPrivateKey());
		
		ECPrivateKey privatekey = Exchanger.stringToPrivateKey(privatekeyToStringValue);
		
		assertEquals(privatekey, a.getPrivateKey());
	}
	
	@DisplayName("Test publickey convert")
	@RepeatedTest(value = 1000, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
	public void accountPublicKeyConvertTest()
	{
		Account a = accountGenerateService.generate();
		
		String publickeyToStringValue = Exchanger.publicKeyToString(a.getPublicKey());
		
		ECPublicKey publicKey = Exchanger.stringToPublicKey(publickeyToStringValue);
		
		assertEquals(publicKey, a.getPublicKey());
	}
}
