package job4jExercises.cycles;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = n - (n / d) * d;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ModWithLoop.mod(19, 6));
    }
}
