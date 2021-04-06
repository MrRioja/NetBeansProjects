package pilha;

import java.util.EmptyStackException;

public class PilhaEstatica implements TADPilha {

    private int[] vetor;
    private int topo;

    public PilhaEstatica(int tamanho) {
        vetor = new int[tamanho];
        topo = -1;
    }

    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo == vetor.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public int top() throws EmptyStackException {
        return vetor[topo];
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            return vetor[topo --];
        }
        throw new EmptyStackException();
    }

    @Override
    public void push(int elemento) {
        if (!isFull()) {
            topo++;
            vetor[topo] = elemento;
        }
    }

}
