package polymorphism;

public class Offseason extends Onseason {
	public void display()
	{

		int price=1800;
		double  d =(1800*0.15);
		System.out.println("After discount amount on Offseason " + d);
		super.display();
	}

	public static void main(String[] args) {
		
		Offseason obj= new Offseason();
		obj.display();
	}

}
