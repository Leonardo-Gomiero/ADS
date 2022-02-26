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
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        int v4 = sc.nextInt();
        
        int produto = (v1*v2 - v3*v4);
        System.out.println("DIFERENCA = " + produto);
    }
}
