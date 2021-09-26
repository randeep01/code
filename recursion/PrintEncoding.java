public class PrintEncoding{
    public static void main(String args[]){
        String str = "123";
        String asf = "";
        printEncoding(str,asf);
    }
    public static void printEncoding(String str, String asf){
        if(str.length()==0){
            return;
        } else if(str.length()==1){
            char ch1 = str.charAt(0);
            if(ch1=='0'){
                return;
            } else {
                int idx = ch1 - '0'-1;
                char val = (char)(idx + 'a') ;
                asf = asf + val;
                System.out.println(asf);
            } 
        } else {
            char ch =  str.charAt(0);
            String roq = str.substring(1);
            if(ch == '0'){
                return;
            } else {
                int idx = (char)(ch - '0' -1);
                char val = (char)(idx + 'a');
                printEncoding(roq,asf+val);
            }
            String ch12 = str.substring(0,2);
            String roq12 = str.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)('a' + ch12v-1);
                printEncoding(roq12, asf+code);
            }


        }

    }
}