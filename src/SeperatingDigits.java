import java.util.Scanner;


public class SeperatingDigits {

    private static int get_remainder(int a) {
        int remainder = a % 10;
        return remainder;
    }

    private static int get_quotient(int a) {
        int quotient = a / 10;
        return quotient;
    }

    private static void display_digits(int user_num) {
        //First digit
        int quotient_1a = get_quotient(user_num);
        int quotient_1b = get_quotient(quotient_1a);
        int quotient_1c = get_quotient(quotient_1b);
        int a = quotient_1c;

        //Second digit
        int quotient_2a = get_quotient(user_num);
        int quotient_2b = get_quotient(quotient_2a);
        int remainder_2 = get_remainder(quotient_2b);
        int b = remainder_2;

        //Third digit
        int quotient_3 = get_quotient(user_num);
        int remainder_3 = get_remainder(quotient_3);
        int c = remainder_3;

        //Fourth digit
        int quotient_4 = get_remainder(user_num);
        int d = quotient_4;

        System.out.println(a + "  " + b + "  " + c + "  " + d);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int user_num = scan.nextInt();
        display_digits(user_num);

    }
}
