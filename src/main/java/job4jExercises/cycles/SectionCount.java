package job4jExercises.cycles;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        if (section > length) {
            return 0;
        } else {
            while (length - count * section >= section) {
                    count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int rsl = SectionCount.count(11, 3);
        System.out.println(rsl);
    }
}
