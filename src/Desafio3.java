import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {
//    O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
    public static void main(String[] args)  throws IOException {
        int Ninicial;
        int Nfinal;
        int i ;
        int saida = 0;

        Scanner sc = new Scanner(System.in);
        Ninicial = Integer.parseInt(sc.nextLine());
        Nfinal = Integer.parseInt(sc.nextLine());

      if(Ninicial > Nfinal){
          for(i=Nfinal+1;i<Ninicial;i++){
              if(i % 2 != 0) {
                  saida = saida + i;
              }
          }
          System.out.println(saida);
      }
      else {
          for(i=Ninicial+1;i<Nfinal;i++){
              if(i % 2 != 0) {
                  saida = saida + i;
              }
          }
          System.out.println(saida);
      }






    }
}