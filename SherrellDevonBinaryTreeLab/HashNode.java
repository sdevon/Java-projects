
package binarytree;

/**
 *
 * @author Devon
 */
public class HashNode {
    private String key;
	    private String data;
	    private boolean deleted;
	    
    /**
     *
     */
    public HashNode() {
	      this.key = null;
	      this.data = null;
	      this.deleted = false;
	    }

    /**
     *
     * @param inKey
     * @param inData
     */
    public HashNode(String inKey, String inData) {
	      this.key = inKey;
	      this.data = inData;
	      this.deleted = false;
	    }

    /**
     *
     * @return
     */
    public String getData() {
	      return data;
	    }

    /**
     *
     * @param data
     */
    public void setData(String data) {
	      this.data = data;
	    }

    /**
     *
     * @return
     */
    public Object getKey() {
	      return key;
	    }

    /**
     *
     * @param key
     */
    public void setKey(String key) {
	      this.key = key;
	    }

    /**
     *
     */
    public void setDeleted()
	    {
	       deleted = true;
	    }

    /**
     *
     * @return
     */
    public boolean isDeleted()
	    {
	       return deleted;
	    }
	    
	    
	    /* Equality can be based on key alone because there can't be
	     * 2 nodes with the same key in the table */

    /**
     *
     * @param obj
     * @return
     */
    
	    public boolean equals(Object obj) {
	      if (obj instanceof HashNode) {
	        HashNode node = (HashNode)obj;
	        return this.key.equals(node.getKey());
	      }
	      else {
	        return false;
	      }
	    }

    /**
     *
     * @return
     */
    public String toString() {
	      return "Key: ["+this.key+"] data: ["+this.data+"]";
	    }
}
