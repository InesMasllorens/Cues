public class LaMevaCua<E> implements Queue<E> {

    E[] elems;
    int p;

    public LaMevaCua(int i) {
        elems= (E[]) new Object[i];
    }

    public void push(E e) throws FullQueueException {
        if (isFull()) throw new FullQueueException();
        elems[p++] = e;
        this.p++;
    }

    private boolean isFull() {
        boolean full=false;
        if(this.p>=5)full=true;
        return full;
    }

    public E pop() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        E primer = elems[0];

///desplaçament esquerra
        this.p--;

        return primer;
    }

    private boolean isEmpty() {
        boolean empty=false;
        if(this.p==0)empty=true;
        return empty;
    }

    public int size() {
        return this.p;
    }
}
