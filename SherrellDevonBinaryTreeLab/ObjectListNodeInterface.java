
package binarytree;

/**
 *
 * @author Devon
 */
public interface ObjectListNodeInterface {

    /**
     *
     * @param o
     */
    public void setInfo(Object o);

    /**
     *
     * @return
     */
    public Object getInfo();

    /**
     *
     * @param p
     */
    public void setNext(ObjectListNode p);

    /**
     *
     * @return
     */
    public ObjectListNode getNext();
}
