import java.util.Scanner;
import java.util.Arrays;

public class Zadanie_cyfry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab;
        int[] tab2;
        tab = new int[4];
        tab2 = new int[4];
        for(int i = 0;i<4;i++)
        {
            tab[i]=scanner.nextInt();
        }
        Arrays.sort(tab);
        for(int i = 0;i<4;i++)
        {
            System.out.println(tab[i]);
        }

        if(tab[0]>2)
        {
            System.out.println("Błędna liczba");
        }

        if(tab[0]<2)
        {
            tab2[0]=tab[0];
            tab2[1]= tab[3];
        }



    }

}
