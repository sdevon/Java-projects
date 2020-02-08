
package binarytree;

/**
 *
 * @author Devon
 */
public interface ObjectTreeNodeInterface {
    //public int compareTo(Object o);

    /**
     *
     * @param o
     */
         void setInfo(Object o);

    /**
     *
     * @return
     */
    Object getInfo();

    /**
     *
     * @param p
     */
    void setLeft(ObjectTreeNode p);

    /**
     *
     * @return
     */
    ObjectTreeNode getLeft();

    /**
     *
     * @param p
     */
    void setRight(ObjectTreeNode p);

    /**
     *
     * @return
     */
    ObjectTreeNode getRight();
}
