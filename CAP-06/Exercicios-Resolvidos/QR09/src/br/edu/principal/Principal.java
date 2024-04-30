package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numvoo[] = new int[12];
		String origem[] = new String[12];
		String destino[] = new String[12];
		int lugares[] = new int[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Qual o código do voo " + (i+1) + "?");
			numvoo[i] = sc.nextInt();
			sc.nextLine(); //pq o nextint deixa um \n pra trás que o nextline consome
			System.out.println("Qual a origem do voo?");
			origem[i] = sc.nextLine();
			System.out.println("Qual o destino do voo?");
			destino[i] = sc.nextLine();
			System.out.println("Quantos lugares disponíveis?");
			lugares[i] = sc.nextInt();
		}
		
		while (true) {
			System.out.println("1 - Consultar");
			System.out.println("2 - Reservar");
			System.out.println("3 - Finalizar");
			System.out.print("Digite sua opção: ");
			
			byte escolha1 = sc.nextByte();
			
			System.out.println("");
			
			if (escolha1 == 1) {
				System.out.println("1 - Consulta por voo");
				System.out.println("2 - Consulta por origem");
				System.out.println("3 - Consulta por destino");
				System.out.print("Digite sua opção: ");
				
				byte escolha2 = sc.nextByte();
				
				System.out.println("");
				
				if (escolha2 == 1) {
					System.out.println("Digite o número do voo: ");
					int num = sc.nextInt();
					int i = 1;
					while (i <= 12 && numvoo[i] != num) {
						i++;
					}
					if (i > 12) {
						System.out.println("Voo inexistente");
					} else {
						System.out.println("Número de voo: " + numvoo[i]);
						System.out.println("Local de origem: " + origem[i]);
						System.out.println("Destino: " + destino[i]);
						System.out.println("Lugares disponíveis: " + lugares[i]);
					}
				} 
				
				if (escolha2 == 2) {
					System.out.println("Digite o local de origem: ");
					String local = sc.nextLine();
					for (int i = 0; i < 12; i++) {
						if (local == origem[i]) {
							System.out.println("Número de voo: " + numvoo[i]);
							System.out.println("Local de origem: " + origem[i]);
							System.out.println("Destino: " + destino[i]);
							System.out.println("Lugares disponíveis: " + lugares[i]);
						}
					}
				}
				
				if (escolha2 == 3) {
					System.out.println("Digite o local de destino: ");
					String local = sc.nextLine();
					for (int i = 0; i < 12; i++) {
						if (local == destino[i]) {
							System.out.println("Número de voo: " + numvoo[i]);
							System.out.println("Local de origem: " + origem[i]);
							System.out.println("Destino: " + destino[i]);
							System.out.println("Lugares disponíveis: " + lugares[i]);
						}
					}
				}
				
			if (escolha1 == 2) {
				System.out.println("Escreva o número do voo desejado: ");
				int num = sc.nextInt();
				int i = 1;
				while (i <= 12 && numvoo[i] == num) {
					i++;
				}
				if (i > 12) {
					System.out.println("Número de voo não encontrado");
				} else {
					if (lugares[i] == 0) {
						System.out.println("Voo lotado");
					} else {
						lugares[i]--;
						System.out.println("Reserva confirmada");
					}
				}
			if (escolha1 == 3) {
				break;
			}			
			}
			}
		}
		
		
	}

}
