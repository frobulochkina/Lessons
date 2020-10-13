package job4jExercises;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int sumCup = count / n + count;
        return sumCup;
    }

    public static void main(String[] args) {
        int rsl = BonusCupCoffee.countCup(7, 6);
        System.out.println(rsl);
    }
}
