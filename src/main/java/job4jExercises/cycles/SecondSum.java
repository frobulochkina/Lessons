package job4jExercises.cycles;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        while (a <= b) {
            rsl = rsl + a;
            a = a + 2;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = SecondSum.sum(1, 5);
        System.out.println(result);
    }
}
