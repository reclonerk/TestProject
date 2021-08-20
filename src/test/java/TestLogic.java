import com.rahul.Calculation;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestLogic {
    @Test
    public void testMultiply(){
        assertEquals(6,Calculation.Multiply(2, 3));
        assertEquals(-2, Calculation.Multiply(1, -1));
    }
}
