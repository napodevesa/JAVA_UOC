
public class PAC1Ex1 {

	public static void main(String[] args) {
		// 96.8 °F son 36 °C //
		double fahrenheit = 96.8, celsius;
		
		celsius = f2c(fahrenheit) - 5;
		
		System.out.print(celsius + "°C = "+ fahrenheit +"°F");
	}
	
	public static double f2c(double f) {
		return (f - 32) * 5 / 9;		
	}
}

/*
import java.util.Scanner;

public class PAC1Ex1 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input a degree in Fahrenheit: ");
			double fahrenheit = input.nextDouble();

			double  celsius = f2c(fahrenheit);
			System.out.println(fahrenheit + " degree Fahrenheit is equal to " 
			+ celsius + " in Celsius");
		}
	}
	
	public static double f2c(double f) {
		return ((f - 32) * 5 / 9);		
	}
}
*/