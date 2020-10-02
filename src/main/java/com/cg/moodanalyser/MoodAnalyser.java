package com.cg.moodanalyser;

public class MoodAnalyser {
	
	private String message;
	public MoodAnalyser() {
		
	}
	
	public String MoodAnalyser(String message)
	{
		this.message = message;
		return analyseMood();
	}
	
	
	public String analyseMood() {
		try {
		if (message.contains("any"))
			return "happy";
		else
			return "sad";
		}
		catch(Exception e)
		{
			return "null";
		}
	}

//	public String MoodAnalyser(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
