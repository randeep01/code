public class PrintSubsequence{
    public static void main(String args[])
    {
        String str = "abc";
        printss(str,"");
    }
    public static void printss(String str,String print){
        if(str.equals("")){
            System.out.println(print);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        printss(ros, print+ch);
        printss(ros, print+"");

    }
}