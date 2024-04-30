package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		int i, j = 0;
		
		System.out.println("Digite os elementos do primeiro vetor (10 elementos):");
        for (i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os elementos do segundo vetor (10 elementos):");
        for (i = 0; i < 10; i++) {
            vet2[i] = scanner.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            vet3[j] = vet1[i];
            j++;
            vet3[j] = vet2[i];
            j++;
        }
        
        System.out.println("Vetor intercalado:");
        for (i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }
		
		
        
	}

}
