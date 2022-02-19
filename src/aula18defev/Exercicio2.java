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
public class Exercicio2 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor = sc.nextInt();
        
        if(valor < 0)
        {
            System.out.print("Seu número é negativo e é");
        }
        else{
            System.out.print("Seu número é positivo e é");
        }
        
        if((valor % 2) == 0)
        {
            System.out.print(" par");
        }
        else{
            System.out.println(" ímpar");
        }
        
    }
}
