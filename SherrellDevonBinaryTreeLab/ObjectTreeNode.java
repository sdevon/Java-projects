/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Devon
 */
public class ObjectTreeNode implements ObjectTreeNodeInterface {
    private Object info;
    private ObjectTreeNode left;
    private ObjectTreeNode right;
    
    /**
     *
     */
    public ObjectTreeNode() {
        info = null;
        left = null;
        right = null;
    }
    
    /**
     *
     * @param o
     */
    public ObjectTreeNode (Object o) {
        info = o;
        left = null;
        right = null;
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
    public void setLeft(ObjectTreeNode p) {
        left = p;
    }
    
    /**
     *
     * @return
     */
    public ObjectTreeNode getLeft() {
        return left;
    }
    
    /**
     *
     * @param p
     */
    public void setRight(ObjectTreeNode p) {
        right = p;
    }
    
    /**
     *
     * @return
     */
    public ObjectTreeNode getRight() {
        return right;
    }
}
