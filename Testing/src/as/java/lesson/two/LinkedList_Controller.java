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
			if(command.equals("Add1")){
				studentDataList.insertFirst(sc.next(), sc.nextInt(), sc.next(), sc.nextBoolean());
				studentDataList.displayList();
			}else if(command.equals("delete1")){
				studentDataList.deleteFirst();
				
			}else if(command.equals("Display")){
				studentDataList.displayList();
			}else if(command.equals("Number")){
				
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
