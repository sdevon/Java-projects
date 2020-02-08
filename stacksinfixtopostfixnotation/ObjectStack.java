/*
 * ObjectStack interface was given to us
 * Use methods in implementation
 */
package stacksinfixtopostfixnotation;
// ObjectStack.java

/**
 *
 * @author Devon
 */

public class ObjectStack implements ObjectStackInterface{
    private Object[] item;
    private int top;
    
    /**
     *
     */
    public ObjectStack() {
        item = new Object[1];
        top = -1;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     *
     * @return
     */
    public boolean isFull() {
        return top == item.length-1;
    }
    
    /**
     *
     */
    public void clear() {
        item = new Object[1];
        top = -1;
    }
    
    /**
     *
     * @param o
     */
    public void push(Object o) {
        if (isFull())
            resize(2 * item.length);
        item[++top] = o;
    }
    
    private void resize(int size) {
        Object[] temp = new Object[size];
        for (int i = 0; i <= top; i++)
            temp[i] = item[i];
        item = temp;
    }

    /**
     *
     * @return
     */
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        Object temp = item[top];
        item[top--] = null;
        if (top == item.length/4)
            resize(item.length/2);
        return temp;
    }
    
    /**
     *
     * @return
     */
    public Object top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }    
        return item[top];
    }
}