
public class GCM {
	
	public static int gcd(int a, int b){
		if(b ==0)
			return a;
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=98, b=56;
		System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
	}

}
