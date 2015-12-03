package as.java.lesson.two;

public class Linked_List {
	private Link first;
	
	public Linked_List(){
		first=null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void insertFirst(String Name,int age, String favSubject, boolean inTeam){
		
		Link link=new Link(Name,age,favSubject,inTeam);
		
		if(first!=null){
			link.setnextLink(first);
			first=link;
		}
		else{
			first=link;
		}
	}
	
	public Link deleteFirst(){
		
		Link deletedLink=first;
		first=first.getnextLink();
		return deletedLink;
	}
	
	public void displayList(){
		
		System.out.print("List (first-->last): ");
		Link current=first;
		
		while(current!=null){
			current.displayLink();
			current=current.getnextLink();
		}
		System.out.println(" ");
	}
	

}
