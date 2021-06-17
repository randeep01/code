public class TowerOfHanoi{
    public static void main(String args[]){
        int n = 3; // number of disks
        String poleSource = "A";
        String poleDest = "B";
        String poleHelper = "C";
        toh(3,poleSource,poleDest, poleHelper);
    }
    public static void toh(int n, String source, String dest, String helper){
        if(n ==0){
            return;
        }
        toh(n-1,source,helper,dest);
        System.out.println("Move Disk " + n + " from " + source + " to "+ dest);
        toh(n-1,helper,dest,source);
    }
}