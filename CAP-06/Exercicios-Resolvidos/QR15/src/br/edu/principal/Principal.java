package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int [10]; int vet2[] = new int [5];
		int i, j;
		boolean achou;
		
		System.out.println("Digite os números do primeiro vetor: ");
		for (i = 0; i < 10; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os números do segundo vetor: ");
		for (i = 0; i < 5; i++) {
			vet2[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			achou = false;
			System.out.println(vet1[i]);
			
			for (j = 0; j < 5; j++) {
				if ((vet1[i] % vet2[j]) == 0) {
					System.out.println("Divisivel por " + vet2[j] + " na posição " + (j + 1));
					achou = true;
				}
			}
			System.out.println();
			
			if (achou == false) {
				System.out.println("Não possui divisores no segundo vetor. \n");
			}
		}

	}

}
