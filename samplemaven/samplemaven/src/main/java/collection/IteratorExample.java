package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
	public static void main(String[] args) {
		
Set <String> s=new HashSet <String>();
s.add("red");
s.add("yellow");
s.add("violet");
s.add("green");
System.out.println(s);
Iterator i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
System.out.println(s);
	}


}
