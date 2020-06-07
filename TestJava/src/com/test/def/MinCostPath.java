
public class MinCostPath {
	
	public static int find(int A[][]){
		int[][] solution = new int[A.length][A.length];
		solution[0][0]=A[0][0];
		for(int i=1; i<A.length;i++){
			solution[0][i]=A[0][i]+solution[0][i-1];
		}
		for(int i=1; i<A.length;i++){
			solution[i][0]=A[i][0]+solution[i-1][0];
		}
		for(int i=1;i<A.length;i++){
			for(int j=1;j<A.length;j++){
				solution[i][j]=A[i][j]+Math.min(solution[i-1][j], solution[j-1][i]);
			}
		}
		return solution[A.length-1][A.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
				{ 2, 9, 8, 2 } };
		System.out.println("Minimum Cost Path " + find(A));
	}

}
