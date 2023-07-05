import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCodeTest {
    @Test
    public void testAddition() {
        int result = MyCode.add(2, 3);
        assertEquals(5, result);
    }
}
