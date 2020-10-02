package com.cg.moodanalyser;

public class MoodAnalyser {
	
//	public static void main(String[] args) {
//	System.out.println("Welcome to Mood analyser");
//	}
	private String message;
	public MoodAnalyser() {
		
	}
	
	public String MoodAnalyser(String message)
	{
		this.message = message;
		return analyseMood(message);
	}
	
	
	public String analyseMood(String message) {
		if (message.contains("any"))
			return "happy";
		else
			return "sad";
	}
}
