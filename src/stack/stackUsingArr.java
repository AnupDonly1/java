package stack;

public class stackUsingArr {
	int [] arrdata;
	private static int default_size = 10;
	int top;
	public stackUsingArr(){
		top = -1;
		arrdata = new int[default_size];
	}
	public stackUsingArr(int size){
		top =-1;
		arrdata = new int[size];
	}
	public void push(int data){
		if(isFull()){
			grow();
			//throw  new StackOverFlowException();
		}
			// overflow exception;
			top++;
			arrdata[top]= data;
		System.out.println(arrdata[top]+" pushed");
	}
	public int pop() throws StackUnderFlowException{
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		System.out.println(arrdata[top]+" poped");
		return arrdata[top--];
	} 
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}
	public void grow(){
		int [] temp = arrdata;
		arrdata = new int[temp.length*2];
		for(int i=0; i<temp.length; i++){
			arrdata[i]= temp[i];
		}
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size() == top;
	}
	public int size(){
		return top+1;
	}
	public int getTop(){
		return arrdata[top];
	}

}
