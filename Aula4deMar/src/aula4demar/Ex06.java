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
public class Ex06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e positivo: ");
        
        int valor = sc.nextInt();
        
        Boolean primo = true;       //Isto é o que se chama Flag. É uma variável auxiiar à programação.
        
        for(int i = 2; i <= (valor - 1); i++){
            
            if(valor % i ==0){
                System.out.println("Este número não é primo!");
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println("Este número é primo!");
        }
    }
}
