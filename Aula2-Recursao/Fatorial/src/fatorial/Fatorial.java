package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o fatorial");
        int num = leia.nextInt();
        
        System.out.println(fatorial(num));
    }

    public static int fatorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num*fatorial(num-1);

        }
    }

}
