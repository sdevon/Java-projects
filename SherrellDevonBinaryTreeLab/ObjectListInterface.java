package binarytree;

/**
 *
 * @author Devon
 */
public interface ObjectListInterface {

    /**
     *
     * @return
     */
    public ObjectListNode getFirstNode();

    /**
     *
     * @return
     */
    public ObjectListNode getLastNode();

    /**
     *
     * @return
     */
    public Object getFirst();

    /**
     *
     * @return
     */
    public Object getLast();

    /**
     *
     * @param o
     */
    public void addFirst(Object o);

    /**
     *
     * @param p
     */
    public void addFirst(ObjectListNode p);

    /**
     *
     * @param o
     */
    public void addLast(Object o);

    /**
     *
     * @param p
     */
    public void addLast(ObjectListNode p);

    /**
     *
     * @return
     */
    public Object removeFirst();

    /**
     *
     * @return
     */
    public Object removeLast();

    /**
     *
     * @param p
     * @param o
     */
    public void insertAfter (ObjectListNode p, Object o);

    /**
     *
     * @param p
     * @param q
     */
    public void insertAfter(ObjectListNode p, ObjectListNode q);

    /**
     *
     * @param p
     * @return
     */
    public Object deleteAfter(ObjectListNode p);

    /**
     *
     * @param o
     */
    public void insert(Object o);

    /**
     *
     * @param r
     */
    public void insert(ObjectListNode r);

    /**
     *
     * @param o
     * @return
     */
    public Object remove(Object o);

    /**
     *
     * @param o
     * @return
     */
    public boolean contains(Object o);

    /**
     *
     * @param o
     * @return
     */
    public ObjectListNode select(Object o);

    /**
     *
     * @return
     */
    public boolean isEmpty();

    /**
     *
     */
    public void clear();

    /**
     *
     * @return
     */
    public int size();

    /**
     *
     * @return
     */
    public ObjectList copyList();

    /**
     *
     */
    public void reverse();
}
