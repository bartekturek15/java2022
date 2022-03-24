import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String a = new String(scanner.nextLine());
        char[] chars = a.toCharArray();
        int liczba = 0;
        for(char c : chars){
            if(Character.isDigit(c)){
                liczba+= Integer.parseInt(Character.toString(c));
            }
        }
        System.out.println(liczba);




    }
}
