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
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();
        double produto;
        
        produto = (((3.5*v1) + (7.5*v2))/11);
        
        String produto1 = String.format("%.5f", produto);
        System.out.println("MEDIA = "+ produto1);
    }
}
