package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void twoPlayersWithAScoreEqualToZeroMustReturnStringEqualsToLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		Assert.assertEquals(tennisGame.getScore(), "love-all");
	}
	
	@Test
	public void theServerWithFifteenAndTheOthersWithZeroMustReturnStringEqualsToFifteenZero()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.addPointServer();
		Assert.assertEquals(tennisGame.getScore(), "fifteen-love");		
	}

}
