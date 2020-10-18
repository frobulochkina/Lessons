package job4jExercises.cycles;

public class SweetPrice {
    public static int out(int price) {
        int price1 = 0;
        for (int i = 1; i <= 5; i++) {
            price1 = i * price;
            System.out.println(price1);
        }
        return price1;
    }

    public static void main(String[] args) {
        int rsl = SweetPrice.out(35);
    }
}
