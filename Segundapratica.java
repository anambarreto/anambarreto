package Teste;

import java.util.Scanner;

public class Segundapratica {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Segunda aula pratica!");
//segunda pratica, valores variaveis

/*
comentario de 
varias 
linhas
*/
		
		Scanner	leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a idade");
		int idade = leitor.nextInt();
		
		System.out.println("Digite a nota");
		double nota = leitor.nextDouble();
/*
> maior do que
< menor do que
>= maior ou igual
<= menor ou igual
== igual a
!= diferente de
o símbolo = é apenas para atribuir valor de variáveis
&& - significa E
|| - significa OU
 */
		
		if(nota >= 7.0) {
			System.out.println("O estudante: " +nome +" passou com nota: " +nota);
		}
		else {
			System.out.println("O estudante: " +nome +" reprovou com nota: " +nota);
		}

	}

}