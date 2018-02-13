package core.immutable;

public final class EmployeeAfter {
	
	private final int id;
	private final Address address;

	public EmployeeAfter(int id, Address address) {
		this.id = id;
		this.address = new Address(); // defensive copy
		this.address.setStreet(address.getStreet());
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		Address addr = new Address(); // must copy here too
		addr.setStreet(address.getStreet());
		return addr;
	}
}