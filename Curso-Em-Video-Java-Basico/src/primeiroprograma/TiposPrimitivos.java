package primeiroprograma;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		//float nota = 8.5f; // float nota = (float) 8.5;
		System.out.println("Olá " + nome + " a sua nota é " + nota);
		teclado.close();

	}

}
