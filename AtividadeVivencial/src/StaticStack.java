public class StaticStack<E> implements Stack<E> {
    private int top;
    private E elements[];

    public StaticStack(int maxSize) {
        elements = (E[]) new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }

    public int numElements() {
        return top + 1;
    }

    /**
     * @param element
     * @throws OverflowException
     */
    public void pushBase(E element) throws OverflowException {
        if (isFull())
            throw new OverflowException();
    
        for (int i = top; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
    
        elements[0] = element;
        top++;
    }
    

    public Integer pop() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        E element = elements[top];
        elements[top--] = null; // p/ coleta de lixo
        return (Integer) element;
    }

    public E top() throws UnderflowException {
        if (isEmpty())
            throw new UnderflowException();
        return elements[top];
    }

    public String toString() {
        if (isEmpty())
            return "[Empty]";
        else {
            String s = "[";
            for (int i = numElements() - 1; i >= 0; i--) {
                s += "\n" + elements[i];
            }
            s += "\n]";
            return s;
        }
    }

    @Override
    public void push(Integer soma) {
        // TODO Auto-generated method stub
    }

   

}
