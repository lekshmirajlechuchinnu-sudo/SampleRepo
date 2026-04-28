package aggregation;

public class Aggregation2 {
	String address;
	Aggregation1 ref;
	
	public Aggregation2(String address,Aggregation1 ref)
	{
		this.address=address;
		this.ref=ref;
		
	}
	public void print()
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(address);
	}

	public static void main(String[] args) {
		 Aggregation1 obj=new Aggregation1("Lekshmi Raj",23);
		 Aggregation2 obj1=new Aggregation2("ABC Land Line",obj);
		 obj1.print();
		 
	}

}
