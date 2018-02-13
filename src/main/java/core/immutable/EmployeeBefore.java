package core.immutable;

public final class EmployeeBefore {
	
	private final int id;
	private Address address;

	public EmployeeBefore(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}
}
