import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double salh =sc.nextDouble();
		double sal = (salh * horas);
		
		System.out.println("NUMBER = "+ num);
		System.out.printf("SALARY = U$ %.2f%n", sal);
		
		sc.close();
	}

}
