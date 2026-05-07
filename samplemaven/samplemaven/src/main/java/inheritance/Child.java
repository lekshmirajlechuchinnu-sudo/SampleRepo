package inheritance;

public class Child extends Parent {
	public void show()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Child obj= new Child();
		obj.display();
		
		obj.sum();
		obj.show();
		// TODO Auto-generated method stub

	}

}
