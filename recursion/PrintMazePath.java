public class PrintMazePath{
    public static void main(String args[]){
        int n = 3;
        int m = 5;
        printMazePath(0,0,n-1,m-1,"");
    }
    public static void printMazePath(int sr,int sc, int dr,int dc, String path){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        printMazePath(sr+1,sc,dr,dc,path + "V");
        printMazePath(sr,sc+1,dr,dc,path+"H");

    }
}