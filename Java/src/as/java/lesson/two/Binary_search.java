package as.java.lesson.two;

public class Binary_search {
	static int[] a={1,2,12,22,33,100};
	static int x=22;
	
	public static void main(String[]args){
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
	
		
		
		
	
