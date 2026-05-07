package inheritance;

public class SalarySlip extends Salary {
	double totalsalary;
	public void sum()
	{
	totalsalary=basicpay+hra-pf-deduction+bonus;
	System.out.println("Basicpay: "+basicpay);
	System.out.println("Deduction: "+deduction);
	System.out.println("Bonus: "+bonus);
	System.out.println("Hra: "+hra);
	System.out.println("PF: "+pf);
	System.out.println("TotalSalary: "+totalsalary);
	
		
	}

	public static void main(String[] args) {
		
		SalarySlip obj=new SalarySlip();
		obj.salary();
		obj.details();
		obj.sum();
		
		
	}

}
