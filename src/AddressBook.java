import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfoList;
	
	

	public AddressBook() {
		buddyInfoList = new ArrayList<BuddyInfo>();
		System.out.println("ADDRESS");
	}



	private void addBuddy(BuddyInfo buddyInfo) {
		buddyInfoList.add(buddyInfo);
	}
	private void removeBuddy(BuddyInfo buddyInfo) {
		buddyInfoList.remove(buddyInfo);
	}
	
}

