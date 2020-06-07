
public class AsciConvert {
	static long prodAsci(String s){
		long prod = 1;
		for(int i=0; i<s.length(); i++){
			prod *= s.charAt(i);
		}
		return prod;
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println(prodAsci("Love"));

	}

}
