/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lisa1BeeCrowd;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex02 {
    public static void main(String[] args) {
        
        double n = 3.14159;
        double area;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Insira o valor do raio do círculo: ");
        double r = sc.nextDouble();
        
        area = n*r*r;
        System.out.printf("A=%.4f", area);
    }
}
