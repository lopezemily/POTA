package maiorelementovetor;

import java.util.Random;

public class MaiorElementoVetor {

    public static void main(String[] args) {
        //scanner 
//        int n =7;
//        Random random = new Random();
//
//        int[] vetor = new int[n];
//
//        for (int i = 0; i < vetor.length; i++) {
//            vetor[i] = random.nextInt(100);
//        }
        int n =3;
        int[] vetor = new int[] { 2, 6, 3};
        
        int maior = maiorElemento(vetor);
        
        System.out.println(maior);
    }
    
    public static int maiorElemento(int[] vetor){
        return maiorElementoRecursiva(vetor, 0);
    }
    
    public static int maiorElementoRecursiva(int[] vetor, int indice){
        int atual = vetor[indice];
        
        if(indice >= vetor.length -1){
            return atual;
        }else{
            int maiorRetornado = maiorElementoRecursiva(vetor, indice + 1);
            if(atual > maiorRetornado){
                return atual;
            }else{
                return maiorRetornado;
            }
        }
    }
    
}
