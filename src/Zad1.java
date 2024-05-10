import java.util.Scanner;
public class Zad1 {
    public void table() {
        int[] tablica = new int[10];
        var in = new Scanner(System.in);

        System.out.println("Podaj 10 liczb");

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę" +i);
            tablica[i] = in.nextInt();
        }
        for (int item : tablica)
        {
            System.out.print(" "+item);
        }
    }
}
