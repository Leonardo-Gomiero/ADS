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
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro e positivo: ");
        int valor = sc.nextInt();
        
        for(int i = 0; i <= valor; i++){
            System.out.println("Eu retornarei ao macaco!");
        }
    }
}
