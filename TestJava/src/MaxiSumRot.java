
public class MaxiSumRot {

	static int maxSum(int arr[], int n){
		int res = Integer.MIN_VALUE;
		for(int i =0;i<n;i++){
			int curr_sum=0;
			for(int j=0;j<n;j++){
				int index=(i+j)%n;
				curr_sum+=j*arr[index];
			}
			res=Math.max(curr_sum, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 3, 1, 2}; 
        int n = arr.length; 
        System.out.println(maxSum(arr, n)); 
	}

}
