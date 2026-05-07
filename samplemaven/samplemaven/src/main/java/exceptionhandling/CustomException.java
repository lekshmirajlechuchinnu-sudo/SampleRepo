package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18)System.out.println("Eligible to vote");
		else
		{
			throw new VotingException("Enter age above 18");
		}
	}

}