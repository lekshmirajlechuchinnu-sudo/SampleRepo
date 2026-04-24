package polymorphism;

public class PolyChild extends PolyParent {
	public void display()
	{
		System.out.println("This is a child class");
		super.display();
	}

	public static void main(String[] args) {
		
		PolyChild obj=new PolyChild();
		obj.display();

	}

}
