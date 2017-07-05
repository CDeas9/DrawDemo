

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorTest
{
    private Canvas canvas1;

    /**
     * Default constructor for test class ColorTest
     */
    public ColorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        canvas1 = new Canvas("ColorTest");
        canvas1.setForegroundColor(java.awt.Color.RED);
        canvas1.fillCircle(100, 100, 100);
        canvas1.setForegroundColor(java.awt.Color.YELLOW);
        canvas1.fillRectangle(2, 2, 40, 80);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
