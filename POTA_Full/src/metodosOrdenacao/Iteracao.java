package metodosOrdenacao;

public class Iteracao {

    public static void contagemRegressiva(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("Feliz Ano Novo!");
    }

    public static int soma(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }
        return soma;
    }
    
    public static int buscaBinariaInterativa(int[] n, int numero){
        int primeiro = 0;
        int ultimo = n.length-1;
        
        while(primeiro <= ultimo){
            int meio = (primeiro + ultimo)/2;
            
            if(n[meio] == numero){
                return meio;
            }
            else{
                if(numero < n[meio]){
                    ultimo = meio - 1;
                }
                else{
                    primeiro = meio + 1;
                }
            }
        }
        
        return -1;
    }
}