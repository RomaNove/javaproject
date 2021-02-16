/**
 * 
 */
package javaprojeto1;

import java.util.Scanner;

/**
 * @author Bruno
 *
 */
public class Principal { //Classe que contém o método principal.
	public static void main(String[] args) { //Este é o método principal.
		
		// Saldação e pergunta o nome
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		//Ler uma string do console usando a biblioteca Scanner.
		//Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir um string usando printf.
		//Saldação específica.
		
		System.out.printf("Olá %s", nome);
		in.close();


	}

}
