public class MaxSubarrayProduct{
    public static void main(String args[]){
        int arr[] = {0,1,-1};
        System.out.println(maxSubarrayPro(arr));
        
    }
    static int maxSubarrayPro(int arr[]){
        int len = arr.length;
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 0; i<len; i++) {
            int temp_max = Math.max(arr[i]*max,Math.max(arr[i]*min, arr[i]));
            min = Math.min(arr[i]*max,Math.min(arr[i]*min, arr[i]));

            max = temp_max;
            result = Math.max(result, max);
        }
        return result;
    }

}