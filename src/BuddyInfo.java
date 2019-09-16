
public class BuddyInfo {

	private long phoneNumber;
	private String name;
	private String address;
	


	public static void main(String[] args) {
		BuddyInfo buddyInfo = new BuddyInfo();
		buddyInfo.setName("Homer");
		System.out.println("Hello " + buddyInfo.getName());
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
