package exercicios;
import java.util.Scanner;
public class Ex07 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Queremos descobrir area do Retangulo");
		
		System.out.println("Digite o valor da base do retangulo");
		float valorBase = sc.nextFloat();
		
		
		System.out.println("Digite o valor da altura do retangulo ");
		float valorAltura = sc.nextFloat();
		
		
		float resultado = valorBase*valorAltura;
		
		
		System.out.println("A area de um retangulo é " + resultado + " m²" );
		
		sc.close();
		
	}

}
