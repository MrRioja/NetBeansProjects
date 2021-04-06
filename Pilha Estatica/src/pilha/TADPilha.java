package pilha;

import java.util.EmptyStackException;

public interface TADPilha {

    public boolean isEmpty();

    public boolean isFull();

    public int size();

    public int top() throws EmptyStackException;

    public int pop() throws EmptyStackException;

    public void push(int elemento);

}
