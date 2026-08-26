import java.util.Scanner;

public class Numbers {
    public static void printNumber(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printNumber(n);
    }
}
