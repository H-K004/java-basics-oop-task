import java.util.Arrays;

public class BasicsDemo {
    public static void main(String[] args) {
        int number = 7;

        // Condition
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // For loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + (i < 5 ? " " : "\n"));
        }

        // While loop
        int countdown = 3;
        System.out.println("Countdown:");
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        // Array and traversal
        int[] marks = {82, 76, 91, 68, 88};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total marks: " + total);
        System.out.printf("Average marks: %.2f%n", average);
    }
}
