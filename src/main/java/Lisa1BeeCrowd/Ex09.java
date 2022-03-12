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
public class Ex09 {
    public static void main(String[] args) {
        
        String nome;
        double salario, vendas, total;
        
        Scanner sc = new Scanner(System.in);
        
        nome = sc.nextLine();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();
        
        total = salario + (0.15*vendas);
        String saidaTotal = String.format("%.2f", total);
        
        System.out.println("TOTAL = R$ " + saidaTotal);
    }
}
