package job4jExercises.cycles;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int rsl = DigitSum.sum(123);
        System.out.println(rsl);
    }
}
