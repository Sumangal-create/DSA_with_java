import java.util.Scanner;
public class smallest {
    public static void smallest_num(int n){
        int smallestt=9;
        while(n>0){
            int digit=n%10;
            if(digit<smallestt){
                smallestt=digit;
            }
            n=n/10;
        }
        System.out.println("The smallest number is: "+smallestt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number greater than one digit: ");
        int n = sc.nextInt();
        smallest_num(n);
    }
}
