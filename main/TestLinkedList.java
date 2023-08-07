package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		GenericLinkedList aList = new GenericLinkedList();
		
		GenericNode node1 = new GenericNode();
		node1.setData(12);
		aList.addNode(node1);
		GenericNode node2 = new GenericNode();
		node2.setData(256);
		aList.addNode(node2);

		GenericNode tempnode1=aList.getList();
		do 
		{
			System.out.println(tempnode1.getData());
			tempnode1=tempnode1.getNextNode();
		} while (tempnode1!=null);
		
		GenericLinkedList doubleList = new GenericLinkedList();
		
		GenericNode noded = new GenericNode();
		noded.setData(15.7);
		doubleList.addNode(noded);
		GenericNode nodef = new GenericNode();
		nodef.setData(256.90);
		doubleList.addNode(nodef);

		GenericNode tempnode2=doubleList.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2=tempnode2.getNextNode();
		} while (tempnode2!=null);
		
		GenericLinkedList stringList = new GenericLinkedList();
		
		GenericNode nodes = new GenericNode();
		nodes.setData("Another");
		stringList.addNode(nodes);
		GenericNode nodee = new GenericNode();
		nodee.setData("List");
		stringList.addNode(nodee);
		GenericNode nodet = new GenericNode();
		nodet.setData("Test");
		stringList.addNode(nodet);

		GenericNode tempnode3=stringList.getList();
		do 
		{
			System.out.println(tempnode3.getData());
			tempnode3=tempnode3.getNextNode();
		} while (tempnode3!=null);
		
		
	}//end main

}//end class