package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> a = new HashSet<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Banana");
		System.out.println(a);
		Set<String> b = new HashSet<String>();
		b.add("Grapes");
		b.add("Watermelon");
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("Apple"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		a.remove("Orange");
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		a.clear();
		System.out.println(a);

	}


}
