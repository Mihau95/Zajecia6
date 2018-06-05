import java.util.Scanner;

public class Algorytm {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Liczba");
                x = scanner.nextInt();
                if (x*x<100){
                    System.out.println("Dobrze!");
                    sum+=x;
                }else {
                    System.out.println("Bledna liczba!");
                }
                System.out.println();

            }while(x*x<100);

            sum=sum%2;

            System.out.println("Liczba poprawna!" + sum);
            scanner.close();

    }
}
