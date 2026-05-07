package exceptionhandling;

public class ThrowExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=17;
if(age>=18)System.out.println("Eligible to vote");
else
{
	throw new ArithmeticException("Enter age above 18");
}
	}

}


