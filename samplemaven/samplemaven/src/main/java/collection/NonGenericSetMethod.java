package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set a = new HashSet();
		a.add(1);
		a.add("Orange");
		a.add(2.1f);
		System.out.println(a);
		Set b = new HashSet();
		b.add('C');
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
