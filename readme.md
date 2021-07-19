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
[Inorder Traversal](https://www.youtube.com/watch?v=nzmtCFNae9k)
```
 public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                results.add(root.val);
                root = root.right;
            }
        }
        return results;
    }
```
## Preorder traversal : 

***This can be preferred if you want to get root nodes.***
[Preorder Traversal](https://www.youtube.com/watch?v=elQcrJrfObg)
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
[Postorder Traversal](https://www.youtube.com/watch?v=qT65HltK2uE)
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
[Queue impl using stack](https://www.youtube.com/watch?v=3Et9MrMc02A)
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

## Queue implementation using LinkedList :

```
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	public void enqueue(int value) {
		if(head == null) {
			head = new Node(value);
			tail = head;
		} else {
			tail.next = new Node(value);
			tail = tail.next;
		}
	}

	public void dequeue() {
		if(head == null) {
			System.out.println("No element is present");
		} else {
			System.out.println(head.data);
			head = head.next;
		}
	}

```
## Queue implementation using ArrayList :
```
	private int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	
	public void enqueue(int value) {
		if(front == -1) {
			front++;
		}
		if(rear == queue.length - 1) {
			System.out.println("Queue is full");
		} else {
			queue[++rear] = value;
		}
	}

	public void dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println(queue[front]);
			front++;
		}
	}
```
## DFS
```
public static void main(String[] args) {
		List<String> result = new ArrayList<>();
		String digits = "223";
		String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		dfs(digits, map, result, new StringBuilder(), 0);
		result.stream().forEach(System.out::println);
	}

public static void dfs(String digits, String[] map, List<String> result, StringBuilder sb, int index) {
		if(index == digits.length()) {
			result.add(sb.toString());
			System.out.println("result :: " + result);
			return;
		}
		
		int digit = Character.getNumericValue(digits.charAt(index));
		System.out.println("digit :: " + digit);
		String letters = map[digit];
		System.out.println("letters :: " + letters);
		for(int i = 0; i < letters.length(); i++) {
			System.out.println("i :: " + i);
			char ch = letters.charAt(i);
			System.out.println("ch :: " + ch);
			sb.append(ch);
			dfs(digits, map, result, sb, index + 1);
			System.out.println("sb.length() :: " + sb.length());
			sb.deleteCharAt(sb.length() - 1);
		}
	}
```
