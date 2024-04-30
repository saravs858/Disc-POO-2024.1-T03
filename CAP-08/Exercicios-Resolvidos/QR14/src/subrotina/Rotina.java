package subrotina;

public class Rotina {
	
	public static int uniao(int a[], int b[], int u[]) {
		int k = 0;
		
		for (int i = 0; i < 10; i++) {
			int cont = 0;
			
			while (cont < k && a[i] != u[cont]) {
				cont = cont + 1;
			}
			
			if (cont == k) {
				u[k] = a[i];
				k = k + 1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			int cont = 0;
			
			while (cont < k && b[i] != u[cont]) {
				cont = cont + 1;
				
				if (cont == k) {
					u[k] = b[i];
					k = k + 1;
				}
			}
		}
		
		return k;
	}

}