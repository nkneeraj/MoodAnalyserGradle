package com.cg.moodanalyser;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
	public void stringHasSad() {
		MoodAnalyser obj = new MoodAnalyser();
		String mood = obj.analyseMood("I am sad");
		System.out.println(mood);
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void stringHasHappy() {
		MoodAnalyser obj = new MoodAnalyser();
		String mood = obj.analyseMood("I am Happy");
		System.out.println(mood);
		Assert.assertEquals("happy", mood);
	}

}
