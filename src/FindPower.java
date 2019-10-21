import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scan.nextInt();
        System.out.println("Enter the power: ");
        int power = scan.nextInt();
        double answer = Math.pow(base, power);
        System.out.println(base + "^" + power + " = " + answer);
    }
}
