public class DisplayArray{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        display(arr, 0);
    }
    public static void display(int[] arr,int index){
        if(index==arr.length){
            return;
        }

        System.out.println(arr[index]);
        display(arr,index+1);
    }
}