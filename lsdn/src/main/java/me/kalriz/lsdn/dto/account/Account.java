package me.kalriz.lsdn.dto.account;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {
	private ECPrivateKey privateKey;
	private ECPublicKey publicKey;
	private String address;
	private BigInteger balance;
}
