
public class CrowProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] overflow = {5,58,55,10};
			int n = 5;
			int k = 2;
			int result = 0;
			
			for(int i=0 ; i<k ;i++)
			{
				int min = overflow[i];
				for(int j=i; j<overflow.length; j++)
				{
					overflow[j] = overflow[j] - min;
					result = result + min;
				}
			}
			
			System.out.println(result);
		}
	}

}
