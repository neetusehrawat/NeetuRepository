import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	
	static void hashSet() {
		Set set1= new HashSet();
		Set<String> set2 =new HashSet<String>();
		
		set1.add("James");
		set1.add(10);
		set1.add(45);
		set1.add("56");
		set1.add("Mike");
		set1.add("Anu");
		set1.add("James");
		set1.add(55);
		set1.add("James");
		
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.contains(45));
		set1.remove("James");
		System.out.println(set1);
		set1.remove(45);
		System.out.println(set1);
			
	}
	
	static void linkedHashSet() {
		Set set2= new LinkedHashSet();
		Set<String> set3 =new LinkedHashSet<String>();
		
		set2.add("James");
		set2.add(10);
		set2.add(45);
		set2.add("56");
		set2.add("Mike");
		set2.add("James");
		set2.add(55);
		set2.add("James");
		
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println(set2.contains(45));
		set2.remove("James");
		System.out.println(set2);
		set2.remove(45);
		System.out.println(set2);
			
	}
	
	static void treeSet() {
		Set set3= new TreeSet();
		Set<String> set4 =new TreeSet<String>();
		
		set3.add("James");
		set3.add("12");
		set3.add("Anu");
		set3.add("Mike");
		set3.add("James");
		
		set3.add("James");
		
		System.out.println(set3);
		System.out.println(set3.size());
		set3.remove("James");
		System.out.println(set3);

			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashSet();
		linkedHashSet();
		treeSet();

	}

}

// HashSet
// doesn't alow duplicate values'
// doesn't follow index concept'
//doesn't maintain insertion order first String and then Integers

//LinkedHashSet
//doesn't allow duplicate values'
//doesn't follow index concept'
//maintain insertion order 
// linkedHashset is prefered.

//TreeSet
//doesn't allow duplicate values'
//doesn't follow index concept'
//by default arrange in ascending order
//doesn't allow Integer directly -- pass in the form of string


