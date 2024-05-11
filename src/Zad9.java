import java.util.Scanner;
public class Zad9 {

    public void Init() {
        var scanner = new Scanner(System.in);
        var numbers = new int[100];
        var index = 0;

        System.out.println("Podaj ciąg liczb całkowitych (wpisz 0 aby zakończyć):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("Liczby parzyste:");

        for (int i = 0; i < index; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
