public class KeypadCombinations{
    public static String[] Keypad ={".","abc","def","ghi","jkl","kmo","pqrs","tuv","wxyz"};

    public static void PrintComb(String str, int ind, String comb){
        if(ind==str.length()){
            System.out.println(comb);
        }
        char currchar = str.charAt(ind);
        String mapping = Keypad[currchar-'0'];

        for(int i=0;i<mapping.length();i++){
            PrintComb(str, ind+1, comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str ="23";
        PrintComb(str,0 , "");
    }
}