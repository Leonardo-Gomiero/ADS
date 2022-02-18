/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18defev;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float min, sal, h, H;
        
        
        System.out.print("Digite o valor do salário mínimo: ");
        min = sc.nextFloat();
        
        System.out.print("Digite o valor das horas trabalhadas: ");
        h = sc.nextFloat();
        
        System.out.print("Digite o valor das horas extras trabalhadas: ");
        H = sc.nextFloat();
        
        sal = (min/8)*h + (min/4)*H;
        
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        
        System.out.println("O valor das horas trabalhadas é: " + (min/8)*h);
        System.out.println("O valor das horas extras trabalhadas é: " + (min/4)*H);
        
        System.out.printf("O valor a ser recebido é R$%.2f\n", sal);
    }
}
