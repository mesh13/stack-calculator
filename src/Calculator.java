import java.util.Stack;

public class Calculator {
	Stack<Integer> stack = new Stack<>();
	public void loadConstant(int i) {
		stack.push(i);
	}
	public String toString() {
		if(stack.isEmpty())
		return "[].";
		
		return stack.toString()+'.';
	}
	
	public void add() {
		// T
		
	}
	public void subtract() {
		// TODO Auto-generated method stub
		
	}
	public void multiply() {
		// TODO Auto-generated method stub
		
	}
	public void divide() {
		// TODO Auto-generated method stub
		
	}
	public void total() {
		// TODO Auto-generated method stub
		
	}

}
