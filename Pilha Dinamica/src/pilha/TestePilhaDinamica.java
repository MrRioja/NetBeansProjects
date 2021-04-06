package pilha;

public class TestePilhaDinamica {

    public static void main(String[] args) {

        PilhaDinamica pilha = new PilhaDinamica();
        
        System.out.println(pilha.size());
        pilha.push(2);
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
        pilha.push(4);
        System.out.println(pilha.size());
        System.out.println(pilha.peek());
        pilha.push(6);
        System.out.println(pilha.peek());
        pilha.push(8);
        System.out.println(pilha.peek());
        pilha.push(10);
        System.out.println(pilha.peek());
        pilha.push(12);
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println(pilha.size());
        System.out.println(pilha.pop());
       
    }
    
}
