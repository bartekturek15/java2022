import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Zadanieplik {
    public static void main(String[] args) throws FileNotFoundException {
    zad1();

    }

    public static void zad1() throws FileNotFoundException {
        {
            File myObj = new File("filename.txt");
            Scanner scanner = new Scanner(myObj);
            int suma = 0;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
                suma = data.length();
            }
            scanner.close();
            System.out.println(suma);
        }

    }
}