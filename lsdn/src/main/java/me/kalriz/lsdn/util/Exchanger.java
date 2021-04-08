package me.kalriz.lsdn.util;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

public class Exchanger
{
	public static String privateKeyToString(ECPrivateKey privateKey)
	{
		return privateKey.getS().toString(16);
	}

	public static String publicKeyToString(ECPublicKey publicKey)
	{
		return publicKey.getW().getAffineX().toString(16) + ":"
				+ publicKey.getW().getAffineY().toString(16);
	}

	public static ECPrivateKey stringToPrivateKey(String privateKey)
	{
		try
		{
			AlgorithmParameters parameters = AlgorithmParameters
					.getInstance("EC");
			parameters.init(new ECGenParameterSpec("secp256k1"));

			ECParameterSpec ecParameters = parameters
					.getParameterSpec(ECParameterSpec.class);
			BigInteger s = new BigInteger(privateKey, 16);

			ECPrivateKeySpec privateSpec = new ECPrivateKeySpec(s,
					ecParameters);

			KeyFactory keyFactory = KeyFactory.getInstance("EC");
			return (ECPrivateKey) keyFactory.generatePrivate(privateSpec);

		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public static ECPublicKey stringToPublicKey(String publicKey)
	{
		try
		{
			AlgorithmParameters parameters = AlgorithmParameters
					.getInstance("EC");
			parameters.init(new ECGenParameterSpec("secp256k1"));

			ECParameterSpec ecParameters = parameters
					.getParameterSpec(ECParameterSpec.class);

			String[] pkSplit = publicKey.split(":");

			BigInteger px = new BigInteger(pkSplit[0], 16);
			BigInteger py = new BigInteger(pkSplit[1], 16);
			
			ECPoint pubPoint = new ECPoint(px, py);

			ECPublicKeySpec pubSpec = new ECPublicKeySpec(pubPoint,
					ecParameters);

			KeyFactory keyFactory = KeyFactory.getInstance("EC");
			return (ECPublicKey) keyFactory.generatePublic(pubSpec);

		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
