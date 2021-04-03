import com.moodAnalyzer.MoodAnalyzer;
import com.moodAnalyzer.MoodAnalyzerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
    @Test()
    public void givenNull_WhenNull_ThrowsException() {
        MoodAnalyzer moodTest = new MoodAnalyzer(null);
        try {
            moodTest.moodAnalyzer(null);
        }
        catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.exceptionType.nullInput,e.type);
        }
    }
    @Test
    public void givenEmpty_WhenEmpty_ThrowsException() {
        MoodAnalyzer moodTest = new MoodAnalyzer();
        try {
            moodTest.moodAnalyzer("");
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.exceptionType.emptyInput, e.type);
        }
    }
}
