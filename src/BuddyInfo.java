
public class BuddyInfo {

	private long phoneNumber;
	private String name;
	private String address;
	


	public BuddyInfo() {
		phoneNumber = 000000000;
		name = "John Doe";
		address = "123 anywhere street";
	}

	public static void main(String[] args) {
		BuddyInfo buddyInfo = new BuddyInfo();
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddyInfo);
		addressBook.removeBuddy(buddyInfo);

	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
