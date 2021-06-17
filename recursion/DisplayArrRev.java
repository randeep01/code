public class DisplayArrRev{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        displayRev(arr, 0);
    }
    public static void displayRev(int arr[], int index){
        if(index==arr.length){
            return;
        }
        displayRev(arr,index+1);
        System.out.println(arr[index]);
    }
}