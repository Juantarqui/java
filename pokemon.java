package for1;

import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        int pikachu = 100;
        int jiglipop = 100;
        int turno = 1;
        int daño = new Scanner(System.in).nextInt();
        while (pikachu > 0 && jiglipop > 0) {
            if (turno == 1) {
                System.out.println("la vida de jiglipop es: "+jiglipop);
                jiglipop = jiglipop - daño;
                System.out.println("la vida actual es: "+jiglipop);
                turno = 0;
            }else{
                System.out.println("la vida de pikachu es: "+pikachu);
                pikachu = pikachu - daño;
                System.out.println("la vida de pikachu es: "+pikachu);
                turno = 1;
            }
        }
        if (pikachu <= 0) {
            System.out.println("las victorias de jiglipop son: ");
        }else{
            System.out.println("el perdedor es: ");
        }
    }
}
