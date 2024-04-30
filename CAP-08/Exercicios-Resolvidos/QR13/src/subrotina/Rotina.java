package subrotina;

public class Rotina {
	
	public static void fatoriais (int[] a, int[] b) {
		for (int i = 0; i < 10; i++) {
			if (a[i] == 0 || a[i] == 1) {
				b[i] = 1;
			} else {
				b[i] = 1;
				for (int j = 1; j <= a[i]; j++) {
					b[i] = b[i] * j;
				}
			}
		}
	}
}
