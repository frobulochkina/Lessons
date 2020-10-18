package job4jExercises.branchOperator;

public class AttackRook {
    public static boolean check(String left, String right) {
        if (left.charAt(0) == right.charAt(0)) {
            return true;
        } else if (left.charAt(1) == right.charAt(1)) {
            return true;
        } else
        return false;
    }

    public static void main(String[] args) {
        boolean rsl = AttackRook.check("B2", "A2");
        System.out.println(rsl);
    }
}
