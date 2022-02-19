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
public class ExemploDeSala3 {

    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outra idade"));

        if (a > 18) {
            JOptionPane.showMessageDialog(null, a + " é maior que 18");
        } else if (b > 18) {
            JOptionPane.showMessageDialog(null, b + " é maior que 18");
        } else {
            JOptionPane.showMessageDialog(null, a + "Ambos são iguais");
        }

    }
}
