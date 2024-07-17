package for1;

import java.util.Scanner;

public class For {

        public static void main(String[] args) {
        // ciclo for.
        /* 
        for(i=0,i<=10,i++){
        verdadero
        } */
       //int i;
       // i=i+2  es lo mismo que i+=2
       int n = new Scanner(System.in).nextInt();
        for(int i=2;i<=n*10;i+=2){
            System.out.println(i);
        }
        }
}
