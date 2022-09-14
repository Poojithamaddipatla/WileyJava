
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class custExceptions {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int age=Integer.parseInt("9");
		if(age<18) {
			throw new TooYoungException("Please Wait some more time ... you will get perfect match");
		}
		else if(age>60) {
			throw new TooOldException("Your age is crossed ... No chance of getting Married");
		}
		else {
			System.out.println("You will Get best match through from Mail");
		}
		// try with resources   it doesn't required finally or catch with try catch with resources
		
		
		
	}

}
@SuppressWarnings("serial")
class TooYoungException extends RuntimeException{
	public TooYoungException(String s) {
		super();
	}
}
@SuppressWarnings("serial")
class TooOldException extends RuntimeException{
	public TooOldException(String s) {
		super();
	}
}
