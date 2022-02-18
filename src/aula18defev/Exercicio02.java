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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, media;
        
        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextFloat();
        
        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextFloat();
        
        System.out.print("Digite o terceiro valor: ");
        n3 = sc.nextFloat();
        
        media = (n1 + n2 + n3)/3;
        System.out.println("A média dos vaores inseridos é " + media);
    }
}
