package me.kalriz.lsdn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenerateBlockTest {
	@BeforeEach
	public void init()
	{
		System.out.println("init");
	}
	@Test
	public void GenerateBlock()
	{
		assertEquals("123", "456");
	}
}
