package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> L= new ArrayList <String> ();
L.add("Red");
L.add("Green");
L.add("Blue");
L.add("Red");
L.add("Black");
System.out.println(L);
System.out.println(L.get(2));
L.set(1, "White");
System.out.println(L);
System.out.println(L.indexOf("Red"));
System.out.println(L.indexOf("Blue"));
System.out.println(L.lastIndexOf("Red"));
L.remove(1);
System.out.println(L);
L.remove("Blue");
System.out.println(L);
System.out.println(L.contains("Blue"));
System.out.println(L.isEmpty());
System.out.println(L.size());
	}

}

