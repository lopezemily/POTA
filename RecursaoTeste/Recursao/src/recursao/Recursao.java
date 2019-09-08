package recursao;

public class Recursao {

    public static void main(String[] args) {
        System.out.println(somaFracao(4)); // 15
    }
    
    public static int f(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return 2*f(n-1) + 3*f(n-2);
    }
    
    public static int A(int m, int n){
        if(m == 0) return n+1;
        if(n == 0) return A(m-1, 1);
        return A(m - 1, A(m, n - 1));
    }
    
    public static int mult(int n, int valor){
        if(n == 0) return 0;
        if(n == 1) return valor;
        return valor+mult(n-1,valor);
    }
    
    public static int sum(int x, int y){ // x + y
        if(y == 0) return 0;
        if(y == 1) return ++x;
        return 1 + sum(x, y -1);
    }
    
    public static String inverte(String nome){
        if(nome.length() == 0) return "";
        return nome.charAt(nome.length()-1) + inverte(nome.substring(0, nome.length() -1));
    }
    
    public static double somaFracao(int N){
        if (N ==1) return 1;
        return 1.0/N + somaFracao(N-1);
    }
    
}
