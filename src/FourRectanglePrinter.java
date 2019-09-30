import java.awt.*;

public class FourRectanglePrinter {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(0,0,5,7);
        System.out.println(box);
        box.translate((int)box.getWidth(), 0);
        System.out.println(box);
        box.translate(0, -(int)box.getHeight());
        System.out.println(box);
        box.translate(-(int)box.getWidth(), 0);
        System.out.println(box);

    }
}
