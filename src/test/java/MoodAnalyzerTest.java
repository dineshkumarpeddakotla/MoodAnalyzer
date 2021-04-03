import com.moodAnalyzer.MoodAnalyzer;
import com.moodAnalyzer.MoodAnalyzerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodTest = new MoodAnalyzer();
        String mood = moodTest.moodAnalyzer("I am in Sad Mood");
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodTest = new MoodAnalyzer();
        String mood = moodTest.moodAnalyzer("I am in Any Mood");
        Assertions.assertEquals("HAPPY",mood);
    }
    @SuppressWarnings("deprecation")
    @Test()
    public void givenNull_WhenNull_ThrowsException() {
        MoodAnalyzer moodTest = new MoodAnalyzer(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyzerException.class);
            String mood=moodTest.moodAnalyzer(null);
            Assertions.assertEquals("NULL",mood);
        }
        catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }


}
