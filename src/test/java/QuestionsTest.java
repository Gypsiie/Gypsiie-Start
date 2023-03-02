import org.junit.Assert;
import org.junit.Test;

public class QuestionsTest {
    Questions q = new Questions();

    @Test
    public void testQuestion1() {
        double expectedResult = Math.PI / 1;
        int actualResult = (q.question1);
        Assert.assertEquals(3, 2);
    }

    @Test
    public void testQuestion2() {
        int expectedResult = Math.pow(2, 4) - 2;
        double actualResult = (q.question2);
        Assert.assertEquals(14, 5);
    }

    @Test
    public void testQuestion3() {
        String expectedResult = new StringBuilder("xdeiDgnirtSwLskdu"
        .substring(5, 11))
        .reverse()
        .toString()
        .toLowerCase();
        
        String actualResult = q.question3();
        Assert.assertEquals(expectedResult, actualResult.trim().toLowerCase());
    }
}
