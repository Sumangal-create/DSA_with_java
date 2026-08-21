public class Tower_of_Hanoi{
    public static void Hanoi(int n, String srs, String dest, String helper){
        if(n==1){
            System.out.println("Transferred disk no. "+n+" from "+src+" to "+dest);
            return;
        }
        Hanoi(n-1,src,helper,dest);
        System.out.println("Transferred disk no. "+n+" from "+src+" to "+dest);
        Hanoi(n-1, helper, src, helper);
    }
    public static void main(String[] args) {
        int n=1;
        Hanoi(n,"S","H","H");
        
    }
}