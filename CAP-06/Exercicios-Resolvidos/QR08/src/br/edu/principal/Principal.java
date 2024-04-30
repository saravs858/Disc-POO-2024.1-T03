package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor1[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número inteiro para incluir no vetor 1");
			vetor1[i] = sc.nextInt();
		}
		
		int vetor2[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número inteiro para incluir no vetor 2");
			vetor2[i] = sc.nextInt();
		}
		
		int vetor3[] = new int[10];
		
		for (int i = 0; i < 5; i++) {
			vetor3[i] = vetor1[i];
		}
		
		for (int i = 5; i < 10; i++) {
			vetor3[i] = vetor2[i-5];
		}
		
		// ordernar vetores
		
		for (int i = 1; i < 5; i++) { // começa do segundo número do vetor, assim, o primeiro fica como uma orientação
			for (int j = 0; j < 4; j++) {
				if (vetor1[j] > vetor1[j+1]) {
					int aux = vetor1[j];
					vetor1[j] = vetor1[j+1];
					vetor1[j+1] = aux;
				}
			}
		}
		
		for (int i = 1; i < 5; i++) { // começa do segundo número do vetor, assim, o primeiro fica como uma orientação
			for (int j = 0; j < 4; j++) {
				if (vetor2[j] > vetor2[j+1]) {
					int aux = vetor2[j];
					vetor2[j] = vetor2[j+1];
					vetor2[j+1] = aux;
				}
			}
		}
		
		for (int i = 1; i < 10; i++) { // começa do segundo número do vetor, assim, o primeiro fica como uma orientação
			for (int j = 0; j < 9; j++) {
				if (vetor3[j] > vetor3[j+1]) {
					int aux = vetor3[j];
					vetor3[j] = vetor3[j+1];
					vetor3[j+1] = aux;
				}
			}
		}
		
		for (int ii = 0; ii < 5; ii++) {
			System.out.print(vetor1[ii] + ", ");
		}
		
		System.out.println("");
		
		for (int ii = 0; ii < 5; ii++) {
			System.out.print(vetor2[ii] + ", ");
		}
		
		System.out.println("");
		
		for (int ii = 0; ii < 10; ii++) {
			System.out.print(vetor3[ii] + ", ");
		}
		

	}

}
