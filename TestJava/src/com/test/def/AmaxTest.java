
public class AmaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,0,1,0,1,1};
		int mid = arr.length/2;
		int i=0,k=mid-1,l=mid+1;
		while(i<mid-1){
			if(arr[k]==arr[l]){
				k--;
				l++;
				i++;
			} else {
				arr[l]=arr[k];
			}
		}
		System.out.println(arr);
	}

}
