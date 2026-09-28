import java.util.Scanner;
public class ProdcutOfNumbers {
    public static int Product(int n){
            int prod=1;
            while (n!=0) {
                int digits = n%10;
                prod*=digits;
                n=n/10;
            }
            return prod;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number having more than 1 digit: ");
        int n = sc. nextInt();

        System.out.print("The product of digits is: ");
        System.out.print(Product(n));
    }
}
