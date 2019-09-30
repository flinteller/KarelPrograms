import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args) {
        int x_cord;
        int y_cord;
        int length;
        int height;
        double perimeter;

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
        perimeter = rec.getHeight() * 2 + rec.getWidth() * 2;

        rec.setLocation((int)(rec.getX() - 4) , (int)(rec.getY() + 2));

        System.out.println("Perimeter is " + perimeter);
        System.out.println("New location is (" + rec.getX() + " , " + rec.getY() + ")");


    }
}
