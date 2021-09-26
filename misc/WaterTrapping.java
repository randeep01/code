public class WaterTrapping{
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int waterTrapped = waterTrapping(arr);
        System.out.println(waterTrapped);
    }
    public static int waterTrapping(int arr[]){
        int len  = arr.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];

        leftMax[0] = arr[0];
        for(int i = 1;i<len;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);

        }
        rightMax[len-1] = arr[len-1];
        for(int i = len-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        int wt = 0;
        for(int i = 0;i<len;i++){
            wt += Math.min(rightMax[i],leftMax[i]) - arr[i];
        }
        return wt;
    }
}