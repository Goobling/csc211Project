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
	// abstract List<Product> addProduct(Product cartProduct);
	// abstract void cartFilter()
	abstract List<Product> discount(List<Product> listProduct);

	abstract List<Product> pricing(List<Product> listProduct);
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
	/*
	 * @Override
	 * List<Product> addProduct(Product cartProduct) {
	 * // adds to list
	 * // userCart.add(cartProduct.product);
	 * 
	 * userProdCart.add(cartProduct);
	 * 
	 * // filter
	 * 
	 * List<Product> filteredProd = userProdCart.stream()
	 * .filter(Product -> "Electronics".equals(Product.type) ||
	 * "Clothing".equals(Product.type) ||
	 * "Grocery".equals(Product.type))
	 * .collect(Collectors.toList());
	 * 
	 * // String added = ("added " + cartProduct.product);
	 * String added = ("added " + cartProduct.product + "\ncart now: ");
	 * System.out.println(added);
	 * 
	 * filteredProd.forEach(System.out::println);
	 * 
	 * return filteredProd;
	 * }
	 */

	@Override
	List<Product> discount(List<Product> listProduct) {

		for (int i = 0; i < listProduct.size(); i++) {
			// System.out.println("10% discount applied to ");
			// System.out.println(listProduct.get(i));
			listProduct.forEach((n) -> n.discount());
			listProduct.forEach(product -> System.out.println(product.product));
		}
		System.out.println("10% discount applied to ");
		return listProduct;
	}

	@Override
	List<Product> pricing(List<Product> listProduct) {
		System.out.println("Prices for these items are");
		listProduct.forEach(product -> System.out.println(product.price));
		// for (int i =0; i < listProduct.size(); i++){

		// }
		return listProduct;
	}
}
