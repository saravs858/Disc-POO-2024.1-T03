package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um número inteiro maior que 0");
			if (i == 0) {
				vetor[0] = sc.nextInt();
			} else {
				int numero = sc.nextInt();
				for (int j = 0; j <= i; j++) {
					if (j == i) {
						vetor[j] = numero;
						break;
					}
					
					if (numero <= vetor[j]) {
						// mover os numero pra frente
						for (int k = i-1; k >= j; k--) {
							vetor[k+1] = vetor[k];
					}
						vetor[j] = numero;
						break;
				}
			}
			
			for (int ii = 0; ii < 8; ii++) {
				System.out.print(vetor[ii] + " ");
			}
			System.out.println("");
		}
		
		}
		
		
	}

}
