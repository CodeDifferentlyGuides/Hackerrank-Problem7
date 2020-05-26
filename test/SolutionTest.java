import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest(){
        String input = "42
                        100
                        125";
        String expected = "42
                        100
                        125";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
