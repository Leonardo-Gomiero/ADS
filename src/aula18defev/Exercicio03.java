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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b, B, h, area;
        
        System.out.print("Digite o valor da base menor do trapézio: ");
        b = sc.nextFloat();
        
        System.out.print("Digite o valor da base maior do trapézio: ");
        B = sc.nextFloat();
        
        System.out.print("Digite o valor da altura do trapézio: ");
        h = sc.nextFloat();
        
        area = ((b + B)/2)*h;
        System.out.println("A área do seu trapézio é " + area);
    }
}
