package Teste;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
/* Primeiro exerc�cio
Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em considera��o o ano com 365 dias e o m�s com 30.
Tomei como exemplo a minha idade.
*/
		Scanner	leitor = new Scanner(System.in);
		
		System.out.print("Informe a idade em anos: ");
        int anos = leitor.nextInt();

        System.out.print("Informe a idade em meses: ");
        int meses = leitor.nextInt();

        System.out.print("Informe a idade em dias: ");
        int dias = leitor.nextInt();

		int totalIdadeEmDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("A idade total em dias �: " + totalIdadeEmDias + " dias.");
		
		
/*Segundo exercicio
Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
 */
		
		int num1 = 8;
		int num2 = 9;
		int num3 = 7;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		
		double media1 = (num1 + num2 + num3) / 3;
		System.out.println("M�dia dos n�meros 8, 9 e 7: " +media1);
		double media2 = (num4 + num5 + num6) / 3;
		System.out.println("M�dia dos n�meros 4, 5 e 6: " +media2);
		
		double somaDasMedias = media1 + media2;
		System.out.println("Soma das 2 m�dias: " +somaDasMedias);
		
		double mediaDasMedias = somaDasMedias / 2;
		System.out.println("M�dia das 2 m�dias: " +mediaDasMedias);
		
/* Terceiro exerc�cio
Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
		
		System.out.println("Informe seu saldo: ");
		
		double saldo = leitor.nextDouble();
		
		double reajuste = saldo * 0.01;
		
		double saldoReajustado = saldo + reajuste;
		System.out.println("O saldo reajustado � de: " +saldoReajustado);

/*Quinto exerc�cio
Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado.
(1SM=R$788,00)
*/
		double vlrSalarioMinimo = 788.00;
		
		System.out.println("Informe seu sal�rio: ");
		double meuSalario = leitor.nextDouble();
		
		double qtdSalariosMinimos = meuSalario / vlrSalarioMinimo;
		System.out.println("Voc� recebe " +qtdSalariosMinimos +"aproximadamente ");
		
/*Sexto exerc�cio
Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu
antecessor e seu sucessor.
 */
		Random nroaleatorio = new Random();
		int numeroInteiroAleatorio = nroaleatorio.nextInt(10);
		
		int antecessor = numeroInteiroAleatorio - 1;
		int sucessor = numeroInteiroAleatorio + 1;
		
		System.out.println("N�mero aleat�rio gerado: " +numeroInteiroAleatorio);
		System.out.println("O antecessor �: " +antecessor);
		System.out.println("O sucessor �: " +sucessor);
		
	}

}
