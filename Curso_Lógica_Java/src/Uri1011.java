import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi,volume;
		
		raio =sc.nextDouble();
		pi = 3.14159;
		volume = (4/3.0) * pi * Math.pow(raio, 3); 
		
		System.out.printf("VOLUME = %.3f%n",volume);
		
		sc.close();
	}

}
