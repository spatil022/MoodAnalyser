package com.bridgelabz.refactor;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyseTest
{

	static MoodAnalyser moodanalyser;
	static MoodAnalyser moodanalyser1;
	static MoodAnalyser moodanalyser2;

//	@BeforeClass
//	public static void MoodAnalyseObj()
//	{
//		moodanalyser = new MoodAnalyser();
//	}
	@BeforeClass
	public static void MoodAnalyseObj()
	{
		moodanalyser1 = new MoodAnalyser("I am in Sad mood");
		moodanalyser2 = new MoodAnalyser("I am in Any mood");
	}
	@Test
	public void givenMessage_whenSad_shouldReturnSad()
	{
		moodanalyser = new MoodAnalyser("I am in Sad mood");
		Assert.assertEquals("SAD", moodanalyser.analyseMood());
		String mood = moodanalyser1.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy()
	{
		moodanalyser = new MoodAnalyser("I am in Any mood");
		Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
		String mood = moodanalyser2.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}