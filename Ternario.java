package for1;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) throws Exception {
        //es una condicional de una sola linea
        //int a=b > c ? verdadero: falso;
       /* if (a > c) {
            veradero
        }else{
            falso
        }*/
        //String. es un tipo de dato de objeto.
        int f = new Scanner(System.in).nextInt();

        String a = 2 > 3 ? "si es verdadero":"no es verdadero";
        System.out.println(a);
        //System.out.println( 2 > 3 ? "si es verdadero":"no es verdadero");
}
}
