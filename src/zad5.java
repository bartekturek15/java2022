import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrazenie");
        String a = new String(scanner.nextLine());
        char[] chars = a.toCharArray();
        int liczbaA = 0;
        int liczbaB = 0;
        for(char c : chars){
            if(Character.toString(c).equals(")")){
                liczbaA++;
            }
            else if(Character.toString(c).equals("("))
            {
                liczbaB++;
            }
        }
        if(liczbaA == liczbaB)
        {
            System.out.println("jest git");
        }
        else
        {
            System.out.println("nie jest git");
        }





    }
}
