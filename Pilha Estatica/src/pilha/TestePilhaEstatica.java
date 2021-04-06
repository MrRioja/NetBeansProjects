package pilha;

public class TestePilhaEstatica {

    public static void main(String[] args) {

        PilhaEstatica pilha = new PilhaEstatica(6);

        System.out.println(pilha.isFull());
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        pilha.push(6);
        System.out.println(pilha.size());
        pilha.push(5);
        System.out.println(pilha.size());
        pilha.push(4);
        System.out.println(pilha.size());
        pilha.push(3);
        System.out.println(pilha.size());
        pilha.push(2);
        System.out.println(pilha.size());
        pilha.push(1);
        System.out.println(pilha.size());
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        System.out.println(pilha.size());
        System.out.println(pilha.isFull());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.isEmpty());
        
    }
    
}
