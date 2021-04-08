package me.kalriz.lsdn.core.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.kalriz.lsdn.core.block.Block;
import me.kalriz.lsdn.core.service.interfaces.IBlockGenerateService;

public class BlockGenerateTests
{
	private IBlockGenerateService blockGenerateService = null;
	
	@BeforeEach   
	public void init()
	{
		blockGenerateService = new BlockGenerateSerivce();
	}
	
	@Test
	public void generateBlockTest()
	{
		
	}
}
