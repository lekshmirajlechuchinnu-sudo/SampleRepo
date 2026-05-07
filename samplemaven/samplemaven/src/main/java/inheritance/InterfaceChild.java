package inheritance;

public class InterfaceChild implements InterfaceParent1,InterfaceParent2 {
	public void show()
	{
	System.out.println("this is interface child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild  obj=new InterfaceChild ();
		obj.display();
		obj.print();
		obj.show();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is interface parent2");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is interface parent1");
		
	}

}
