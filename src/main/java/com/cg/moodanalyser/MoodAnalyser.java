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
		if (message.contains("any"))
			return "happy";
		else
			return "sad";
	}

//	public String MoodAnalyser(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
