import java.util.Scanner;

public class Desafio2 {
//    A fórmula de Binet é uma forma de calcular números de Fibonacci.
    public static void main(String[] args) {
        double F;
        double entrada;
        double teste;
        double teste2;
        double teste3;
        double G1;
        double G2;
        double G3;
        Scanner in = new Scanner(System.in);

        entrada = Double.parseDouble(in.nextLine());
        //Math.pow(2,9); //2^9


        F =(Math.pow((1+Math.sqrt(5))/2,entrada) - Math.pow((1-Math.sqrt(5))/2,entrada)) / Math.sqrt(5);

        System.out.println("  FIBONNACI:  "+F);



    }
}
