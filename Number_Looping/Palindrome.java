import java.util.Scanner;
public class Palindrome{
    public static void Palindrome_check(int n){
        int reversed = 0;
        int original = n;
        while(n>0){
            int digits = n%10;
            reversed = reversed*10+digits;
            n=n/10;
        }
        if(reversed==original){
            System.out.print("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a panlindrome!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Palindrome_check(n);
    }
}