package baseexpoentenegativo;

import java.util.Scanner;

public class BaseExpoenteNegativo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a base");
        int base = leia.nextInt();
        System.out.println("Digite o expoente");
        int expoente = leia.nextInt();

        System.out.println(potencia(base, expoente));
    }

    public static double potencia(double base, int expoente) {
        if (expoente < 0) {
            return potencia(1.0/base, -expoente);
        } else if(expoente == 0){
            return 1;
        } else if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}

