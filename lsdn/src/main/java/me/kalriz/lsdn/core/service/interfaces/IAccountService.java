package me.kalriz.lsdn.core.service.interfaces;

import me.kalriz.lsdn.dto.account.Account;

public interface IAccountService
{
	public Account generate();
	public Boolean isValidAddress(String address);
}
