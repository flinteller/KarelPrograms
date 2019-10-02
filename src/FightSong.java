public class FightSong {

    public static void song_part_1(){
        System.out.println("Go, team, go! \nYou can do it.");
    }

    public static void song_part_2(){
        System.out.println("You're the best, \nIn the West.");
    }

    public static void song_goup(){
        song_part_1();
        song_part_2();
        song_part_1();
    }

    public static void song_break(){
        System.out.println(" ");
    }

    public static void main(String[] args) {
        song_part_1();
        song_break();
        song_goup();
        song_break();
        song_goup();
        song_break();
        song_part_1();







    }
}
