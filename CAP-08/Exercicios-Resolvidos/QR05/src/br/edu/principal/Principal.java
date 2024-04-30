package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double percentual;
	    System.out.println("Digite o valor antigo do produto:");
	    double vAntigo = sc.nextDouble();
	    System.out.println("Digite o valor atual do produto:");
	    double vAtual = sc.nextDouble();
	    percentual = calcularPercentual(vAntigo, vAtual);
	    System.out.print("O percentual de acréscimo é de " + percentual + "%");
	  }
	 public static double calcularPercentual( double PA ,double PN){
		 double result = (100 * PN - 100 * PA) / PA;
		 return result;
	 }
}
