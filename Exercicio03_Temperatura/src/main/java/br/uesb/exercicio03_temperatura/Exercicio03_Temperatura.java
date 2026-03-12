
/* * Disciplina: Introdução a Algoritmos e Programação
 * Atividade: Laboratório 02 
 * Aluno: Sérgio Barros
 */
package br.uesb.exercicio03_temperatura;
import java.util.Scanner;

public class Exercicio03_Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = leitor.nextDouble();
        
        // Utilisamos .0 para garantir que o Java não arredonde a conta para zero
        double c = (5.0 / 9.0) * (f - 32);
        
        System.out.println("A temperatura em Celsius é: " + c);
    }
}