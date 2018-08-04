
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println("---Iteration over vector using for each");
		for (String s : v)
			System.out.println(s);

		System.out.println("---Iteration over vector using Iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> list = new LinkedList<>();
		list.add("Tesla");
		list.add("Apache");
		list.add("Apple");

		v.addAll(list);// merging elements of list into vector
		System.out.println("---Iterating list over updated vector using fro each");
		for (String s : v)
			System.out.println(s);
		
		//converting vector into set
		
		HashSet<String> set = new HashSet<>(v);
		System.out.println("---Iterating over HashSet  using fro each");
		for (String s : set)
			System.out.println(s);
		
		//Converting Set into TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("---Iterating over Treeset using for each ");
		for(String d:tree)
			System.out.println(d);
		
	//	TreeSet<String> revTree = (TreeSet)tree.descendingSet();
		System.out.println("---Iterating over Treeset using for each ");
		for(String d:tree.descendingSet())
			System.out.println(d);
		
		//new way to iterate from java8
		System.out.println("------------iterating new way using java 8 forEach()");
		 tree.forEach(System.out::println);
		 //---converting array into list
		 System.out.println("---Iterating over List using forEach()");
		 String[] week= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		 List<String> days= Arrays.asList(week);
		 days.forEach(System.out::println);

	}
}
