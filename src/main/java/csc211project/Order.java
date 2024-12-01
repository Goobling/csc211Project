package csc211project;

import java.util.*;
import java.util.stream.Collectors;

//Order adamsOrder = new...
public abstract class Order {
	User user;

	// constr
	public Order(User user) {
		this.user = user;
	}

	// METHODS
	abstract List<Product> addProduct(Product cartProduct);
	// abstract void cartFilter()
}

// ...cart(adam, adamsCart)
class Cart extends Order {
	// cart list
	ArrayList<Product> userProdCart = new ArrayList<>();
	// ArrayList<String> userCart = new ArrayList<>();

	// constr
	public Cart(User user, /* ArrayList<String> userCart, */ArrayList<Product> userProdCart) {
		super(user);
		// this.userCart = userCart;
		this.userProdCart = userProdCart;
	}

	@Override
	List<Product> addProduct(Product cartProduct) {
		// adds to list
		// userCart.add(cartProduct.product);
		userProdCart.add(cartProduct);

		// filter

		List<Product> filteredProd = userProdCart.stream()
				.filter(Product -> "Electronics".equals(Product.type) ||
						"Clothing".equals(Product.type) ||
						"Grocery".equals(Product.type))
				.collect(Collectors.toList());

		// String added = ("added " + cartProduct.product);
		String added = ("added " + cartProduct.product + "\ncart now: ");
		System.out.println(added);

		filteredProd.forEach(System.out::println);

		return filteredProd;
	}

}
