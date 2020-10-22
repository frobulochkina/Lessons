package job4jExercises.cycles;

public class OddCount {
    public static int count(int a, int b) {
        int rsl = 0;
        while (a <= b) {
            if (a % 2 == 1) {
                rsl += 1;
            }
            a++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = OddCount.count(0, 9);
        System.out.println(result);
    }
}


