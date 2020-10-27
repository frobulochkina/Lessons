package job4jExercises.cycles;

public class Abbreviation {
    public static String collect(String s) {
        String[] rsl = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < rsl.length; i++) {
            str.append(rsl[i].charAt(0)).toString();
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String rsl = Abbreviation.collect("North Atlantic Treaty Organization");
        String rsl1 = Abbreviation.collect("Chief Executive Officer");
        String rsl2 = Abbreviation.collect("United Nations Organization");
        System.out.println(rsl);
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}