package job4jExercises.branchOperator;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && !(year % 100 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean rsl = LeapYear.checkYear(100);
        System.out.println(rsl);
    }
}
