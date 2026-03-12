
/* * Disciplina: Introdução a Algoritmos e Programação
 * Atividade: Laboratório 02 
 * Aluno: Sérgio Barros
 */
package br.uesb.exercicio01_soma;
import java.util.Scanner;

public class Exercicio01_Soma {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner para ler o que for digitado
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = leitor.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = leitor.nextInt();
        
        // Calculando a soma
        int soma = n1 + n2;
        
        // Exibindo o resultado final
        System.out.println("O resultado da soma é: " + soma);
    }
}