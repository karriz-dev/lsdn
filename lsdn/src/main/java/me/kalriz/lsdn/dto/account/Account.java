package me.kalriz.lsdn.dto.account;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

public class Account {
	private PrivateKey privateKey;
	private PublicKey publicKey;

	public Account() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		KeyPairGenerator g = KeyPairGenerator.getInstance("EC");
		ECGenParameterSpec kpgparams = new ECGenParameterSpec("secp256r1");

		g.initialize(kpgparams);

		KeyPair pair = g.generateKeyPair();

		this.privateKey = pair.getPrivate();
		this.publicKey = pair.getPublic();
	}
}
