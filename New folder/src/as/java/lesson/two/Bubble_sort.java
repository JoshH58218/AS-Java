package as.java.lesson.two;

import java.util.Scanner;

public class Bubble_sort {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to sort? ");
		int n = sc.nextInt();
		long start_time=System.currentTimeMillis();
		int[] a = new int[n];
	
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random()*100);
		}
		for(int j=0;j<a.length;++j){
			System.out.print(a[j]+" ");
		}
		int temp = 0;
		
		for (int i = 0; i < a.length - 1; ++i) {
			
			for (int j = 0; j < a.length - (i+1); ++j) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				
				}
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		
		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		long end_time=System.currentTimeMillis();
		long time = end_time-start_time;
		System.out.println("Time elapsed = " + time);
	}

}
