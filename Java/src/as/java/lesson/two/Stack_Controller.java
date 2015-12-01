package as.java.lesson.two;
import java.util.Scanner;
public class Stack_Controller {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int stackSize =0;
		System.out.println("Enter a stack size " );
		Scanner sc = new Scanner (System.in);
		stackSize=sc.nextInt();
		Stack linearStack = new Stack (stackSize);
		
		for(int i=0;i<stackSize;i++){
			linearStack.pushItem((long)(Math.random()*stackSize));
		}
		
		long[] x=linearStack.getArray();
		for(int i=0;i<stackSize;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		linearStack.pop();
		

		for(int i=0;i<=linearStack.getTop(); i++){
			System.out.print(x[i] +" ");
		}
		System.out.println();
		System.out.println("Enter a number to add to the stack ");
		linearStack.push(sc.nextInt());
		
		for(int i=0;i<=linearStack.getTop();i++){
			System.out.print(x[i] +" ");
		}
	
		}
		

	}


