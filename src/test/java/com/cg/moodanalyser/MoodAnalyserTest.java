package com.cg.moodanalyser;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void stringHasSad() {
		MoodAnalyser obj = new MoodAnalyser();
		String mood = obj.MoodAnalyser("I am sad");
		System.out.println(mood);
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void stringHasHappy() {
		MoodAnalyser obj = new MoodAnalyser();
		String mood = obj.MoodAnalyser("I am in any mood");
		System.out.println("happy");
		Assert.assertEquals("happy", mood);
	}
}
