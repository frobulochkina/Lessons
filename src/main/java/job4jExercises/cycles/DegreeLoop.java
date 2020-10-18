package job4jExercises.cycles;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = DegreeLoop.calculate(2, 5);
        System.out.println(rsl);
    }
}
