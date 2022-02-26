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
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
                    
        
        int v1 = sc.nextInt();
        int v2 = sc2.nextInt();
        float hora = sc3.nextFloat();
        
        
        float produto = v1 * v2 * hora;
        System.out.println("NUMBER = " + v1);
        System.out.printf("SALARY = U$ %.2f", produto);
        
    }
}
