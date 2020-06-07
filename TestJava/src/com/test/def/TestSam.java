import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestSam {
	
	public static int processValue(int length, int[][] pro, int cheW, int noOfTime){
		int chcekCon=pro[0][1];
		for (int i = 1; i <= length; i++) 
		{ 
			int weight=0;
			int currSum = 0;
			for (int j = i; j <= length; j++) { 
				currSum += pro[j][0];
				weight = weight + (pro[j][0]*pro[j][1]);
				if(currSum == chcekCon)
				{
				     System.out.println("#" +noOfTime+" "+weight);
                                                         
				}
			}
		}
		return length+1;
	}
	public static int result(List<Integer> validList){
		int size = 2;
		int valueArr[][]= new int[validList.size()][size];
		int i=0,j=0;
		int s1=0,v=0, t=1;
		for(Integer va : validList){
			valueArr[i][j]=va;
			j++;
			if(j>size-1){
				i++;
				j=0;
			}
		}
		while(s1 < validList.size()/2){
			if(v<validList.size()/2){
				s1 = processValue(valueArr[s1][0], valueArr, valueArr[s1][1], t);
				v=v+s1;
				t++;
			}else{
				break;
			}

		}

		return 0;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("G://NewTechWorkSpace//Array_Logic//src//test"));
		int value = sc.nextInt();
		List<Integer> ls = new ArrayList<Integer>();
		//for(int next_value=1;next_value<=value;next_value++){
			while(sc.hasNext()){
				int w=sc.nextInt();
				int h = sc.nextInt();
				ls.add(w);
				ls.add(h);
				//System.out.println(""+w+"::"+h+"::"+ls.toString()); 
			}
			result(ls);
			System.out.println("#"+value); 
		//}
	} 
}
