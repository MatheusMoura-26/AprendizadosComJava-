import java.util.Locale;

public class ExercicoU01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n ",Product1, price1 );
		System.out.printf("%s, which price is $ %.2f%n ",product2, price2 );
		System.out.println();
		System.out.print("Record: ");
		System.out.printf("%d years old, code %d  and gender: %s%n",age, code ,gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%n",measure);
		System.out.printf("Rouded(There decimal places): %f.3%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		

	}

}
