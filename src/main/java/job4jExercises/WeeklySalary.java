package job4jExercises;

import java.util.Arrays;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        int[] mulHours = new int[hours.length];
        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    mulHours[i] = hours[i] * 10;
                } else {
                    mulHours[i] = (hours[i] - 8) * 15 + 8 * 10;
                }
            } else {
                if (hours[i] <= 8) {
                    mulHours[i] = hours[i] * 20;
                } else {
                    mulHours[i] = (hours[i] - 8) * 30 + 8 * 20;
                }
            }
        }
        return Arrays.stream(mulHours).sum();
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 10, 8, 8, 5, 3};
        int rsl =  WeeklySalary.calculate(array);
        System.out.println(rsl);
    }
}
