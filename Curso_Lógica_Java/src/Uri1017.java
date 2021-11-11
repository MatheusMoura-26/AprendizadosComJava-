import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velo;
		double litros;
		
		tempo = sc.nextInt();
		velo = sc.nextInt();
		
		litros =(double) tempo * velo / 12;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();

	}

}
