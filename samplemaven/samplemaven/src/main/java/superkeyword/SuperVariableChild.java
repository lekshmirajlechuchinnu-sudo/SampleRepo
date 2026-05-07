package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
 String colour="Pink";
 public void print()
 {
	 System.out.println(colour);
	 System.out.println(super.color);
 }
	public static void main(String[] args) {
		
		SuperVariableChild obj=new SuperVariableChild();
		obj.print();
	
	}

}
