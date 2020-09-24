import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void when4El4() {
        int[] input = {3, 5, 4, 6};
        int value = 5;
        int rsl = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(rsl, is(expect));
    }
}