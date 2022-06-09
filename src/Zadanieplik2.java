import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Zadanieplik2 {
    public static void main(String[] args) throws FileNotFoundException {
        zad1();

    }

    public static void zad1() throws FileNotFoundException {
        {
            File myObj = new File("filename.txt");
            Scanner scanner = new Scanner(myObj);
            int snax = 0;
            while (scanner.hasNextLine()) {
                snax++;
                String data = scanner.nextLine();
                System.out.println(data);
                sprawdz(data);

            }
            scanner.close();

        }

    }
    public static void sprawdz(String tekst)
    {

        int suma = 0;
        for(int i = 0; i < tekst.length();i++)
        {
            if(Character.isWhitespace(tekst.charAt(i))) {
                suma++;
            }

        }
        System.out.println(suma);
    }
}
