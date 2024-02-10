import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    private final MathService mathService = new MathService();

    @Test
    void testGetAnswerWithNegativeDiscriminant() {
        assertThrows(NotFoundAnswerException.class, () -> mathService.getAnswer(1, 2, 3));
    }

    @Test
    void testGetAnswerWithZeroDiscriminant() {
        try {
            Pair result = mathService.getAnswer(1, 2, 1);
            assertNotNull(result);
            assertEquals(-1.0, result.first);
            assertEquals(-1.0, result.second);
        } catch (NotFoundAnswerException e) {
            fail("Unexpected NotFoundAnswerException");
        }
    }

    @Test
    void testGetAnswerWithPositiveDiscriminant() {
        try {
            Pair result = mathService.getAnswer(1, -3, 2);
            assertNotNull(result);
            assertEquals(2.0, result.first);
            assertEquals(1.0, result.second);
        } catch (NotFoundAnswerException e) {
            fail("Unexpected NotFoundAnswerException");
        }
    }

    @Test
    void testGetD() {
        assertEquals(4, mathService.getD(1, -3, 2));
        assertEquals(0, mathService.getD(1, 2, 1));
        assertEquals(-8, mathService.getD(1, 2, 3));
    }
}