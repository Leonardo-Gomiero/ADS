package Lisa1BeeCrowd;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
                    
        
        int v1 = sc.nextInt();
        int v2 = sc2.nextInt();
        double hora = sc3.nextDouble();
        
        String numero = String.format("%d", v1);
        
        
        double produto =  v2 * hora;
        
        String produto1 = String.format("%.2f", produto);
        
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + produto1);
        
    }
}
