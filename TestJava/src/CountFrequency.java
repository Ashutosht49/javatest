import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class CountFrequency {
	public static void freqCount(String stt){
		Map hm = new HashMap();
		String st[]=stt.split(" ");
		for(int i=0;i<st.length; i++)
		{
			Integer count = (Integer) hm.get(st[i]);
			int newCount = (count==null ? 1 : count+1);
			hm.put(st[i], newCount);
		}
		System.out.println(hm);
	}
	public static void nonRep(String stt){
		StringBuffer sb = new StringBuffer();
		int i=0;
		for(;i<stt.length();i++)
		{
			String a1 = stt.substring(i, i+1);
			if(sb.indexOf(a1) == -1)
			{
				sb.append(a1);
			}
		}
		System.out.println(sb);
	}
	public static void llTest(LinkedList<String> linkedList){
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
	public static void newTest(String str){
		List<Character> ls = new ArrayList<>();
		Set<Character> hs = new HashSet<Character>();
		for(int i=0;i<str.length(); i++)
		{
			char ch=str.charAt(i);
			ls.add(ch);
		}
		System.out.println(ls.toString());
		hs.addAll(ls);
		for(Character c : hs)
		{
			int freq=Collections.frequency(ls, c);
			System.out.println(freq);
			if(freq==1)
			{
				System.out.println(c);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String s1="Hi i am using th i and you hi";
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Paypal");
		linkedList.add("Google");
		linkedList.add("Yahoo");
		linkedList.add("IBM");
		linkedList.add("Facebook");
		freqCount(s1);
	}

}
