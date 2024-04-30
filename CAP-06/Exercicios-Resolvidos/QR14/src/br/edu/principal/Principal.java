package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String [5];
		int sal[] = new int [5]; int quant[] = new int [5];
		int i;
		float novo_sal;
		
		for (i = 0; i < 5; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "° funcionario: ");
			nome[i] = sc.next();
			System.out.print("Digite o salario do " + (i + 1) + "° funcionario: ");
			sal[i] = sc.nextInt();
			System.out.print("Digite o tempo de serviço do " + (i + 1) + "° funcionario: ");
			quant[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("Os funcionarios que não receberão aumento são: ");
		for (i = 0; i < 5; i++) {
			if (quant[i] <= 5 && sal[i] >= 800) {
				System.out.println(nome[i]);
			}
		}
		System.out.println();
		
		System.out.println("Os funcionarios que receberão aumento são: ");
		for (i = 0; i < 5; i++) {
			if (quant[i] > 5 || sal[i] < 800) {
				if (quant[i] > 5 && sal[i] < 800) {
					novo_sal = (float) (sal[i] + (0.35 * sal[i]));
				}
				else if (quant[i] > 5) {
					novo_sal = (float) (sal[i] + (0.25 * sal[i]));
				}
				else {
					novo_sal = (float) (sal[i] + (0.15 * sal[i]));
				}
				
				System.out.println(nome[i]+ " e seu novo salario é: " + novo_sal);
			}
		}
	}

}
