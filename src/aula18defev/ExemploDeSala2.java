/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18defev;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ExemploDeSala2 {
    public static void main(String[] args) {
        int a;
        float b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real: "));
        
        
        JOptionPane.showMessageDialog(null, "O número inteiro é" + a);
        JOptionPane.showMessageDialog(null, "O número real é: " + b);
    }
}
