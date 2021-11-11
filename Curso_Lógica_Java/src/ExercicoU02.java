import java.util.Locale;
import java.util.Scanner;

public class ExercicoU02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = metroQuadrado * area;
		
		System.out.printf("ÁREA =  %.2f%n", area);
		System.out.printf("Preço =  %.2f%n", preco);
		
		sc.close();
	}

}
