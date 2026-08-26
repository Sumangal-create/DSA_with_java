import java.util.Scanner;

public class OddEven {
    public static void Odd_Even(int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Odd_Even(n);
    }
}
