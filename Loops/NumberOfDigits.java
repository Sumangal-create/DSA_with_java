import java.util.Scanner;

public class NumberOfDigits {
    public static int Digits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Number of digits: "+Digits(n));
    }
}
