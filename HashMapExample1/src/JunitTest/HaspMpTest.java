package JunitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static JunitTest.HaspMp.add;
import static org.junit.Assert.assertEquals;

public class HaspMpTest {
    @Test
    public void TestAdd()
    {
        Assertions.assertTrue(add(1, 2));
    }
}
