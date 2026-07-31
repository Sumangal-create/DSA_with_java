
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] number= new int[size];

    int x = sc.nextInt();

    for(int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }

    for(int i=0;i<size;i++){
        if(number[i]==x){
            System.out.println("number found at index "+i);
        }
    }
    }
}
