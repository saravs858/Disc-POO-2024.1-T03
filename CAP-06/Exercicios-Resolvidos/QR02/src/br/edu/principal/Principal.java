package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] qtd = new int[10];
        double[] preco = new double[10];
        int i, tot_geral = 0, comissao, maior, ind = 1;
        double tot_vend = 0;
        
        for (i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade vendida do produto " + (i + 1) + ": ");
            qtd[i] = sc.nextInt();
            System.out.print("Digite o preço unitário do produto " + (i + 1) + ": ");
            preco[i] = sc.nextDouble();
        }
        
        for (i = 0; i < 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("Quantidade: " + qtd[i] + ", Preço: " + preco[i] + ", Total da Venda: " + tot_vend);
            tot_geral += tot_vend;
        }
        
        comissao = (int) (tot_geral * 0.05);
        System.out.println("Total Geral de Vendas: " + tot_geral + ", Comissão: " + comissao);
        
        maior = qtd[0];
        for (i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i + 1;
            }
        }
        
        System.out.println("Produto com maior quantidade vendida: Preço: " + preco[ind - 1] + ", Índice: " + ind);
        
	}

}
