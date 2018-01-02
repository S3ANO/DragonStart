import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]) throws InterruptedException{
       Scanner inputNum = new Scanner(System.in);
       Scanner inputText = new Scanner(System.in);
       System.out.println("Insert the Width and Height of Your Template:");
       int width = inputNum.nextInt();
       int height = inputNum.nextInt();
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       Scene s = new Scene(width, height, Color.BLACK, Color. WHITE);
       s.drawStars(g, panel);
       
       int i;
       int num;
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       
       do {
           System.out.println("How Many Dragons Do You Want?");
           num = inputNum.nextInt();
       }
       while(num <= 0);
       for(i = 1; i <= num; i++){
           System.out.println("What RGB Colors Do You Want?");
           int rgb1 = 256;
           int rgb2 = 256;
           int rgb3 = 256;
           while(rgb1 > 255 || rgb2 > 255 || rgb3 > 255) {
               rgb1 = inputNum.nextInt();
               rgb2 = inputNum.nextInt();
               rgb3 = inputNum.nextInt();
           }
           Color rgbDrag = new Color(rgb1, rgb2, rgb3);
           System.out.println("What is the Size?");
           int size = inputNum.nextInt();
           System.out.println("What Attack Do You Want? Fire, Water, or Electricity?");
           String attack = inputText.next();
           System.out.println("What Do You Want Your Dragon To Say?");
           String dialogue = inputText.next();
           Dragon temp = new Dragon(50 * i, 50 * i, size, rgbDrag, attack, dialogue);  
           dragons.add(temp);
       }
       for(i = 0; i < num; i++){
           int m = 0;
           dragons.get(i).drawDragon(g);
           dragons.get(i).dragonElement(g);
           while (m < 5) {
                Thread.sleep(1000);
                dragons.get(i).dragonMove(g);
                m++;
            }
       }
    }
}
