package pilha;

import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilha {

    Node topo = null;
    
    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Node topoAux = topo;
        
        while(topoAux != null){
            topoAux = topoAux.proximo;
            cont++;
        }
        return cont;
    }

    @Override
    public int pop() throws EmptyStackException {
        if(!isEmpty()){
            Node Aux = topo;
            topo = topo.proximo;
            Aux.proximo = null;
            
            return Aux.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public void push(int elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
    }

    @Override
    public int peek() throws EmptyStackException {
        if(!isEmpty()){
            return topo.elemento;
        }
        throw new EmptyStackException();
    }

}
