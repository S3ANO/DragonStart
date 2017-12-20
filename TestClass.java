import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       System.out.println("Insert the Width and Height of Your Template:");
       int width = input.nextInt();
       int height = input.nextInt();
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       Scene s = new Scene();
       s.drawStars(g, panel);
       
       int i;
       int num;
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       
       do {
           System.out.println("How Many Dragons Do You Want?");
           num = input.nextInt();
       }
       while(num <= 0);
       
       for(i = 1; i <= num; i++){
           //Dragon 
           //dragons.add(temp);
       }
       for(i = 0; i <= dragons.size(); i++){
           //Dragon 
           //dragons.get(i).dragonElement
       }
       Dragon jen = new Dragon();
       
       jen.drawDragon(g);
       jen.dragonElement(g);
     
       System.out.println(jen);
       
       Dragon sarah = new Dragon(300, 300, 2, Color.PINK, "Water");
       sarah.drawDragon(g);
       sarah.dragonElement(g);
       i = 0;
       int m = 0;
       while (i <= dragons.size()){
            while (m <= 10) {
                Thread.sleep(1000);
                dragons.get(i).dragonMove(g);
                m++;
            }
            i++;
   }
}
}
