package exercicios;
import java.util.Scanner;
public class Ex10 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Queremos descobrir a area de um LOSANGULO");
		
		System.out.println("Digite a diagonal maior para descobrir a area");
		float maior = sc.nextFloat();
		
		System.out.println("Digite a diagonal menor para descobrir a area");
		float menor = sc.nextFloat();
		
		float resultado = (maior*menor)/2;
		
		System.out.println("A area de um LOSANGULO é : " +resultado);
		
		sc.close();
	}

}
