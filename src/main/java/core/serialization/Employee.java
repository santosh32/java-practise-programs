package core.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	//TODO add and remove
	private static final long serialVersionUID = 5462223600l;

	private String firstName;
	private String lastName;
	//TODO add and remove
	private String designation;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}