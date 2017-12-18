import java.awt.*;
/**
 * Write a description of class Scene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    private Color horizonColor;
    private Color starColor;

    /**
     * Constructor for objects of class Scene
     */
    public Scene()
    {
        // initialise instance variables
       width = 800;
       height = 800;
       horizonColor = Color.BLACK;
       starColor = Color.WHITE;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Scene(int width, int height, Color horizonColor, Color starColor)
    {
        // initialise instance variables
        this.width = width;
        this.height = height;
        this.horizonColor = horizonColor;
        this.starColor = starColor;
    }
    public void drawStars(Graphics g, DrawingPanel panel)
    {
        panel.setBackground(horizonColor);
        g.setColor(starColor);
        int xMultiply = panel.getX() / 50;
        for (int i = 0; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply, 5, 5);
        }
        for (int i = 1; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 10, 5, 5);
        }
        for (int i = 0; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 20, 5, 5);
        }
        for (int i = 1; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 30, 5, 5);
        }
        for (int i = 0; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 40, 5, 5);
        }
        for (int i = 1; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 50, 5, 5);
        }
        for (int i = 0; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 60, 5, 5);
        }
        for (int i = 1; i < xMultiply; i++) {
            g.fillRect(xMultiply * (i * 10), xMultiply * 70, 5, 5);
        }
    }
}
