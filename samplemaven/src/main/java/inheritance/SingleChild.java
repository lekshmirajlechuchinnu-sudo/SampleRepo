package inheritance;


public class SingleChild extends SingleParent {
	public void print()
	{
		float a=2f;
		float b=5f;
		float c=a+b;
	
						
		System.out.println(c);
	}

	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.display();
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
