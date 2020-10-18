package job4jExercises.cycles;

public class Multipliers {
    public static int out(int n) {
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int rsl = Multipliers.out(6);
    }
}
