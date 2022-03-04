
package aula4demar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula4deMar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        int valor = sc.nextInt();
        
        for(int i = 1; i  <= 10; i++){
            System.out.printf("%d x %d = %d\n", valor, i, valor*i);
        }
    }
    
}
