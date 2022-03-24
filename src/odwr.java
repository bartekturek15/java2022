import java.util.Scanner;
public class odwr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = new String(scanner.nextLine());
        String b = new String("");
        if(a.equals("")) {
            System.out.println("Podaj cokolwiek plx");
        }

        for(int i = a.length()-1;i >= 0; i--)
        {
            b = b + a.charAt(i);


        }
        System.out.println(b);


    }
}
