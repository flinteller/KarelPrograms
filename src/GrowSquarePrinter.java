import java.awt.*;

public class GrowSquarePrinter {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(100, 100, 50, 50);
        System.out.println(square);
        square.grow((int)square.getWidth() / 2, (int)square.getHeight() / 2);
        square.translate((int)square.getWidth() / 4, (int)square.getHeight() / 4);
        System.out.println(square);
    }
}
