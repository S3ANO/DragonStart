import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private String attackType;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.GREEN; // INS comment here.
        attackType = "Fire";
    }
    public Dragon(int x,int y, int size, Color c, String attackType){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
        this.attackType = attackType;
    }
        
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        int bodyX = x + size * 25; //Body X Coordinate
        int bodyY = y + size * 25; //Body Y Coordinate
        int [] wingX = {bodyX + size * 30, bodyX + size * 30, bodyX + size * 50};
        int [] wingY = {bodyY, bodyY - size * 25, bodyY - size * 25};
        g.setColor(c); // Dragon Color
        g.fillRect(x, y, size * 25, size * 25); //Draw Head
        g.setColor(Color.BLACK);
        g.fillRect(x, y + size * 12, size * 13, size * 10); //Draw Mouth
        g.setColor(c); // Dragon Color
        g.fillRect(bodyX, bodyY, size * 60, size * 50); //Draw Body
        g.fillRect(bodyX, bodyY + size * 25, size * 10, size * 50); //Draw Leg #1
        g.fillRect(bodyX + size * 50, bodyY + size * 25, size * 10, size * 50); //Draw Leg #2
        g.fillRect(bodyX + size * 60, bodyY, size * 10, size * 10);
        g.fillRect(bodyX + size * 70, bodyY + size * 10, size * 10, size * 10);
        g.fillRect(bodyX + size * 80, bodyY + size * 20, size * 10, size * 10);
        g.fillRect(bodyX + size * 90, bodyY + size * 30, size * 10, size * 10);
    }
    private void dragonClear(Graphics g) {
        g.setColor(Color.BLACK);
        int bodyX = x + size * 25;
        int bodyY = y + size * 25;
        g.fillRect(bodyX, bodyY + size * 25, size * 10, size * 50);
        g.fillRect(bodyX - size * 50, bodyY + size * 40, size * 50, size * 10);
    }
    private void drawFire(Graphics g) {
        g.setColor(Color.RED);
        for (int i = 1; i <= 10; i++) {
            g.fillOval(x - i * 15, y + size * 15, i * 10, i * 10);
        }
    }
    private void drawWater(Graphics g) {
        g.setColor(Color.BLUE);
        for (int i = 1; i <= 10; i++) {
            g.fillOval(x - i * 15, y + size * 15, i * 10, i * 10);
        }
    }
    private void drawElectricity(Graphics g) {
        g.setColor(Color.YELLOW);
        for (int i = 1; i <= 10; i++) {
            g.fillOval(x - i * 15, y + size * 15, i * 10, i * 10);
        }
    }
    public void dragonElement(Graphics g)
    {
        if (attackType.equals("Fire")) {
            drawFire(g);
        } else if (attackType.equals("Water")) {
            drawWater(g);
        } else if (attackType.equals("Electricity")) {
            drawElectricity(g);
        }
    }
    public void dragonMove(Graphics g) throws InterruptedException{
        int bodyX = x + size * 25;
        int bodyY = y + size * 25;
        dragonClear(g);
        g.setColor(c);
        g.fillRect(bodyX, bodyY + size * 25, size * 10, size * 25);
        g.fillRect(bodyX - size * 25, bodyY + size * 40, size * 50, size * 10);
        Thread.sleep(2000);
        dragonClear(g);
        g.setColor(c);
        g.fillRect(bodyX, bodyY + size * 25, size * 10, size * 50);
    }
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}
