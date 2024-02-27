package exercicios;
import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos iniciar essa operação matemática que é MULTIPLICAÇÃO");
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		int valor2 = sc.nextInt();
		
		
		int resultado = valor1*valor2;
		
		
		System.out.println("O valores digitado multiplicado é: " +resultado);
		
		sc.close();
	}

}
