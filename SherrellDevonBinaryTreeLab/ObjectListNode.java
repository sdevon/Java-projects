package binarytree;

/**
 *
 * @author Devon
 */
public class ObjectListNode {
    private Object info;
    private ObjectListNode next;
    
    /**
     *
     */
    public ObjectListNode() {
        info = null;
        next = null;
    }

    /**
     *
     * @param o
     */
    public ObjectListNode (Object o) {
        info = o;
        next = null;
    }    
    
    /**
     *
     * @param o
     * @param p
     */
    public ObjectListNode (Object o, ObjectListNode p) {
        info = o;
        next = p;
    }       

    /**
     *
     * @param o
     */
    public void setInfo(Object o) {
        info = o;
    }    

    /**
     *
     * @return
     */
    public Object getInfo() {
        return info;
    }

    /**
     *
     * @param p
     */
    public void setNext(ObjectListNode p) {
        next = p;
    }

    /**
     *
     * @return
     */
    public ObjectListNode getNext() {
        return next;
    }
}
