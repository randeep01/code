public class PrintStairPath
{
    public static void main(String args[])
    {   
        int n = 3;
        printStairPath(n,"");
    }
    public static void printStairPat(int n, String path){

        if(n<0){
            return;
        } 
        if(n == 0)
        {
            System.out.println(path);
            return;
        }

        printStairPath(n-1,path+"1");
        printStairPath(n-2,path + "2");
        printStairPath(n-3,path + "3");
    }
}