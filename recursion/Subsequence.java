import java.util.ArrayList;
public class Subsequence{
    public static void main(String args[]){
        String str = "abc";
        ArrayList<String> ss= subseq(str);
        System.out.println(ss);
    }
    public static ArrayList<String> subseq(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String rstr = str.substring(1);

        ArrayList<String>res = subseq(rstr);
        ArrayList<String> mres = new ArrayList<>();
        for(String subeq:res){
            mres.add(""+subeq);
            mres.add(ch+subeq);
        }
        return mres;
    }
}