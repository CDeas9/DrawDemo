import java.awt.Color;
import java.util.Random;
import java.awt.TextComponent;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;
    private Canvas roomCanvas;
    private Color brown;
    private Color white;
    private Color tan;
    private Color offWhite;
    private Color skin;
    private Color darkBrown;
    private Color dirtyBlonde;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);
        random = new Random();
        brown = new Color(160,110,35);
        white = new Color(255,255,255);
        tan = new Color(211,168,93);
        offWhite = new Color(242,236,255);
        skin = new Color(232,193,127);
        darkBrown = new Color(66,44,3);
        dirtyBlonde = new Color(229,167,52);
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for(int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for(int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for(int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));

            pen.randomSquiggle();
        }
    }

    //5.57
    public void drawTriangle()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.GREEN);

        for(int i=0; i<3; i++){
            pen.turn(120);
            pen.move(100);
        }
    }

    //5.58
    public void drawPentagon()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for(int i=0; i<5; i++){
            pen.move(80);
            pen.turn(72);
        }
    }

    //5.59
    /**
     * @param n number of sides of the polygon
     */

    public void drawPolygon(int n)
    {
        Pen pen = new Pen(200, 100, myCanvas);

        for(int i=0; i<n; i++){
            pen.move(60);
            pen.turn(360/n);
        }
    }

    //5.60
    public void spiral()
    {
        Pen pen = new Pen(150, 100, myCanvas);
        int i = 200;
        int w = 5;
        while( i!=0){
            pen.move(i);
            pen.turn(90);
            pen.move(i);
            pen.turn(90);
            i = i-w;
        }
    }

    //5.61
    public void drawRoom()
    {
        roomCanvas = new Canvas("Room", 400, 300);
        
        //floor
        roomCanvas.setForegroundColor(tan);
        roomCanvas.fillRectangle(0, 100, 400 , 170);
       
        //bed
        roomCanvas.setForegroundColor(brown);
        roomCanvas.fillRectangle(30, 60, 70 , 150);
        roomCanvas.fillRectangle(40, 200, 10 , 25);
        roomCanvas.fillRectangle(80, 200, 10 , 25);
        
        //sheets
        roomCanvas.setForegroundColor(Color.RED);
        roomCanvas.fillRectangle(45, 68, 45, 30);
        roomCanvas.fillRectangle(38, 100, 55, 100);

        //dresser 
        roomCanvas.setForegroundColor(Color.GRAY);
        roomCanvas.fillRectangle(110, 40, 100, 60);
        roomCanvas.setForegroundColor(Color.BLACK);
        int y = 55;
        for(int i=0; i<3; i++){
            roomCanvas.drawLine(110, y, 210, y);
            y = y + 15;
        }
        int r = 42;
        for(int i=0; i<4; i++){
            roomCanvas.fillCircle(155, r, 10);
            r = r + 15;
        }
        
        //desk
        roomCanvas.setForegroundColor(Color.GRAY);
        roomCanvas.fillRectangle(350, 80, 50, 80);
        
        //pencil holder
        roomCanvas.setForegroundColor(Color.BLACK);
        roomCanvas.fillCircle(370, 80, 15);
        
        //pencil
        roomCanvas.setForegroundColor(Color.YELLOW);
        roomCanvas.fillRectangle(370, 100, 20, 5);
        roomCanvas.setForegroundColor(Color.PINK);
        roomCanvas.fillRectangle(385, 100, 5, 5);
        
        //paper
        roomCanvas.setForegroundColor(white);
        roomCanvas.fillRectangle(360, 110, 30, 18);
        roomCanvas.setForegroundColor(Color.RED);
        roomCanvas.drawLine(360, 113, 390, 113);
        roomCanvas.setForegroundColor(Color.BLACK);
        int x = 365;
        for(int i=0; i<5; i++){
            roomCanvas.drawLine(x, 110, x, 128);
            x = x + 5;
        }
        
        //record player
        roomCanvas.setForegroundColor(brown);
        roomCanvas.fillRectangle(115, 10, 50, 30);
        roomCanvas.setForegroundColor(Color.BLACK);
        roomCanvas.drawLine(115, 20, 165, 20);
        roomCanvas.fillRectangle(130, 30, 20, 10);
       
        //poster
        roomCanvas.setForegroundColor(darkBrown);
        roomCanvas.fillRectangle(250, 2, 75, 85);
        roomCanvas.setForegroundColor(white);
        roomCanvas.drawString("BASTILLE", 258, 20);
        roomCanvas.drawString("BAD BLOOD", 250, 80);
        roomCanvas.drawLine(280, 22, 260, 60);
        roomCanvas.drawLine(300, 22, 320, 60);
        roomCanvas.drawLine(290, 22, 290, 27);
        roomCanvas.drawLine(290, 37, 290, 42);
        roomCanvas.drawLine(290, 52, 290, 57);
        //laptop
        roomCanvas.setForegroundColor(Color.LIGHT_GRAY);
        roomCanvas.fillRectangle(360, 135, 30, 20);
        roomCanvas.fillCircle(373, 142, 5);
        roomCanvas.setForegroundColor(white);
        roomCanvas.fillCircle(370, 140, 8);
        roomCanvas.drawLine(373, 137, 372, 139);
        roomCanvas.setForegroundColor(Color.LIGHT_GRAY);
        roomCanvas.fillCircle(374, 142, 5);
        
        //me
        roomCanvas.setForegroundColor(dirtyBlonde);
        roomCanvas.fillCircle(248, 85, 34);
        roomCanvas.setForegroundColor(skin);
        roomCanvas.fillCircle(250, 90, 30);
        roomCanvas.fillRectangle(263, 120, 5, 10);
        roomCanvas.fillRectangle(245, 128, 10, 30);
        roomCanvas.fillRectangle(275, 128, 10, 30);
        roomCanvas.setForegroundColor(dirtyBlonde);
        roomCanvas.fillCircle(263, 88, 12);
        roomCanvas.fillCircle(271, 93, 8);
        roomCanvas.setForegroundColor(Color.BLUE);
        roomCanvas.fillRectangle(255, 128, 20, 30);
        roomCanvas.fillRectangle(245, 128, 10, 10);
        roomCanvas.fillRectangle(275, 128, 10, 10);
        roomCanvas.setForegroundColor(Color.DARK_GRAY);
        roomCanvas.fillRectangle(255, 158, 8, 40);
        roomCanvas.fillRectangle(266, 158, 8, 40);
        roomCanvas.setForegroundColor(Color.BLACK);
        roomCanvas.fillCircle(255, 100, 5);
        roomCanvas.fillCircle(265, 100, 5);
        roomCanvas.fillCircle(260, 110, 8);
        roomCanvas.setForegroundColor(skin);
        roomCanvas.fillCircle(262, 110, 4);
        roomCanvas.setForegroundColor(Color.BLACK); 
        roomCanvas.drawLine(7, 7, 7, 150);
         roomCanvas.setForegroundColor(Color.BLACK); 
        roomCanvas.drawLine(5, 7, 100, 7);
        
        roomCanvas.drawString("Callie's Room", 10, 290);
        
        //lights
        int f = 15;
        int w = 16;
        int j = 18;
        int k = 17;
        for(int i=0; i<6; i++) {
            roomCanvas.setForegroundColor(Color.BLUE); 
            roomCanvas.fillRectangle(f, 10, 5, 12);
            roomCanvas.fillRectangle(w, 7, 3, 3);
            f = f+13;
            roomCanvas.setForegroundColor(white); 
            roomCanvas.fillRectangle(w, 12, 1, 1);
            roomCanvas.fillRectangle(j, 12, 1, 1);
            roomCanvas.fillRectangle(k, 8, 1, 1);
            roomCanvas.wait(100);
            k = k+13;
            w = w+13;
            j = j + 13;
        }
       
        int a = 35;
        int b = 37;
        for(int i=0; i<8; i++) {
            roomCanvas.setForegroundColor(offWhite); 
            roomCanvas.fillRectangle(8, a, 8, 8);
           a = a +15;
           roomCanvas.setForegroundColor(Color.PINK); 
           roomCanvas.fillCircle(10, b, 4);
           b = b+15;
           roomCanvas.wait(100);
        }
        
         //records
        int s = 165;
        for(int i=0; i<20; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            roomCanvas.setForegroundColor(new Color(red, green, blue));
            roomCanvas.fillRectangle(s, 20, 2, 20);
            s = s + 2;
            roomCanvas.wait(100);
        }
        
    }

    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
}
