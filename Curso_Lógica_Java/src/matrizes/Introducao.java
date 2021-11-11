package matrizes;

import java.util.Scanner;

public class Introducao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] Matriz= new int[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.println("Digite um número");
				Matriz[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
