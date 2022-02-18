/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18defev;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, soma, produto;
        
        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextFloat();
        
        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextFloat();
        
        System.out.print("Digite o terceiro valor: ");
        n3 = sc.nextFloat();
        
        soma = n1 + n2 + n3;
        produto = n1*n2*n3;
        
        System.out.println("A seguir, o valor do produto: " + produto + "\nA seguir, o valor da soma: " + soma);
        
    }
    
}
