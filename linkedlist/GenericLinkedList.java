package linkedlist;
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson/ahoshor
 * Programming Project 1 Start Project
 * CS131ON
 * Changes: Changed name and added parameterized T for multiple objects
 */
public class GenericLinkedList<T> {

	private GenericNode head; //node to represent the head of the list
	private GenericNode tail; //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 * Changes: changed name
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 * Changes: from Node to GenericNode for multiple obj types.
	 */
	public GenericNode getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param node1
	 * Changes: Changed name to GenericNode to accept multiple object inputs
	 */
	public void addNode(GenericNode node)
	{
		if (isEmpty() ) {
			head = node;
			tail=head;
			return;
		}
		
		tail.setNextNode(node);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode
}
