package Lisa1BeeCrowd;

import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        
        int cod1, cod2, quant1, quant2;
        double preco1, preco2, total;
        
        Scanner sc = new Scanner(System.in);
        
        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        preco1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        preco2 = sc.nextDouble();
        
        total = (quant1 * preco1) + (quant2 * preco2);
        
        String totalSaida = String.format("%.2f", total);
        
        System.out.println("VALOR A PAGAR: R$ " + totalSaida);
        
    }
}
