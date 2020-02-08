
package binarytree;

/**
 *
 * @author Devon
 */
public interface TreeComparable {

    /**
     *
     * @param o
     * @return
     */
    public int compareTo(Object o);

    /**
     *
     * @param o
     */
    public void operate(Object o);

    /**
     *
     */
    public void visit();
}