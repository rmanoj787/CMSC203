
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

    private Gradebook g1;
    private Gradebook g2;

    @BeforeEach
    public void setUp() {
        g1 = new Gradebook(5);
        g2 = new Gradebook(5);

        g1.addScore(85.5);
        g1.addScore(92.0);
        g1.addScore(76.5);

        g2.addScore(78.0);
        g2.addScore(88.5);
    }

    @AfterEach
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        assertEquals("85.5 92.0 76.5 ", g1.toString());
        assertEquals("78.0 88.5 ", g2.toString());

        assertEquals(3, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(254.0, g1.sum(), 0.001);
        assertEquals(166.5, g2.sum(), 0.001);
    }

    @Test
    public void testMinimum() {
        assertEquals(76.5, g1.minimum(), 0.001);
        assertEquals(78.0, g2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(177.5, g1.finalScore(), 0.001);
        assertEquals(88.5, g2.finalScore(), 0.001);
    }

    @Test
    public void testGetScoreSize() {
        assertEquals(3, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    public void testToString() {
        assertEquals("85.5 92.0 76.5 ", g1.toString());
        assertEquals("78.0 88.5 ", g2.toString());
    }
}
