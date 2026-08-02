import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] array= new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        //Bubble Sort
        for(int i=0;i<n-1;i++){ //n-1
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }

        System.out.println("The Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
