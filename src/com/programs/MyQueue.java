package com.programs;

import java.util.Stack;

class MyQueue {
	public Stack<Integer> stack1 = new Stack<Integer>();
    public Stack<Integer> stack2 = new Stack<Integer>();

	    /** Initialize your data structure here. */
	    public MyQueue() {
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        stack1.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	int element;
	        while(stack1.size()!=1)
	        {
	        	element = stack1.pop();
	        	stack2.push(element);
	        }
	        element = stack1.pop();
	        while(!stack2.isEmpty())
	        	stack1.push(stack2.pop());
	        
	        return element;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	int element = 0;
	        while(!stack1.isEmpty())
	        {
	        	element = stack1.pop();
	        	stack2.push(element);
	        }
	        while(!stack2.isEmpty())
	        	stack1.push(stack2.pop());
	        
	        return element;
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return stack1.isEmpty();
	    }
	}