package exceptionHandling;
import java.io.FileNotFoundException;

public class ExceptionHandlingThrow {

	void m() throws FileNotFoundException {
		throw new FileNotFoundException();
	} 
	
	void n() throws FileNotFoundException {
			m();
	}
	

	public static void main(String[] args) {
		ExceptionHandlingThrow	demo = new ExceptionHandlingThrow();
		try {
			demo.n();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End of probram");
	}

}
