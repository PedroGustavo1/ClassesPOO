import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		int num[] = new int[10];
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < num.length; ++i) {
			System.out.print("Informe um numero: ");
			num[i] = in.nextInt();
		}
		
		System.out.print("Numeros: ");
		for(int i = num.length -1; i>=0; --i) {
			System.out.print(num[i] + " ");
		}
	}

}

