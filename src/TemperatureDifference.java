import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first temp: ");
        int temp_1 = scan.nextInt();
        System.out.println("Enter the second temp: ");
        int temp_2 = scan.nextInt();
        int difference = Math.abs(temp_1 - temp_2);
        System.out.println("The temperature changed " + difference + " degree(s).");


    }
}
