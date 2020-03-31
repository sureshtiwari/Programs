package com.programs;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class MergeKsortedList {

	public static Node mergeLists(Node arrayofheads[], int numberoflist) {
		while (numberoflist != 0) {
			int start = 0, end = numberoflist;
			while (start < end) {
				arrayofheads[start] = mergeTwoList(arrayofheads[start], arrayofheads[end]);
				start++;
				end--;
				if (start >= end)
					numberoflist = end;
			}
		}
		return arrayofheads[0];
	}

	public static Node mergeTwoList(Node list1, Node list2) {
		Node mergedlist = null;
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;
		if (list1.data <= list2.data) {
			mergedlist = list1;
			mergedlist.next = mergeTwoList(list1.next, list2);
		} else {
			mergedlist = list2;
			mergedlist.next = mergeTwoList(list1, list2.next);
		}

		return mergedlist;
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String args[]) {
		int numberoflist = 4;
		Node arrayofheads[] = new Node[numberoflist];
		arrayofheads[0] = new Node(1);
		arrayofheads[0].next = new Node(2);
		arrayofheads[0].next.next = new Node(3);
		arrayofheads[1] = new Node(2);
		arrayofheads[1].next = new Node(3);
		arrayofheads[1].next.next = new Node(4);
		arrayofheads[2] = new Node(2);
		arrayofheads[2].next = new Node(6);
		arrayofheads[3] = new Node(0);
		arrayofheads[3].next = new Node(1);
		arrayofheads[3].next.next = new Node(2);
		arrayofheads[3].next.next.next = new Node(6);
		Node finalList = mergeLists(arrayofheads, numberoflist - 1);
		printList(finalList);
	}
}
