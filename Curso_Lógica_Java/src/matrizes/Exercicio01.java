package matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [][] mat= new int [N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		for(int i=0;i<N;i++) {
			System.out.print(mat[i][i]+ " ");
		}
		int cont =0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(mat[i][j]< 0) {
					cont++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS:"+ cont);
		sc.close();
	}

}
