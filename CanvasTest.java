

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CanvasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CanvasTest
{
    private Canvas canvas1;

    /**
     * Default constructor for test class CanvasTest
     */
    public CanvasTest()
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
        canvas1 = new Canvas("Test");
        canvas1.drawLine(2, 3, 100, 105);
        canvas1.fillCircle(100, 200, 50);
        canvas1.fillRectangle(40, 50, 100, 60);
        canvas1.isVisible();
        canvas1.getSize();
        canvas1.erase();
        
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
