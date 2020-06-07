
public class TestPailindromInAString {
	public static String runPa(String s){
		int l = s.length();
		int i=0;
		for(int j=0;j<l;j++){
			while(l>j){
				char ch[]=s.toCharArray();
				if(ch[l]==ch[j]){
					i++;
					l--;
				} else if(ch[i]!=ch[l-1]){
					l--;
				} else if(i==l) {
					i++;
					l=s.length();
				}
			}
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hbacabte";
		runPa(s);
	}

}
