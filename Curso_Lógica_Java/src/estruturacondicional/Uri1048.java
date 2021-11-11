package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		double percentual, nsal;
		
		if (sal <= 400.0) {
			percentual = 15.0;
		}
		else if(sal > 400.0 && sal <=800.0) {
			percentual = 12.0;
		}
		else if(sal > 800.0 && sal <= 1200.0) {
			percentual = 10.0;
		}
		else if (sal > 1200.0 && sal <= 2000.0) {
			percentual = 7.0;
		}
		else {
			percentual = 4.0;
		}
		
		nsal = sal * percentual/100.0;
		sal = sal + nsal;
		
		System.out.printf("Novo salário: %.2f%n", sal );
		System.out.printf("Reajuste ganho: %.2f%n", nsal);
		System.out.printf("Percentual: %f%% %n ", percentual);
	}

}
