package com.aeq.test;
import com.aeq.Castle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CastleTestCase {
	
	Castle castle = new Castle();
	
	@Test
	public void testMultiplePeaksAndValleys() {
		int [] arr ={1,4,0,10,5,10,-9,12};
		assertEquals(8,castle.getCastleCount(arr));
	}
	
	@Test
	public void testEmptyLandscape() {
		int [] arr ={};
		assertEquals(0,castle.getCastleCount(arr));
	}
	
	@Test
	public void testSingleEntryLandscape() {
		int [] arr ={1};
		assertEquals(1,castle.getCastleCount(arr));
	}
	
	@Test
	public void testSameHeightLandscape() {
		int [] arr ={1,1};
		assertEquals(1,castle.getCastleCount(arr));
	}
	
	@Test
	public void testPeakAtEnd() {
		int [] arr ={1,2,0,9,5,10};
		assertEquals(6,castle.getCastleCount(arr));
	}
	
	@Test
	public void testTooManyEntries() {
		int [] arr ={1,2,0,9,5,10,-1,5,6,7,8,1,10,100,12,11,0,11,12,12,12};
		assertEquals(12,castle.getCastleCount(arr));
	}
}
