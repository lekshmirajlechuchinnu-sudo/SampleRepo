package inheritance;

	public class Child2 extends Parents {
		public void display()
		{
			float a=3f;
			float b=2f;
			float c= a+b;
			System.out.println(c);
		}

		public static void main(String[] args) {
			Child2 obj= new Child2();
			obj.display();
			obj.sum();
					
			// TODO Auto-generated method stub

		}

	}

