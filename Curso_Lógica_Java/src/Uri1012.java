import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double A, B,C,areatri,pi, areacirc,areatrap,areaquad,arearet;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi =  3.14159;
		areatri = A * C / 2;
		areacirc = pi* Math.pow(C, 2);
		areatrap = (A + B) * C / 2;
		areaquad = Math.pow(B, 2);
		arearet = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",areatri);
		System.out.printf("CIRCULO: %.3f%n",areacirc);
		System.out.printf("TRAPEZIO: %.3f%n",areatrap);
		System.out.printf("QUADRADO: %.3f%n", areaquad);
		System.out.printf("RETANGULO: %.3f%n",arearet);
		
		sc.close();

	}

}
