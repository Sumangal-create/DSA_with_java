import java.util.Scanner;

public class Armstrong {
    public static void ArmStrong_number(int n){
        int original = n;
        int cube=0;

        while(n>0){
            int digits = n%10;
            cube=digits*digits*digits+ cube;
            n/=10;
        }

        if(cube==original){
            System.out.print("The number is Armstrong number!");
        }
        else{
            System.out.print("The number is not an Armstrong number!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        ArmStrong_number(n);
    }
}
