import java.util.Scanner;
public class Reverse{
    public static int Reverse_number(int n){
        int reversed=0;
        while(n!=0){
           int digits=n%10;
           reversed = reversed*10+digits;
           n=n/10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int n = sc.nextInt();
        int reversedNumber=Reverse_number(n);
        System.out.print("The reversed number is: "+reversedNumber);
        sc.close();
    }
}