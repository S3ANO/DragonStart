import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       
       Dragon jen = new Dragon();
       
       jen.drawDragon(g);
     
       System.out.println(jen);
       
       Dragon sarah = new Dragon(300,300,2, Color.PINK, "Fire");
       sarah.drawDragon(g);
       sarah.dragonElement(g);
    }
}
