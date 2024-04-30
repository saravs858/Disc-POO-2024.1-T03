package br.edu.subrotina;

import java.util.Scanner;

public class Rotina {

	 public static void maior_menor() {
	        Scanner sc = new Scanner(System.in);

	        int num, maior = 0, menor = 0;

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Digite o " + i + "º número:");
	            num = sc.nextInt();

	            if (i == 1) {
	                maior = num;
	                menor = num;
	            } else {
	                if (num > maior) {
	                    maior = num;
	                }
	                if (num < menor) {
	                    menor = num;
	                }
	            }
	        }
	        System.out.println();
	        System.out.println("O maior número digitado foi: " + maior);
	        System.out.println("O menor número digitado foi: " + menor);
	    }
}
