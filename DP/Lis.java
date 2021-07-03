public class Lis{
    public static void main(String args[]) {
        int arr[] = {4,3,9,7,20, 68};
        System.out.println(lis(arr,6));
    }
    public static int lis(int arr[], int n) {
        int lis[] = new int[n];
	    lis[0] = 1;
	    int highest = 0;
	    for (int i =1;i<n;i++) {
		    lis[i] = 1;
		    for (int j = i-1;j>=0;j--) {
                if(arr[i] >arr[j]) {
				    lis[i] = Math.max(lis[j] +1,lis[i]);
				    highest = Math.max(highest,lis[i]);
			    }
		    }
	    }
        return highest;	
    }
}