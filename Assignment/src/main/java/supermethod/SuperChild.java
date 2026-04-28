package supermethod;

public class SuperChild extends SuperParent {
public void print()
{ 
	int result=super.sum(33,20);
	
	if(result%10==0)
	{
		System.out.println("Divisible by 10");
		
	}
	else
	{
		System.out.println("Not Divisible by 10");
	}
	
}
	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.print();

	}

}
