package exercicios;
import java.util.Scanner;
public class Ex08 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Queremos descobrir area do TRIANGULO");
		
		System.out.println("Digite o valor da base do triangulo ");
		int valorBase = sc.nextInt();
		
		
		System.out.println("Digite o valor da altura do triangulo ");
		int valorAltura = sc.nextInt();
		
		
		int resultado = valorBase*valorAltura/2;
		
		
		System.out.println("A area de um retangulo é " + resultado);
		
		sc.close();
		
	}

}
