package com.moodAnalyzer;

public class MoodAnalyzer {
    public String message;
    //Creating Two Constructors of Non-Parameterized And Non-Parameterized
    public MoodAnalyzer(){
    }
    public MoodAnalyzer(String message){

        this.message= message;
    }
    //Checking The User Is Sad
    public String moodAnalyzer(String message) throws MoodAnalyzerException {
        //Checking For Exception If Any
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.emptyInput, "You Have Passed Empty,Please Check Again");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        //Catching Null Pointer Exception
        catch (NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.nullInput,"You Have Passed A Null,Please Check Again");
        }
    }



}

