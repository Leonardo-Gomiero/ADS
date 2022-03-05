/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4demar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int x = sc.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int y = sc.nextInt();
        
        int soma = 0;
        
        
        
        
        
            for(int i = Math.min(x, y); i<=Math.max(x, y); i++){
                soma += i;
                System.out.println(soma);
            }
    }
}
