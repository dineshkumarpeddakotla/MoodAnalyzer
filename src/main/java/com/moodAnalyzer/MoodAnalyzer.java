package com.moodAnalyzer;

public class MoodAnalyzer {
    public String message;
    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message){
        this.message= message;
    }
    public String moodAnalyzer(String message){
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
