import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String a;

       int licznik = 0;
       a = scanner.nextLine();


        if(a.equals("")) {
            System.out.println("Podaj cokolwiek plx");
        }
       for(int i = 0;i <= a.length()-1;i++)
       {
           if(a.charAt(i) == a.charAt(a.length()-1))
           {
               licznik++;
           }

       }
       System.out.println(licznik);


    }
}
