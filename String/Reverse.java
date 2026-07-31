

// public class Reverse {
//     public static void main(String[] args) {    
//         StringBuilder sb = new StringBuilder("Hello");

//         for(int i=0;i<sb.length()/2;i++){
//             int front=i;
//             int back=sb.length()-1-i;

//             char frontchar=sb.charAt(front);
//             char backchar=sb.charAt(back);

//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.println(sb);
//     }

// }
// //Time complexity : 0(N)

public class Reverse {
    public static void main(String[] args) {
        String str ="Sumangal";
        String revString="";

        for(int i =str.length()-1;i>=0;i--){
            revString+=str.charAt(i);
        }
        System.out.println(revString);
    }
}