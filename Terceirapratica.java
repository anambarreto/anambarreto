package Teste;

import java.util.Scanner;

public class Terceirapratica {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Terceira aula pratica!");
		
		Scanner	leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a idade");
		int idade = leitor.nextInt();
		
		System.out.println("Digite a nota1");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite a nota2");
		double nota2 = leitor.nextDouble();
		
		System.out.println("Digite a nota3");
		double nota3 = leitor.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média do estudante: " +media);
		
		boolean aprovado = true;
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
		if(media >= 7.0) {
			System.out.println("Estudante aprovado!");
		}
		else {
			System.out.println("Estudante reprovado!");
			aprovado = false;
		}
		System.out.println(aprovado);
	}

}