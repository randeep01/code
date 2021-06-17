public class Power{
    public static void main(String args[]){
        int x = 2;
        int n = 10;

        int res = power(x,n);
        System.out.println("Result: " + res);
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int temp = power(x,n/2);
        int ret = temp*temp;

        if(n%2 == 1){
            ret = ret*x;
        }
        return ret;
    }
}