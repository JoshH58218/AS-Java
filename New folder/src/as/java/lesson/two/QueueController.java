package as.java.lesson.two;
import java.util.Scanner;
public class QueueController {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		int queueSize=0;
		System.out.print("Enter a queue size ");;
		Scanner sc =new Scanner (System.in);
		queueSize=sc.nextInt();
		Queue linearQueue = new Queue(queueSize);
		
		for(int i=0;i<queueSize;i++){
			linearQueue.addItem((long)(Math.random()*queueSize));
		}
		 
		long[] x=linearQueue.getArray();
		for(int i=0;i<queueSize;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
		linearQueue.remove();
		
		for(int i=linearQueue.getfront();i<queueSize; i++){
			System.out.print(x[i] +" ");
		}
		
		System.out.println();
		linearQueue.insert(12);
		
		for(int i=linearQueue.getfront();i<queueSize; i++){
			System.out.print(x[i] + " ");
		}
	}

}
