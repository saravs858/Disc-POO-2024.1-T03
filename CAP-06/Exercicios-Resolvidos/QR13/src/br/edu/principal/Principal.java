package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet [] = new int[10]; int i; boolean achou = false;
		
		System.out.println("Digite 10 números: ");
		for (i = 0; i < 10; i ++) {
			vet[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i ++) {
			if (vet[i] > 50) {
				System.out.println("O valor " + vet[i] + " na posição " + i + " é maior que 50.");
				achou = true;
			}
		}
		
		if (!achou) {
			System.out.print("Não existem números superiores a 50 no vetor.");
		}

	}

}