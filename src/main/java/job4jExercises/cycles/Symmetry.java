package job4jExercises.cycles;

public class Symmetry {
    public static boolean check(int i) {
        String rsl = String.valueOf(i);
        int index = rsl.length() - 1;
        int j = 0;
        while (index > rsl.length() / 2) {
            while (j < rsl.length() / 2) {
                if (rsl.charAt(index) == rsl.charAt(j)) {
                    index--;
                    j++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean check = Symmetry.check(123321);
        System.out.println(check);
    }
}
