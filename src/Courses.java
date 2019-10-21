import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter course description: ");
        String course = scan.nextLine();

        String department = course.substring(0, course.indexOf(" "));

        String course_num = course.substring((department.length() + 1), course.indexOf(" ", department.length() + 1));

        String title = course.substring(department.length() + course_num.length() + 2);

        System.out.println("Department: " + department.toUpperCase());
        System.out.println("Course Number: " + course_num);
        System.out.println("Course Title: " + title);
    }
}
