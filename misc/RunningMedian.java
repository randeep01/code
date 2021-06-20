import java.util.PriorityQueue;
import java.util.Collections;
class Tuple<A,B>{
    A a;
    B b;
    public Tuple(A a, B b){
        this.a = a;
        this.b = b; 
    }
}
public class RunningMedian{
    static PriorityQueue<Integer> right = new PriorityQueue<>();
    static PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String args[]){
        try{
            addElement(1);
            Tuple<Integer,Integer> ret = getMedian();
            printTuple(ret);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void addElement(int ele){
        if(!right.isEmpty() && ele > right.peek()){
            right.offer(ele);
            if(right.size() - left.size() > 1){
                left.offer(right.poll());
            }
        } else {
            left.offer(ele);
            if(left.size() - right.size() > 1){
                right.offer(left.poll());
            }
        }
    }
    public static Tuple<Integer,Integer> getMedian() throws Exception {
        if(left.size()==0){
            throw new Exception("no element exception ");
        }
        if(left.size() == right.size()){
            return new Tuple<Integer,Integer>(left.peek(), right.peek());
        } else {
            return new Tuple<Integer,Integer>(left.size()>right.size()?left.peek():right.peek(),null);
        }
    }
    public static void printTuple(Tuple<A,B> tup){
        if(tup.b==null){
            System.out.println("median of off elelemt " + tup.a);
        } else {
            System.out.println("median of even elements " + tup.a + "," + tup.b );
        }

    }
}