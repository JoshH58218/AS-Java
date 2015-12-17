package contact_manager;

import java.util.Calendar;
import java.util.Set;

public class MeetingImpl implements Meeting{
	
	public int id;
	public Set<Contact> Contacts;
	public Calendar Date;
	
	public MeetingImpl( int id, Set<Contact> Contacts, Calendar Date){
		this.id=id;
		this.Contacts=Contacts;
		this.Date=Date;
	}
	
	public int getid(){
		return id;
	}
	public Calendar getDate(){
		return Date;
	}
	public Set<Contact> getContacts(){
		return Contacts;
	}

}
