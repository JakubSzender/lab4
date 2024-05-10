import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Zad5 {
    public void CreateTable() {
        var in = new Scanner(System.in);
        var random = new Random();

        System.out.println("Podaj wielkość tablicy");
        var number = in.nextInt();
        var table = new int[number];

        FillTable(table, random);
        PrintTableItems(table);
        Arrays.sort(table);
        PrintTableItems(table);
    }

    public void FillTable (int[] table, Random random)
    {
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(11);
        }
    }

    public void PrintTableItems(int[] table)
    {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Indeks:"+ i);
            System.out.println(" "+table[i]+"|");
        }

        System.out.println();
    }
}
