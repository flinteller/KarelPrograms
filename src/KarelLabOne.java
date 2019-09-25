import becker.robots.*;

public class KarelLabOne {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,3, 2, Direction.EAST, 0);

        Thing thing1 = new Thing(ssfs, 1, 4);
        Thing thing2 = new Thing(ssfs, 2, 4);
        Thing thing3 = new Thing(ssfs, 3, 4);
        Thing thing4 = new Thing(ssfs, 4, 4);
        Thing thing5 = new Thing(ssfs, 5, 4);

        // Moves thing one
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putThing();

        // Moves thing two
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();

        // Moves things three
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putThing();

        //Moves thing four
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();

        // Moves robot to final position
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();




    }
}
