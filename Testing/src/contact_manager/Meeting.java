package contact_manager;

import java.util.Calendar;
import java.util.Set;

public interface Meeting {
	
	public int getid();
	public Calendar getDate();
	public Set<Contact> getContacts();
	
	
	
	

}
