package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num[] = new int [8]; int pos[] = new int [8]; int neg[] = new int [8];
		int i, cont, contP, contN;
		
		contP = 0;
		contN = 0;
		
		for(i = 0; i < 8 ; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			num[i] = sc.nextInt();
			
			if (num[i] >= 0) {
				pos[contP] = num[i];
				contP++;
			} else {
				neg[contN] = num[i];
				contN++;
			}
		
		} System.out.println();
		
		if (contN == 0) {
			System.out.println("Não há nada no vetor negativo!");
		} else {
			System.out.println("Elementos do vetor de negativos:");
			for (i = 0; i < contN; i++) {
				System.out.println(neg[i]);
			}
		} System.out.println();
		
		if (contP == 0) {
			System.out.println("Não há nada no vetor positivo!");
		} else {
			System.out.println("Elementos do vetor de positivos:");
			for (i = 0; i < contP; i++) {
				System.out.println(pos[i]);
			}
		}
	
	
	}

}
