package pilha;

import java.util.EmptyStackException;

public interface TADPilha {

    public boolean isEmpty();

    public int size();

    public int peek() throws EmptyStackException;

    public int pop() throws EmptyStackException;

    public void push(int elemento);

}
