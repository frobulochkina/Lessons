package job4jExercises.cycles;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 1;
        while (a <= b) {
            rsl = rsl * a;
            a++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = MultiplicationLoop.mult(3, 5);
        System.out.println(rsl);
    }
}
