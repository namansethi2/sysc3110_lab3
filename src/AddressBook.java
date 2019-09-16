import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfoList;
	
	public static void main(String[] args) {
		BuddyInfo buddyInfo = new BuddyInfo();
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddyInfo);
		addressBook.removeBuddy(buddyInfo);

	}

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

