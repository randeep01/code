import java.util.ArrayList;
public class GetMazePath{
    public static void main(String args[]){
        int n = 4;
        int m = 5;
        ArrayList<String> str = getMazePaths(1,1,n,m);
        System.out.println(str);
    }
    public static ArrayList<String> getMazePaths(int sRow, int sCol, int destRow, int destCol){

        if(sRow==destRow && sCol==destCol){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hPath = new ArrayList<>();
        ArrayList<String> vPath = new ArrayList<>();


        if(sRow<destRow){
            vPath = getMazePaths(sRow+1,sCol,destRow,destCol);
        }
        if(sCol<destCol){
            hPath = getMazePaths(sRow,sCol+1,destRow,destCol);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String path:vPath){
            paths.add("v"+path);
        }
        for(String path: hPath){
            paths.add("h"+path);
        }
        return paths;
    }
}