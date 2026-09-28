import java.util.Scanner;

public class first_last{
    public static void Digit(int n){
        int lastdigit= n%10;
        while(n>=10){
            n=n/10;
        }
        int first_digit=n;
        System.out.println("Last Digit: "+lastdigit);
        System.out.println("First Digit: "+first_digit);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n =sc.nextInt();
        Digit(n);
    }
}