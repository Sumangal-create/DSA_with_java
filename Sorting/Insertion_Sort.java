import java.util.Scanner;

public class Insertion_Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Insertion Sort
        for(int i=0;i<n;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.print("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}