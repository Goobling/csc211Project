package csc211project;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		// run
		System.out.println("->");

		Scanner scnr = new Scanner(System.in);

		// welcome

		System.out.print("whats your name?");
		String userName = scnr.nextLine();
		System.out.print("hello " + userName + " whats your email ex:yourEmail@email.com");
		String email = scnr.nextLine();
		// var

		User nameUser = new Customer(userName, email);

		Product phone = new Electronics("phone", 999.99f, "Apple Iphone");
		Product shirt = new Clothing("shirt", 700.00f, "Amari Shirt");
		Product pear = new Grocery("pear", 1.99f, "Good Brand Pear");
		Product laptop = new Electronics("laptop", 429.99f, "Microsoft Laptop");
		Product pants = new Clothing("pants", 39.99f, "Amari");
		Product ham = new Grocery("ham", 1.99f, "Good Brand Ham");
		ArrayList<Product> userProducts = new ArrayList<>();
		userProducts.add(phone);
		userProducts.add(shirt);
		userProducts.add(pear);
		userProducts.add(laptop);
		userProducts.add(pants);
		userProducts.add(ham);

		// print PRODUCT LISt
		System.out.println("here is whats in store");
		List<Product> userFiltProds = userProducts.stream()
				.filter(Product -> "Electronics".equals(Product.type) ||
						"Clothing".equals(Product.type) ||
						"Grocery".equals(Product.type))
				.collect(Collectors.toList());
		userFiltProds.forEach(System.out::println);

		// order
		System.out.println("what items would you like to order from my store?");
		String userChoice = scnr.nextLine();
		Order userOrder = new Cart(nameUser, userProducts);
		// process

	}
}
