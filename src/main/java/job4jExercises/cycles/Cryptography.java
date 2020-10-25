package job4jExercises.cycles;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        } else if (s.length() <= 4) {
            return s;
        } else {
            for (int i = 0; i < s.length() - 4; i++) {
                StringBuilder str = new StringBuilder(s);
                str.setCharAt(i, '#');
                s = str.toString();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String rsl = Cryptography.code("4556364607935616");
        String rsl1 = Cryptography.code("");
        String rsl2 = Cryptography.code("4556");
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}