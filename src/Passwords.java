import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        String first;
        String middle;
        String last;
        String pass_1;
        String pass_2;
        int pass_3;
        String password;
        int age;

        Scanner scan = new Scanner(System.in);
        System.out.println("First name: ");
        first = scan.nextLine();
        System.out.println("Middle name: ");
        middle = scan.nextLine();
        System.out.println("Last name: ");
        last = scan.nextLine();
        System.out.println("Age: ");
        age = scan.nextInt();

        pass_1 = (first.substring(first.length() / 2, first.length() / 2 + 1)) + (middle.substring(middle.length() / 2, middle.length() / 2 + 1)) + (last.substring(last.length() / 2, last.length() / 2 + 1));

        pass_2 = (first.substring(first.length() - 1, first.length())) + (middle.substring(middle.length() - 1, middle.length())) + (last.substring(last.length() - 1, last.length()));

        pass_3 = age * 75;

        password = pass_1.toUpperCase() + pass_2 + pass_3;
        System.out.println(password);


    }
}
