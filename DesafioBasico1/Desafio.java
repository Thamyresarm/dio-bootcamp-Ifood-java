// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        Integer Num1, Num2;

        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite o primeiro número: ");
        Num1 = scan.nextInt();
        //System.out.println("Digite o segundo número: ");
        Num2 = scan.nextInt();
        
        if (Num1 == Num2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");   
        }       

    }
}