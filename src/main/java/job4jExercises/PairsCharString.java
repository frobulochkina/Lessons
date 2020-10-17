package job4jExercises;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.length() == 0 || r.length() == 0) {
            return true;
        } else if (l.charAt(0) == r.charAt(r.length()-1) && l.charAt(l.length()-1) == r.charAt(0)) {
            return true;
        } else
        return false;
    }

    public static void main(String[] args) {
        boolean rsl = PairsCharString.check("103", "321");
        System.out.println(rsl);
        boolean rsl1 = PairsCharString.check("", "");
        System.out.println(rsl1);
        boolean rsl2 = PairsCharString.check("12d", "12d");
        System.out.println(rsl2);
    }
}
