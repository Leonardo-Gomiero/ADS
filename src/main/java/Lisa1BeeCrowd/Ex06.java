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
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float v1 = sc.nextFloat();
        float v2 = sc.nextFloat();
        float v3 = sc.nextFloat();
        
        float produto = (v1*2 + v2*3 + v3*5)/10;
        System.out.printf("MEDIA = %.1f\n", produto);
    }
}
