package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int [10];
		int i, j  ,aux;
		
		for (i= 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° número:");
			vet[i] = sc.nextInt();
		}
		
		for (j = 0; j < 9; j++) {
		    for (i = 0; i < 9; i++) {
		        if (vet[i] < vet[i + 1]) {
		            aux = vet[i];
		            vet[i] = vet[i + 1];
		            vet[i + 1] = aux;
				}
			}
		}
		
		for (i= 0; i < 10; i++) {
			System.out.print(vet[i] + ", ");
			}
	}

}
