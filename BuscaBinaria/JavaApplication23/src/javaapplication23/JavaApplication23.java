package javaapplication23;

import java.util.Random;
import java.util.Arrays;

public class JavaApplication23 {
    
    static int[] vetor;

    public static void main(String[] args) {
        int n = 10;
        int max = 100;
        int seed = 47;
        int X = 68;

        Random random = new Random(seed);

        vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max);
        }
        
        Arrays.sort(vetor);
        
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        
        int result = buscaBinariaIterativa(X);
        System.out.println(result);
    }
    
    public static int buscaBinariaIterativa(int x){
        int inicio = 0;
        int fim = vetor.length;
                
        while(inicio <= fim){
            int centro = (inicio + fim) / 2;
            if(x == vetor[centro]){
                return centro;
            }else{
                if(x < vetor[centro]){
                    fim = --centro;
                }else{
                    inicio = ++centro;
                }                
            }
        }
        return -1;
    }
    
    
}
