package Teste;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
/* Primeiro exercício
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
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
		System.out.println("A idade total em dias é: " + totalIdadeEmDias + " dias.");
		
		
/*Segundo exercicio
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
		
		int num1 = 8;
		int num2 = 9;
		int num3 = 7;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		
		double media1 = (num1 + num2 + num3) / 3;
		System.out.println("Média dos números 8, 9 e 7: " +media1);
		double media2 = (num4 + num5 + num6) / 3;
		System.out.println("Média dos números 4, 5 e 6: " +media2);
		
		double somaDasMedias = media1 + media2;
		System.out.println("Soma das 2 médias: " +somaDasMedias);
		
		double mediaDasMedias = somaDasMedias / 2;
		System.out.println("Média das 2 médias: " +mediaDasMedias);
		
/* Terceiro exercício
Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
		
		System.out.println("Informe seu saldo: ");
		
		double saldo = leitor.nextDouble();
		
		double reajuste = saldo * 0.01;
		
		double saldoReajustado = saldo + reajuste;
		System.out.println("O saldo reajustado é de: " +saldoReajustado);

/*Quinto exercício
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/
		double vlrSalarioMinimo = 788.00;
		
		System.out.println("Informe seu salário: ");
		double meuSalario = leitor.nextDouble();
		
		double qtdSalariosMinimos = meuSalario / vlrSalarioMinimo;
		System.out.println("Você recebe " +qtdSalariosMinimos +"aproximadamente ");
		
/*Sexto exercício
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
 */
		Random nroaleatorio = new Random();
		int numeroInteiroAleatorio = nroaleatorio.nextInt(10);
		
		int antecessor = numeroInteiroAleatorio - 1;
		int sucessor = numeroInteiroAleatorio + 1;
		
		System.out.println("Número aleatório gerado: " +numeroInteiroAleatorio);
		System.out.println("O antecessor é: " +antecessor);
		System.out.println("O sucessor é: " +sucessor);
		
	}

}
