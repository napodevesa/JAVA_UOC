import java.util.Scanner;

public class PAC1Ex1 {
	
	static Scanner lector = new Scanner (System.in);
    static double fahrenheit;

	public static void main(String[] args) {
		// 96.8 °F son 36 °C // 
		
		System.out.println("Introduce ºF");
		fahrenheit = lector.nextDouble();

		double celsius = f2c(fahrenheit);
		
		System.out.print("El resultado es el siguiente: " + celsius + "°C = "+ fahrenheit +"°F");
	}
	
	public static double f2c(double f) {
		return (f - 32) * 5 / 9;		
	}
}
