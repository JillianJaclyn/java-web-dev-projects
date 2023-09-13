import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void showsRAM () {
        Computer Test = new Computer (16, 500, "NVIDIA");
        assertEquals(16, Test.getRAM());
        }
}
