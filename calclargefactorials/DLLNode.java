
package calclargefactorials;

/**
 *
 * @author Devon
 */
public class DLLNode {
    private Object info;
	private DLLNode next, back;
	
    /**
     *
     */
    public DLLNode() {
		info = null;
		next = null;
		back = null;
	}
	
    /**
     *
     * @param o
     */
    public DLLNode(Object o) {
		info = o;
		next = null;
		back = null;
	}
	
    /**
     *
     * @param o
     * @param p
     * @param q
     */
    public DLLNode(Object o, DLLNode p, DLLNode q) {
		info = o;
		next = p;
		back = q;
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
    public void setNext(DLLNode p) {
		next = p;
	}
	
    /**
     *
     * @return
     */
    public DLLNode getNext() {
		return next;
	}
	
    /**
     *
     * @param p
     */
    public void setBack(DLLNode p) {
		back = p;
	}
	
    /**
     *
     * @return
     */
    public DLLNode getBack() {
		return back;
	}
	
	
}
