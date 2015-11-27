package as.java.lesson.two;

public class Queue {
	int maxSize;
	private int front;
	private int rear;
	private int nItems;
	private long[] queueArray;
	//-------------------------------------------------------
	
	public Queue(int s){
		maxSize=s;
		queueArray=new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	//--------------------------------------------------------
	
	public int getfront (){
		return front;
	}
	
	public void insert(long j){
		String result=rear==maxSize-1? "Queue full":addItem(j);
		System.out.println(result);
	}
	
	public String addItem(long j){
		queueArray[++rear]=j;
		nItems++;
		return "Item added";
	}
	
	public void remove(){
		String result=rear==-1?"Empty Queue": removeItem();
		System.out.println(result);
	}
	
	public String removeItem(){
		long removedItem=queueArray[front++];
		nItems--;
		return "Removed the item " + removedItem +" from the queue";
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems==maxSize;
	}
	public long peek(){
		return queueArray[front];
	}
	public long[] getArray(){
		return queueArray;
	}
	

}
