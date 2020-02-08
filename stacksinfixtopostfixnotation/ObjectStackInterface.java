/*
 * Object Stack intferface deosnt seem to do anything in this lab
 * just use it to declare interface
 */
package stacksinfixtopostfixnotation;

/**
 *
 * @author Devon
 */
public interface ObjectStackInterface {
    
    /**
     *
     * @return
     */
    public boolean isEmpty();

    /**
     *
     * @return
     */
    public boolean isFull();

    /**
     *
     */
    public void clear();

    /**
     *
     * @param o
     */
    public void push(Object o);

    /**
     *
     * @return
     */
    public Object pop();

    /**
     *
     * @return
     */
    public Object top();

}
