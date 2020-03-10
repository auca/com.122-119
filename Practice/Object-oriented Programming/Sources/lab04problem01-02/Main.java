import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int next = scanner.nextInt();
            numbers.add(next);
        }

        System.out.println("Before reversing:");
        System.out.println(numbers);

        reverseNumbers(numbers);

        System.out.println("After reversing:");
        System.out.println(numbers);

        addZerosBeforeEvenNumbers(numbers);

        System.out.println("After insertion:");
        System.out.println(numbers);

        removeOddNumbers(numbers);

        System.out.println("After removal:");
        System.out.println(numbers);
    }

    private static void reverseNumbers(ArrayList<Integer> numbers) {
        for (int i = 0, j = numbers.size() - 1; i < j; ++i, --j) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
        }
    }

    private static void addZerosBeforeEvenNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) % 2 == 0) {
                numbers.add(i++, 0);
            }
        }
    }

    private static void removeOddNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i--);
            }
        }
    }
}
