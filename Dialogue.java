import java.awt.*;
/**
 * Write a description of class Dialogue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dialogue extends Dragon
{
    // instance variables - replace the example below with your own
    private String talk;

    /**
     * Constructor for objects of class Dialogue
     */
    public Dialogue()
    {
        talk = "Hello,world!";
    }
    public Dialogue(int x,int y, int size, Color c, String attackType, String talk)
    {
        super(x,y,size,c,attackType);
        this.talk = talk;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void dragonTalk(Graphics g) {
        int textX = x + size * 26;
        int textY = y + 1;
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        return g.drawString(talk, textX, textY);
    }
}
