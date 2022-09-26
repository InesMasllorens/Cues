




public interface Queue<E> {
    /**
     * Mètode que permet afegir/encuar un nou element a la cua
     * @param e l'element a "encuar"
     * @throws FullQueueException llença aquesta excepció en el cas que
     * la cua estigui plena
     */
    public void push(E e) throws FullQueueException;

    public E pop() throws EmptyQueueException;
    public int size();
}

public class LaMevaCua<E> implements Queue<E> {

    E[] elems;
    int p;

    public void push (E e) throws FullQueueException {
        if (isFull()) throw new FullQueueException ();
        elems[p++] = e;
    }

    public E pop () throws EmptyQueueException {
        if (isEmpty());
        E primer = elems[0]

///desplaçament esquerra
        this.p--;

        return primer;
    }

    public int size() {
        return this.p;
    }
