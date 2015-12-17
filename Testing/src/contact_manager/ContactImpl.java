package contact_manager;

public class ContactImpl implements Contact {
	
	public int id;
	public String Name, Notes;
	
	public ContactImpl(int id,String Name, String Notes){
		
		this.id=id;
		this.Name=Name;
		this.Notes=Notes;
	}
	
	
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getNotes(){
		return Notes;
	}

}
