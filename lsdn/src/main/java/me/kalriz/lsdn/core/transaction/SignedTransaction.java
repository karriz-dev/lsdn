package me.kalriz.lsdn.core.transaction;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class SignedTransaction
{
	private Transaction transaction;
	private String signature;
}
