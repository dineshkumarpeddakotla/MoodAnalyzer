package com.moodAnalyzer;

public class MoodAnalyzer {
    public String moodAnalyzer(String message){
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
