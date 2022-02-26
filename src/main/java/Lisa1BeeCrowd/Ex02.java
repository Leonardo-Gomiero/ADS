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
        
        float n = 3.14159f;
        float area;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Insira o valor do raio do círculo: ");
        float r = sc.nextFloat();
        
        area = ((float) Math.pow((Math.round(r*100.0)/100.0), 2)) * n;
        System.out.printf("A=%.4f", area);
    }
}
