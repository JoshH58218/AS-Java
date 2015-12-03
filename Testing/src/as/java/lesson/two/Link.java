package as.java.lesson.two;

public class Link {
	private String Name;
	private int age;
	private String favSubject="Maths";
	private boolean inTeam=false;
	
	private Link nextLink=null;
	
	public Link(String Name, int age, String favSubject, boolean inTeam){
		this.Name=Name;
		this.age=age;
		this.favSubject=favSubject;
		this.inTeam=inTeam;
	}
	
	public String getName(){
		return Name;
	}
	
	public void setName(String Name){
		this.Name=Name;
	}
	
	public int getage(){
		return age;
	}
	
	public void setage(int age){
		this.age=age;
	}
	
	public String getfavSubject(){
		return favSubject;
	}
	
	public void setfavSubject(String favSubject){
		this.favSubject=favSubject;
	}
	
	public boolean getinTeam(){
		return inTeam;
	}

	public void setinTeam(boolean inTeam){
		this.inTeam=inTeam;
	}
	
	public Link getnextLink(){
		return nextLink;
	}
	
	public void setnextLink(Link nextLink){

		this.nextLink=nextLink;
	}
	
	public void displayLink(){
		System.out.println("********");
		
		System.out.println(" ");
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getage());
		System.out.println("Subject: "+this.getfavSubject());
		System.out.println("In a team? "+this.getinTeam());
		
		System.out.println(" ");
		System.out.println("********");
		
	}
}
