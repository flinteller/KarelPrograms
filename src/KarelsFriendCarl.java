import becker.robots.*;

public class KarelsFriendCarl {
    public static void main(String[] args) {
        City city = new City();
        Robot karel = new Robot(city,0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(city, 3, 0, Direction.EAST, 0);

        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();

        carl.pickThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.putThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();




    }
}
