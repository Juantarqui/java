package for1;

import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
       int a = new Scanner(System.in).nextInt();
       if (a>0) {
        System.out.println("el resultado es");
        for (int x= a-1;x > 0; x = x-2) {
            System.out.println(x);
           }
       }else{
        System.out.println("error");
       }
       
    }
}
