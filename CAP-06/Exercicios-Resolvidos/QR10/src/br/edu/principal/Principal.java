package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
            Scanner sc = new Scanner(System.in);
            String[] gabarito = new String[8];
            String[] resposta = new String[8];
            int num, pontos, totAP, i, j;
            double percAP;

            for (i = 0; i < 8; i++) {
                    System.out.println("Digite a resposta da questão " + (i+1) + ": ");
                    gabarito[i] = sc.next();
            }

            totAP = 0;

            for (i = 0; i < 10; i++) {
                    System.out.println("Digite o número do " + (i+1) + "º aluno: ");
                    num = sc.nextInt();
                    pontos = 0;

                    for (j = 0; j < 8; j++) {
                            System.out.println("Digite a resposta dada pelo aluno " + num + " à " + (j+1) + "ª questão: ");
                            resposta[j] = sc.next();

                            if (resposta[j].equals(gabarito[j]))
                                    pontos++;
                    }

                    System.out.println("A nota do aluno " + num + " foi " + pontos);

                    if (pontos >= 6)
                            totAP++;
            } percAP = (totAP * 100/10);
              System.out.println("O percentual de alunos aprovados é " + percAP);

	}
}
