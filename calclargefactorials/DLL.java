
package calclargefactorials;

/**
 * Double Linked Lists Class defines methods for list
 * @author Devon
 */
public class DLL {
    
    private DLLNode list;
    
    /**
     *
     */
    public DLL() {
        list = null;
    }

    /**
     *
     * @return
     */
    public DLLNode getFirstNode() {
        return list;
    }
    
    /**
     *
     * @return
     */
    public DLLNode getLastNode() {
    	if (list == null)
    		return null;
    	DLLNode p = list;
    	while (p.getNext() != null)
    		p = p.getNext();
    	return p;
    }
    
    /**
     *
     * @param o
     */
    public void addFirst(Object o) {
        DLLNode p = new DLLNode(o, list, null);
        list = p;
    }

    /**
     *
     * @param o
     */
    public void addLast(Object o) {
        DLLNode p = new DLLNode(o, null, getLastNode());        
        if (list == null)
            list = p;
        else {
            DLLNode q = list;
            while (q.getNext() != null)
                q = q.getNext();
            q.setNext(p);
        }
    }
    
    /**
     *
     * @return
     */
    public Object removeFirst() {
        if (list == null) {
            System.out.println("removeFirst Runtime Error: Illegal Operation");
            System.exit(1);
        }
        DLLNode p = list;
        list = p.getNext();
        list.getNext().setBack(list);
        return p.getInfo();
    }
    
    /**
     *
     * @return
     */
    public Object removeLast() {
        if (list == null) {
            System.out.println("removeLast Runtime Error: Illegal Operation");
            System.exit(1);
        }
        DLLNode p = list;
        DLLNode q = null;
        while (p.getNext() != null) {
            q = p;
            p = p.getNext();
        }
        if (q == null)
            list = null;
        else
            q.setNext(null);
        return p.getInfo();
    }

    /**
     *
     * @param p
     * @param o
     */
    public void insertAfter(DLLNode p, Object o) {
        if (p == null) {
            System.out.println("insertAfter Runtime Error: Illegal Operation");
            System.exit(1);
        }
        DLLNode q = new DLLNode(o, p.getNext(), p);
        p.getNext().setBack(q);
        p.setNext(q);
    }
    
    /**
     *
     * @param o
     */
    public void insert(Object o) {
        DLLNode p = list;
        DLLNode q = null;
        while (p != null && ((Comparable)o).compareTo(p.getInfo()) > 0) {
            q = p;
            p = p.getNext();
        }
        if (q == null)
            addFirst(o);
        else
            insertAfter(q, o);
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return list == null;
    }
    
    /**
     *
     */
    public void clear() {
        list = null;
    }

    /**
     *
     * @return
     */
    public int size() {
        int count = 0;
        DLLNode p = list;
        while (p != null) {
            ++count;
            p = p.getNext();
        }
        return count;
    }  
}
