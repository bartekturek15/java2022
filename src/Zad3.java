import java.util.Scanner;
public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        StringBuffer stringB = new StringBuffer(scanner.nextLine());
        StringBuffer stringA = stringB;
        stringA.reverse();

        if(stringB.toString().equals(stringA.toString())) {
            System.out.println("Jest palindromem");
        }
        else
        {
            System.out.println("Nie jest palindromem");
        }




    }
}
