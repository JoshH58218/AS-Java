package as.java.lesson.two;
import java.util.Scanner;
public class Linear_Search {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[50];
			for(int i=0;i<50;i++){
				a[i]=(int)(Math.random()*100);
			}
			System.out.println("What value are you looking for? ");
			int search =sc.nextInt();
			int found =0;
			for(int i=0; i<a.length;i++){
				if(a[i]==search){
					found++;	
				}
			}
			if(found!=0){
				System.out.println("Value found "+ found + " times.");
			}else{
				System.out.println("Value not found");
			}
				
	}

}
