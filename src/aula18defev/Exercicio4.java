/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18defev;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio4 {
    public static void main(String[] args) {
        
        float salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o seu nível (1, 2 ou 3): ");
        int nivel = sc.nextInt();
        
        if (nivel == 1){
            salario = 160*12;
            System.out.printf("O seu salário, considerando 160 horas mensais, é: R$%.2f\n", salario);
        }else if (nivel == 2){
            salario = 160*17;
            System.out.printf("O seu salário, considerando 160 horas mensais, é: R$%.2f\n", salario);
        }else if (nivel == 3){
            salario = 160*25;
            System.out.printf("O seu salário, considerando 160 horas mensais, é: R$%.2f\n", salario);
        }else{
            System.out.println("\nNível inválido!");
        }
    }
}
