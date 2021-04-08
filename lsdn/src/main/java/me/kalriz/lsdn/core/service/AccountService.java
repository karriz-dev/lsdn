package me.kalriz.lsdn.core.service;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;

import me.kalriz.lsdn.core.service.interfaces.IAccountService;
import me.kalriz.lsdn.dto.account.Account;

public class AccountService implements IAccountService
{

	@Override
	public Account generate()
	{
		try
		{
			KeyPairGenerator g = KeyPairGenerator.getInstance("EC");
			ECGenParameterSpec kpgparams = new ECGenParameterSpec("secp256k1");

			g.initialize(kpgparams);

			KeyPair pair = g.generateKeyPair();

			return Account.builder()
					.privateKey((ECPrivateKey) pair.getPrivate())
					.publicKey((ECPublicKey) pair.getPublic()).address("")
					.build();

		} catch (Exception e)
		{
			return null;
		}
	}

	@Override
	public Boolean isValidAddress(String address)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
