package as.java.lesson.two;
import java.util.Scanner;
public class LinkedList_Controller {
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		Linked_List studentDataList=new Linked_List();
		
		String command;
		for(;;){
			System.out.println("Input a command (Add at front, Delete at front, Display list, Number of links, or End");
			command=sc.next();
			String nextName, nextSubject,nextTeam;
			int nextAge;
			boolean NT = false;
			if(command.equals("1")){
				System.out.println("Input Name: ");
				nextName=sc.next();
				System.out.println("Input Age: ");
				nextAge=sc.nextInt();
				System.out.println("Input Favourite Subject: ");
				nextSubject=sc.next();
				System.out.println("Are they in a sports team? ");
				nextTeam=sc.next();
				if(nextTeam==("Yes")||nextTeam.equals("yes")){
					NT=true;
				}else if(nextTeam==("No")||nextTeam.equals("no")){
					NT=false;
				}
				studentDataList.insertFirst(nextName, nextAge, nextSubject, NT);
				studentDataList.displayList();
			}else if(command.equals("delete1")){
				studentDataList.deleteFirst();
				
			}else if(command.equals("Display")){
				studentDataList.displayList();
			}else if(command.equals("Number")){
				int count=studentDataList.linkCount();
				System.out.println(count);
			}else if(command.equals("End")){
				break;
			}else{
				System.out.println("Invalid command");
				System.out.println();
			}
			
	
		
		}
		sc.close();
	}
	
	

}
