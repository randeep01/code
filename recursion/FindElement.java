public class FindElement{
    public static void main(String args[]){
        int arr[] = {1,2,4,5,2,1,4,2,4};
        int idx = 0;
        int lastIdx = arr.length-1;
        int fIndex = findFirstOccurence(arr,idx,2);
        int lIndex = findLastOccurence(arr,idx,2);

        System.out.println("First Occ: " + fIndex + " last Index: "+lIndex);

        System.out.println("All Occurences");
        int [] resArr = allOccurence(arr,idx,0,2);
        for(int res:resArr){
            System.out.println(res);
        }
    }
    public static int findFirstOccurence(int []arr, int idx, int element){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx] == element){
            return idx;
        } else {
            int minIndx = findFirstOccurence(arr, idx+1, element);
            return minIndx;
        }
    }
    public static int findLastOccurence(int[] arr, int idx, int element){
        if(idx == arr.length){
           return -1;
        }
        int lastIndx = findLastOccurence(arr,idx+1,element);
        if(lastIndx !=-1) {
            return lastIndx;
        } else{
            if(arr[idx] == element){
                return idx;
            } else {
                return -1;
            }
        }

    }
    public static int[] allOccurence(int []arr, int idx, int fsf,int ele){
        if(idx==arr.length){
            return new int[fsf];
        }
        if(arr[idx] == ele){
            int iarr[] = allOccurence(arr,idx+1,fsf+1,ele);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int iarr[] = allOccurence(arr,idx+1,fsf,ele);
            return iarr;
        }
    }
}