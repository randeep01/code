
public class PrintIncreasing{

    public static void main(String args[]){
        System.out.println("test");
        printit(5);
    }
    public static void printit(int n){
        if(n ==0){
            return ;
        }
        printit(n-1);
        System.out.println(n);
    }
}