package inheritance;

public class Child1 extends Parents {
	public void print()
	{
		System.out.println("Sum of the numbers");
	}

	public static void main(String[] args) {
		Child1 obj= new Child1();
		obj.print();
		obj.sum();
				
		// TODO Auto-generated method stub

	}

}
