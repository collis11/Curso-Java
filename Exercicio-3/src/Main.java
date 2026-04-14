import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero,hora,valor,salario;
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		valor = sc.nextInt();
		
		salario = (hora * valor);
		System.out.println("NUMERO: " + numero);
		System.out.println("SALARIO: " + salario);
		
		sc.close();
	}
}