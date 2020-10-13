package job4jExercises;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        if (percent * prize > pay) {
            double sumPercent = percent * prize;
            int rsl = (int) sumPercent - pay;
            return rsl;
        }
        return 0;
    }

    public static void main(String[] args) {
        int rsl = Game.checkGame(0.2, 40, 1);
        System.out.println(rsl);
    }
}