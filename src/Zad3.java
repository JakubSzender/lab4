import java.util.Scanner;
public class Zad3 {
    public void table() {
        var in = new Scanner(System.in);
        int max = 0;

        System.out.println("Podaj wielkość tablicy");
        var number = in.nextInt();

        int[] tablica = new int[number];

        for (int i = 0; i <= tablica.length -1; i++) {
            System.out.println("Podaj liczbę" +i);
            tablica[i] = in.nextInt();
            if(tablica[i]>max){
                max = tablica[i];
            }
        }
        System.out.println("MAX: "+max);

    }
}
