package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List L= new ArrayList();
		L.add(1);
		L.add("Green");
		L.add(2.1f);
		L.add('C');
		L.add("Black");
		System.out.println(L);
		System.out.println(L.get(2));
		L.set(1, "White");
		System.out.println(L);
		System.out.println(L.indexOf("Black"));
		System.out.println(L.indexOf(1));
		System.out.println(L.lastIndexOf("Black"));
		L.remove(1);
		System.out.println(L);
		L.remove("Black");
		System.out.println(L);
		System.out.println(L.contains("Blue"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
	}

}
