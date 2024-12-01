package csc211project;

import java.util.*;

//Order adamsOrder = new...
public abstract class Order {
	User user;

	// constr
	public Order(User user) {
		this.user = user;
	}

	// METHODS
	abstract String addProduct(Product cartProduct);
}

// ...cart(adam, adamsCart)
class Cart extends Order {
	// cart list
	ArrayList<String> userCart = new ArrayList<>();

	// constr
	public Cart(User user, ArrayList<String> userCart) {
		super(user);
		this.userCart = userCart;
	}

	@Override
	String addProduct(Product cartProduct) {
		// adds to list
		userCart.add(cartProduct.product);

		// String added = ("added " + cartProduct.product);
		String added = ("added " + cartProduct.product + "\ncart now: " + userCart.toString());

		return added;
	}

}
