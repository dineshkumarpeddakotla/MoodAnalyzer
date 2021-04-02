import com.moodAnalyzer.MoodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodTest = new MoodAnalyzer();
        String mood = moodTest.moodAnalyzer("I am in Sad Mood");
        Assertions.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodTest = new MoodAnalyzer();
        String mood = moodTest.moodAnalyzer("I am in Any Mood");
        Assertions.assertEquals("HAPPY",mood);
    }
}
