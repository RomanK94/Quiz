import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() throws Exception {
        final String testValue = "Player";
        final String expectValue = testValue;
        final Player player = new Player(testValue);
        final String actualValue = player.getName();
        assertEquals(expectValue,actualValue);
    }
}