package stack;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackUsingArr stack = new stackUsingArr();
		try {
			//stack.top =-1 ;
		//	stack.arrdata = null;
			int num = 10;
			
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
			stack.push(num++);
			stack.push(num++);
			stack.push(num++);
			stack.push(num++);
			
			//stack.top =-1 ;
			System.out.println(stack.getTop());
			//stack.arrdata = null;
			while(!stack.isEmpty()){
				stack.pop();
			}
			
		} catch
			(StackUnderFlowException e){
				System.out.println("Exception");
			}
		
	}

}
