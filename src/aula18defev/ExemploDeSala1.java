/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18defev;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class ExemploDeSala1 {
    public static void main(String[] args) {
        String name, email, site;
        name = JOptionPane.showInputDialog("Nome", "Digite seu nome:");
        email = JOptionPane.showInputDialog("Email", "Digite seu email:");
        site = JOptionPane.showInputDialog("Site", "Digite seu site:");
        
        JOptionPane.showMessageDialog(null, "Nome: " + name);
        JOptionPane.showMessageDialog(null, "Email: " + email);
        JOptionPane.showMessageDialog(null, "Site: " + site);
    }
}
