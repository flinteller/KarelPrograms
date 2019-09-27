import java.awt.*;
import java.util.Scanner;


public class PointsAndRectangles {
    public static void main(String[] args) {
        int x_cord;
        int y_cord;
        int length;
        int height;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x cord: ");
        x_cord = scan.nextInt();
        System.out.println("Enter y cord: ");
        y_cord = scan.nextInt();
        System.out.println("Enter rectangle length: ");
        length = scan.nextInt();
        System.out.println("Enter rectangle width: ");
        height = scan.nextInt();

        Rectangle rec = new Rectangle(x_cord, y_cord, length, height);
        Point point = new Point(x_cord, y_cord);
        Dimension dem = new Dimension(length, height);

        System.out.println(point);
        System.out.println(dem);
        System.out.println(rec);



    }
}
