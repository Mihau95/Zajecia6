import java.util.Scanner;

public class Algorytm2 {
    public static void main(String[] args) {
        int x = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        while (a==0) {
            System.out.println("Podaj a:");


        }

        System.out.println("Podaj B: ");
        b= scanner.nextInt();

        System.out.println("Podaj C:");
        c = scanner.nextInt();

        x = (c-b)/a;

        System.out.println("X wynosi: " + x);
    }

}
