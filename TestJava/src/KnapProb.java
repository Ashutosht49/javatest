
public class KnapProb {
	public static int knapprob(int[] v, int[] w, int W){
		int[][] t = new int[v.length+1][W+1];
		for(int i =1; i<=v.length;i++){
			for(int j=0;j<=W;j++){
				if(w[i-1]>j){
					t[i][j]=t[i-1][j];
					System.out.println("IF::"+t[i][j]);
				}
				else{
					t[i][j]=Integer.max(t[i-1][j], t[i-1][j-w[i-1]]+v[i-1]);
					System.out.println("else::"+t[i][j]);
				}
			}
		}
		return t[v.length][W];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {20,5,10,40,15,25};
		int[] w ={1,2,3,8,7,4};
		int W =10;
		System.out.println(knapprob(v,w,W));
	}

}
