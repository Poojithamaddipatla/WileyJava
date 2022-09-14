@SuppressWarnings("serial")
public class salaryException extends RuntimeException{ 
	String message;
	salaryException(){
		message="SalaryException Occured";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary is not according to the norm";
	}
}

