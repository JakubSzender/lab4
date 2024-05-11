import java.util.Scanner;

public class Zad8 {
    public void Init() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargestValue(numbers);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Nie znaleziono drugiej największej liczby.");
        } else {
            System.out.println("Druga największa liczba: " + secondLargest);
        }
    }

    public int findSecondLargestValue(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
        }

        return secondMax;
    }
}
