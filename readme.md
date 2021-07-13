# DSA

###### Logarithm
###### Tree and graph traversal
###### Binary search tree
###### sliding window
###### recursion
###### inverting binary tree and reversing the linkedList
###### sufix trees (to check first string characters are available in 2nd string)
###### binary heaps, min and max heaps (finding smaller/ larger value from a group of values)
###### dynamic programming
###### sorting (quick, merge sort)


## Inorder Traversal :
***It will first check left. If (left node is present) then
   it will add to the stack and it will traverse left.
   Otherwise it will pop and print value from stack and assign root to right
}***
```
public void printInorder(Node root) {
  Stack<Node> stack = new Stack<>();
	While(stack != null || root != null) {
	    if(root != null) {
		stack.push(root);
		root = root.left;
	    } else {
		root = stack.pop();
		System.out.println(root.data);
		root = root.right;
	    }
	}
}
```
## Preorder traversal : 

***This can be preferred if you want to get root nodes.***
```
public void printPreorder(Node root) {
  Stack<Node> stack = new Stack<>();
  stack.push(root);
	While(stack != null) {
		root = stack.pop();
		System.out.println(root.data);
		if(root.right != null) {	
			stack.push(root.right);
		} 
		if(root.left) {
			stack.push(root.left);
		}	
	}
}
```
## Postorder traversal : 

***This can be preferred if you want to get leaf nodes.***
```
public void printPostorder(Node root) {
  Stack<Node> stack = new Stack<>();
  Node current = root;
	While(stack != null || current != null) {
		if(current != null) {
			stack.push(current);
		current = current.left;
		} else {
			Node temp = stack.peek().right();
			if(temp == null) {
				temp = stack.pop();
				System.out.println(temp.data);
				while(stack != null && temp == stack.peek().right()) {
					temp = stack.pop();
					System.out.println(temp.data);
				}
			} else {
				current = temp;
			}
		}
	}
}
```
## Queue implementation using stack :
***I will have 2 stack. Input and output stack.***
```
Stack<Integer> input = new Stack<>();
Stack<Integer> output = new Stack<>();

public void push(int value) {
   input.push(value);
}

public int pop() {
     if(!output.isEmpty) {
	return output.pop();
     } else {
	while(!input.isEmpty()) {
	   output.push(input.pop());
	}
	return output.pop();
     }
}

public int top() {
     if(!output.isEmpty) {
	return output.peek();
     } else {
	while(!input.isEmpty()) {
	   output.push(input.pop());
	}
	return output.peek();
     }
}
```
