import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        int x_cord1 = scan.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int y_cord1 = scan.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int x_cord2 = scan.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int y_cord2 = scan.nextInt();

        double distance = Math.sqrt(Math.pow(x_cord2 - x_cord1, 2.0) + (Math.pow(y_cord2 - y_cord1, 2.0)));

        System.out.println("The distance between (" + x_cord1 + "," + y_cord1 + ")" + " and " + "(" + x_cord2 + "," + y_cord2 + ") is " + distance);
    }
}