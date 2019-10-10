public class Names {
    public static void main(String[] args) {
        String first = "Bryan";
        String last = "Wilkersin";

        System.out.println(first + " " + last);

        int total_length = first.length() + last.length();
        System.out.println(total_length);

        System.out.println(first.substring(0, 1) + last.substring(0, 1));

        System.out.println(first.compareTo(last));

        System.out.println(last.indexOf(first.substring(first.length() - 1)));

        System.out.println(first.indexOf(last.substring(last.length() - 1)));

        String first_first = first.substring(0, first.length() / 2);
        String last_first = first.substring(first.length() / 2);

        String first_last = last.substring(0, last.length() / 2);
        String last_last = last.substring(last.length() / 2);

        System.out.println(first_first + last_last + " " + first_last + last_first);


    }
}
