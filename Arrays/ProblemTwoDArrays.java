import java.util.Scanner;

public class ProblemTwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("Emter the nnumber you wanna search");
        int num=sc.nextInt();

        int[][] numbers = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==num){
                    System.out.println("NUmber found at index ("+i+","+j+")");
                }
            }
        }
        
    }
}
