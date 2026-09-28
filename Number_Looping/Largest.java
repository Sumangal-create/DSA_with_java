import java.util.Scanner;
public class Largest {
    public static void largest_num(int n){
        int largest=0;
        while(n>0){
            int digits= n%10;
            if(digits>largest){
                largest=digits;
            }
            n=n/10;
        }
        System.out.println("Largest number is: "+largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        largest_num(n);
        sc.close();
    }
}
