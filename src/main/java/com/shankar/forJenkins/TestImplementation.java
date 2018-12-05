package com.shankar.forJenkins;

public class TestImplementation implements TestInterface{

	public String getName() {
		// TODO Auto-generated method stub
		String name = "Test Name";
		return name;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		String address = "address";
		return address;
	}

	public String getContactDetails() {
		// TODO Auto-generated method stub
		String contactNumber = "1234567890";
		String contactEmail = "asdf@jkl.mn";
		return contactNumber+"|"+contactEmail;
	}

}
