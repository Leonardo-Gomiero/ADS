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
public class Exercicio3 {
    public static void main(String[] args) {
        int valor1, valor2, max, min;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        valor1 = sc.nextInt();
        
        System.out.print("Digite um valor: ");
        valor2 = sc.nextInt();
        
        max = Math.max(valor1, valor2);
        min = Math.min(valor1, valor2);
        
        System.out.println("O valor máximo é " + max);
        System.out.println("O valor mínimo é " + min);
    }
}
