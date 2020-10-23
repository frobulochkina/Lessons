package job4jExercises.cycles;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl = rsl + 1;
            }

        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = Hamming.checkStrings("233", "333");
        System.out.println(result);
    }
}
