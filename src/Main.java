import java.util.Scanner;

public class Main {
//    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    public static void main(String[] args) {
        int N;
        int total = 0;
        int i = 0;
        Scanner in = new Scanner(System.in);

        N = Integer.parseInt(in.nextLine());
        total = N;
            for (i = 1; i < total; i++) {
                N = N * i;


            }
        System.out.println(N);


        //complete o código com sua solução


    }
}