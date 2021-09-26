import java.io.*;
import java.util.*;

public class GridWithJump {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        String res = "";
        printMazePaths(1,1,dr,dc,res);
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row 
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && dc==dr){
            System.out.println(psf);
            return;
        }
        if(sr>dr || sc>dc){
            return;
        }
        
        for (int i = 1; i < (dr-sr);i++){
            //System.out.println("11");
            System.out.println("1");
            printMazePaths(sr+i,sc,dr,dc,"v"+i+psf);
        }
        
        for (int i = 1; i < (dc-sc);i++){
            System.out.println("2");
            printMazePaths(sr,sc+i,dr,dc,"h"+i+psf);
        }
        
       /* for (int i = 1; i < (dr-sr) && i < (dc-sc) ;i++){
            printMazePaths(sr+i,sc+i,dr,dc,"d"+i+psf);
        }*/
        
    }

}