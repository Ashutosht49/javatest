import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MEmp {
	static class Empl{
		int id;
		String name;
		String add;
		public Empl(int id, String name, String add) {
			// TODO Auto-generated constructor stub
			this.id=id;
			this.name=name;
			this.add=add;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empl empl1= new Empl(101, "a", "a");
		Empl empl2= new Empl(101, "b", "b");
		Empl empl3= new Empl(102, "c", "c");
		Empl empl4= new Empl(102, "d", "d");
		Empl empl5= new Empl(103, "e", "e");
		Empl empl6= new Empl(103, "f", "f");
		Empl empl7= new Empl(103, "g", "g");
		ArrayList<Empl> arr= new ArrayList<Empl>();
		arr.add(empl1);
		arr.add(empl2);
		arr.add(empl3);
		arr.add(empl4);
		arr.add(empl5);
		arr.add(empl6);
		arr.add(empl7);
		Map<Integer, ArrayList<Empl>> hm = new HashMap<Integer,ArrayList<Empl>>();
		for(Empl emp:arr){
			for (Map.Entry<Integer, ArrayList<Empl>> entry : hm.entrySet()) {
			    Integer key = entry.getKey();
			    if(emp.id == key){
					hm.get(emp.id).add(emp);
				}
			    
			}
			hm.put(emp.id, new ArrayList<Empl>());
			hm.get(emp.id).add(emp);
		}
	}

}
