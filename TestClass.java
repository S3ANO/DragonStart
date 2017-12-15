import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       Scene s = new Dragon();
       
       int i = 0;
       
       Dragon jen = new Dragon();
       
       jen.drawDragon(g);
       jen.dragonElement(g);
     
       System.out.println(jen);
       
       Dragon sarah = new Dragon(300, 300, 2, Color.PINK, "Water");
       sarah.drawDragon(g);
       sarah.dragonElement(g);
       while (i <= 20) {
           Thread.sleep(1000);
           sarah.dragonMove(g);
           i++;
       }
   }
}
