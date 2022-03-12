package Lisa1BeeCrowd;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                    
        
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        double hora = sc.nextDouble();
        
        
        
        
        double produto = v2 * hora;
        
        String produto1 = String.format("%.2f", produto);
        
        System.out.println("NUMBER = " + v1);
        System.out.println("SALARY = U$ " + produto1);
        
    }
}
