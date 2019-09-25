import becker.robots.*;


public class SuperWall {
    public static void main(String[] args) {
        City olney= new City();
        Robot karel = new Robot(olney, 6, 0, Direction.EAST, 0);

        new Wall(olney, 6, 2, Direction.WEST);
        new Wall(olney, 6, 4, Direction.WEST);
        new Wall(olney, 6, 5, Direction.WEST);
        new Wall(olney, 6, 7, Direction.WEST);
        new Wall(olney, 5, 2, Direction.WEST);
        new Wall(olney, 4, 2, Direction.WEST);
        new Wall(olney, 5, 5, Direction.WEST);
        new Wall(olney, 5, 7, Direction.WEST);
        new Wall(olney, 4, 7, Direction.WEST);
        new Wall(olney, 3, 7, Direction.WEST);


        new Wall(olney, 6, 0, Direction.SOUTH);
        new	Wall(olney, 6, 1, Direction.SOUTH);
        new Wall(olney, 6, 2, Direction.SOUTH);
        new Wall(olney, 6, 3, Direction.SOUTH);
        new Wall(olney, 6, 4, Direction.SOUTH);
        new	Wall(olney, 6, 5, Direction.SOUTH);
        new Wall(olney, 6, 6, Direction.SOUTH);
        new Wall(olney, 6, 7, Direction.SOUTH);
        new Wall(olney, 6, 8, Direction.WEST);
        new Wall(olney, 5, 8, Direction.WEST);


        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                    karel.move();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();
                karel.move();


            }

        }

        if (karel.frontIsClear()) {
            karel.move();
        }
        else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            else{
                karel.turnLeft();




            }

        }



    }
}
