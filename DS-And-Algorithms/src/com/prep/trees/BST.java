package com.prep.trees;

public class BST {
	
	public static void main(String[] args) {
			BST bst = new BST();
			
			bst.insert(54);
			bst.insert(34);
			bst.insert(22);
			bst.insert(67);
			bst.insert(76);
			bst.insert(453);
			bst.insert(77);
			bst.insert(98);
			bst.insert(23);
			bst.insert(1);
			
			//bst.printAll();
			//bst.printAll(bst.findByKey(453));
			System.out.println("Parent => " + bst.findParent(77));
	}
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public boolean insert(Integer item) {
		
		if(item == null) {
			return false;
		}
		
		Node n = new Node();
		n.data = item;
		n.lc = null;
		n.rc = null;
		
		if(root == null) {
			root = n;
			return true;
		}
		
		Node p = root;
		while(true) {
			if(item.compareTo(p.data)<0) {
				if(p.lc==null) {
					p.lc = n;
					return true;
				} else {
					p = p.lc;
					continue;
				}
			} else {
				if(p.rc==null) {
					p.rc = n;
					return true;
				} else {
					p = p.rc;
					continue;
				}
			}
		}
		
	}
	
	public Node findByKey(Integer key) {
		if(key == null) {
			return null;
		}
		
		Node c = root;
		while(c != null) {
			System.out.println("Current Node - " + c.data);
			if(key.compareTo(c.data) == 0) {
				break;
			} else if (key.compareTo(c.data)<0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		
		return c;
		
	}
	
	public Integer findParent(Integer key) {
		
		if (key == null) {
			return null;
		}
		
		Node p = root;
		Node c = root;
		
		while(c != null) {
			if(key.compareTo(c.data)==0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data)<0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		}
		
		if (c == null) {
			return null;
		}
		
		return p.data;
		
	}
	
	public void printAll() {
		printAll(root);
	}

	public void printAll(Node n) {
		if(n != null) {
			System.out.println(n.data + " ");
			printAll(n.lc);
			printAll(n.rc);
		}
	}
	
	private class Node{
		private Node lc;
		private Node rc;
		private Integer data;
	}

}
