// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res, count, countTotal;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        countTotal = 1000;
        // System.out.println( i +"° " + d[i]);
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                res = n;
                count = 0;

                for (int j = i; j > 0; j--) {

                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else {
                            j--;
                        }
                        // System.out.println( i +"° " + d[i]);
                    }
                }                

                if (countTotal > count) {
                    countTotal = count;
                }

            }            
            
        }

        System.out.println(countTotal);

    }
}