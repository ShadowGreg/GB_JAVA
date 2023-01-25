import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test
    void IV() {
        Solution solution = new Solution();
        int actual = solution.romanToInt("IV");

        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    void III() {
        Solution solution = new Solution();
        int actual = solution.romanToInt("III");

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void LVIII() {
        Solution solution = new Solution();
        int actual = solution.romanToInt("LVIII");

        int expected = 58;

        assertEquals(expected, actual);
    }
    @Test
    void MCMXCIV() {
        Solution solution = new Solution();
        int actual = solution.romanToInt("MCMXCIV");

        int expected = 1994;

        assertEquals(expected, actual);
    }
    @Test
    void D() {
        Solution solution = new Solution();
        int actual = solution.romanToInt("D");

        int expected = 500;

        assertEquals(expected, actual);
    }
}