package exceptionhandling;

public class ExceptionExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			b = 5;
			int c = a / b;
			System.out.println(c);
			System.out.println(e);// details of exception is holding in the variable e in the catch block
		} finally {
			System.out.println("Mandatory statement");
		}
	}



}
