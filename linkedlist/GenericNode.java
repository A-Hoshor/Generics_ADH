package linkedlist;

/**
 * This class models a Node object which can accept multiple types of objects. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/ahoshor
 * Programming Project 1 Start Project
 * CS131ON
 * Changes: Added T to accept multiple types of objects.
 */
public class GenericNode<T> {
	
	//private String data;  //data that the object stores
	private GenericNode nextNode; //pointer to the nextNode that will be in LinkedList
	private T data; //changed from private String data to private T data
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 * Changes: Accepts multiple types of data (integers, strings, etc)
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param node1
	 */
	public void setNextNode(GenericNode node1)
	{
		this.nextNode=node1;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 * Changes: Changed to return GenericNode instead of Node.
	 */
	public GenericNode getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class
