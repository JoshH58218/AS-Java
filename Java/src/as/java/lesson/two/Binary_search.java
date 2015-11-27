package as.java.lesson.two;
import java.util.Scanner;
public class Binary_search {
	
		
	
	
	
	static int[] a={};
	static int x=0;
	
	@SuppressWarnings("resource")
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("How long do you want the array? ");
		int n = sc.nextInt();
		int [] input=new int[n];
		for (int i=0;i<n;i++){
			input [i]= (int)(Math.random()*100);
			
		}
		a=input;
		
		System.out.println("what number are you looking for? ");
		x= sc.nextInt();
		
		
		String result = binarySearch(a,x)?"value found":"Not found";
		System.out.print(result);;
	}
	
	public static boolean binarySearch(int[] array, int searchValue){
		int start=0, end= array.length-1;
		
		for(int i=0;i<array.length;i++){
			int middle =(end+start)/2;
			if(array[i]==searchValue){
				return true;
			}
			else if (array[middle] >searchValue){
				end=middle-1;
			}
			else{
				start=middle+1;
			}
		}
		return false;
	}
}
	
		
		
		
	
