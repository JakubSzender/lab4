import java.util.Random;
import java.util.Scanner;
public class Zad4 {
    public void CreateTable() {
        var in = new Scanner(System.in);
        var random = new Random();
        var min = 0;
        var indeks = 0;

        System.out.println("Podaj wielkość tablicy");
        var number = in.nextInt();
        min = number;

        var tablica = new int[number];

        for (int i = 0; i <= tablica.length -1; i++) {
            tablica[i] = random.nextInt(2);
            if(tablica[i] < min){
                min = tablica[i];
                indeks = i;
            }

            System.out.print("Indeks "+i);
            System.out.println(" "+tablica[i]+"|");
        }
        System.out.print("Indeks "+indeks+" ");
        System.out.print("MIN: "+min);

    }
}
