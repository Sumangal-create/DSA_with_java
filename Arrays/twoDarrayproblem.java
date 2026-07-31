import java.util.Scanner;
public class twoDarrayproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();

        int [][]matrix= new int[rows][columns];

        System.out.println("Enter the number you wanna search: ");
        int num=sc.nextInt();

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(num==matrix[i][j]){
                    System.out.println("Number found at index: "+i+" "+j);
                }
            }
        }
    }
}
