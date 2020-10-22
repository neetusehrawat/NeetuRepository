import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	
	static void arrayList() {
	
		List li = new ArrayList(); // can hold any type of element - any datatype

		List <String> str= new ArrayList<String>();  // // can hold only string datatype
			
		li.add("James");
		li.add(45);
		li.add(2,789);
		li.add(3,"Mike");
		li.add("James");
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains(45));
		System.out.println(li.get(2));
		li.remove("James");
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
		
	}
		
		static void linkedList(){
			List lii= new LinkedList();
			lii.add("James");
			lii.add(45);
			lii.add(2,789);
			lii.add(3,"Mike");
			lii.add("James");
			System.out.println("linkedList" +lii);
			System.out.println(lii.size());
			System.out.println(lii.contains(45));
			System.out.println(lii.get(2));
			lii.remove("James");
			System.out.println(lii);
			lii.remove(1);
			System.out.println(lii);
		}
		
		static void vector(){
			List v1= new Vector();
			v1.add("James");
			v1.add(45);
			v1.add(2,789);
			v1.add(3,"Mike");
			v1.add("James");
			System.out.println("vector" +v1);
			System.out.println(v1.size());
			System.out.println(v1.contains(45));
			System.out.println(v1.get(2));
			v1.remove("James");
			System.out.println(v1);
			v1.remove(2);
			System.out.println(v1);
		}


	
	
	public static void main(String[] args) {
		arrayList();
		linkedList();
		vector();
		
	}
	
}
//Array list
//dynamic array
// Array list maintain insertion order
//internally uses an array, so if any elemnt is removed all bits are shifted in memory
//bit slower than linked list because lot of shifting needs to ocuur if any element is removed from array
// to remove integer pass index only
// better for storing and access

//LinkedList
// use doubly linked list to store element
// better for manipulation
// can be used as list and queue both
//


