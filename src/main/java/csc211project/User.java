package csc211project;

//User adam = new...

public abstract class User {
	String name;
	String email;
	boolean isAdmin;

	// constr
	public User(String name, String email, boolean isAdmin) {
		this.name = name;
		this.email = email;
		this.isAdmin = isAdmin;
	}

	// METHODS
	abstract String printIsAdmin();
}

class Admin extends User {

	// var?

	public Admin(String name, String email) {
		super(name, email, true);
		// this.?mayb
	}

	@Override
	String printIsAdmin() {
		String printResult = (name + " is an ADMIN");
		return printResult;
	}

}

class Customer extends User {
	// var?

	public Customer(String name, String email) {
		super(name, email, false);
		// this?

	}

	@Override
	String printIsAdmin() {
		String result = (name + " is NOT admin");
		return result;
	}
}
