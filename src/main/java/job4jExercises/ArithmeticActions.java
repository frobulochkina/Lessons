package job4jExercises;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl == left + right) {
            return "added";
        } else if (rsl == left - right) {
            return "subtracted";
        } else if (rsl == right - left) {
            return "subtracted";
        }	else if (rsl == left * right) {
            return "multiplied";
        } else if (rsl == left / right) {
            return "divided";
        } else if (rsl == right / left) {
            return "divided";
        } else
            return "none";
    }

    public static void main(String[] args) {
        String rsl = ArithmeticActions.selectAction(2, 3, 6);
        System.out.println(rsl);
    }
}
