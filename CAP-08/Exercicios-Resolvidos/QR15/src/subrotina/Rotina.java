package subrotina;

public class Rotina {
	
	public static void ordena(int v[]) {
		int i, j, aux;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j ++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}

}