import java.util.ArrayList;
public class StairPath
{
    public static void main(String args[]){
        int n = 5;
        ArrayList<String> paths = getStairPath(n);
        System.out.println(paths);
    }
    // we are allowed to tale 1,2,3 steps at time
    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1 = getStairPath(n-1);
        ArrayList<String> paths2 = getStairPath(n-2);
        ArrayList<String> paths3 = getStairPath(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for(String path1: paths1){
            paths.add(1+path1);
        }
        for(String path2: paths2){
            paths.add(2+path2);
        }
        for(String path3: paths3){
            paths.add(3+path3);
        }

        return paths;
    }
}