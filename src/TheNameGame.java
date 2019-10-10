import java.util.Scanner;

public class TheNameGame {

    public static void song_1(String name) {
        System.out.println(name + " " + name + ", " + "bo-B" + name.substring(1));
        System.out.println("Banana-fana fo-F" + name.substring(1));
        System.out.println("Fee-fi-mo-M" + name.substring(1));
        System.out.println(name.toUpperCase() + "!");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first name: ");
        String first = scan.nextLine();
        System.out.println("Enter a last name: ");
        String last = scan.nextLine();

        song_1(first);
        song_1(last);

    }
}
