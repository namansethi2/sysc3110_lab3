import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfoList;
	
	

	public AddressBook() {
		buddyInfoList = new ArrayList<BuddyInfo>();
		System.out.println("ADDRESS USED");
	}



	public void addBuddy(BuddyInfo buddyInfo) {
		buddyInfoList.add(buddyInfo);
	}
	public void removeBuddy(BuddyInfo buddyInfo) {
		buddyInfoList.remove(buddyInfo);
	}
	
}

