public class PrintDecreasing{

    public static void main(String args[]){
        System.out.println("test");
        printit(5);
    }
    public static void printit(int n){
        if(n ==0){
            return ;
        }
        System.out.println(n);
        printit(n-1);
    }
}