package job4jExercises.branchOperator;

public class FizzBuzz {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else
            return "Operation not support";
    }

    public static void main(String[] args) {
        String rsl = FizzBuzz.checkNumber(15);
        System.out.println(rsl);
    }
}
