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
public class Exercicio1 {
    public static void main(String[] args) {
        char sexo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite se você é Homem (M) ou Mulher(F): ");
        sexo = sc.next().charAt(0);
        
        if(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')
        {
            System.out.println("Sexo binário");
        }
        else{
            System.out.println("Sexo não binário");
        }
    }
}
