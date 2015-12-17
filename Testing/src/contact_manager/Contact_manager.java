package contact_manager;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

public interface Contact_manager {
	
	int addFutureMeeting(Set<Contact> contacts, Calendar date);
	
	PastMeeting getPastMeetig(int id);
	
	FutureMeeting getFutureMeeting(int id);
	
	Meeting getMeeting(int id);
	
	List<Meeting> getFutureMeetingList(Contact contact);
	
	List<Meeting> getFutureMeetingList(Calendar date);
	
	List<PastMeeting> getPastMeetingList(Contact contact);
	
	void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text);
	
	void addMeetingNotes(int id, String text);
	
	void addNewContact(String name, String notes);
	
	Set<Contact> getContacts(int... ids);
	
	Set<Contact> getContacts(String name);
	
	void flush();
	
	

}
