import java.util.Scanner;

public class UltaNumbers {
    public static void ReverseNumbers(int n){
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ReverseNumbers(n);
    }
}
