import java.util.Scanner;

public class Prime {

    public static void Prime_num(int n) {

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime!");
        } else {
            System.out.println("Number is not Prime!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        Prime_num(n);
    }
}