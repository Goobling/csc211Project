package csc211project;

import java.util.*;
import java.util.stream.Collectors;

//Order adamsOrder = new...
public abstract class Order {
	User user;
	float t;

	// constr
	public Order(User user) {
		this.user = user;
	}

	// METHODS
	// abstract List<Product> addProduct(Product cartProduct);
	// abstract void cartFilter()
	abstract float finish(List<Product> listProduct);

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
			listProduct.forEach((Product) -> Product.price = Product.price - Product.price * .10f);
			// listProduct.forEach((n) -> n.discount());

			// listProduct.forEach(product -> System.out.println(product.product));
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

	@Override
	float finish(List<Product> listProduct) {
		System.out.println("okay processing total now:");
		listProduct.forEach(
				product -> /* System.out.println(product.product) */ System.out.println(product.price));

		System.out.println("Total is:");

		listProduct.forEach((Product) -> t += (Product.price));
		// Product.price));
		// float t;
		/*
		 * for (int i = 0; i > listProduct.size(); i++) {
		 * int o = i + 1;
		 * // System.out.println(listProduct.get(i) + listProduct.get(i+1));
		 * Product p1 = listProduct.get(i);
		 * Product p2 = listProduct.get(o);
		 * 
		 * t += p1.price + p2.price;
		 * // return t;
		 * }
		 */
		// listProduct.forEach((Product) -> Product.price = Product.price -
		// Product.price * .10f);
		System.out.println(t);
		return t;
	}
}
