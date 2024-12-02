package csc211project;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		// run
		System.out.println("->");

		Scanner scnr = new Scanner(System.in);

		// welcome

		System.out.println("whats your name?");
		String userName = scnr.nextLine();
		System.out.println("hello " + userName + " whats your email ex:yourEmail@email.com");
		String email = scnr.nextLine();
		// var

		User nameUser = new Customer(userName, email);
		ArrayList<Product> userProducts = new ArrayList<>();
		Order userOrder = new Cart(nameUser, userProducts);

		Product phone = new Electronics("phone", 999.99f, "Apple Iphone");
		Product shirt = new Clothing("shirt", 700.00f, "Amari Shirt");
		Product pear = new Grocery("pear", 1.99f, "Good Brand Pear");
		Product laptop = new Electronics("laptop", 429.99f, "Microsoft Laptop");
		Product pants = new Clothing("pants", 39.99f, "Amari");
		Product ham = new Grocery("ham", 1.99f, "Good Brand Ham");

		userProducts.add(phone);
		userProducts.add(shirt);
		userProducts.add(pear);
		userProducts.add(laptop);
		userProducts.add(pants);
		userProducts.add(ham);

		// print PRODUCT LISt
		System.out.println("here is whats in store");
		System.out.println("we have electronics(1), clothing(2), and grocerys(3): example -> 1");
		int typeChoice = scnr.nextInt();

		// choosing tyope of product to filter
		if (typeChoice == 1) {

			List<Product> userFiltProds = userProducts.stream()
					.filter(Product -> "Electronics".equals(Product.type))// .filter(Product ->
												// "Clothing".equals(Product.type)).filter("Grocery".equals(Product.type))

					// .filter()
					.collect(Collectors.toList());
			// System.out.println(userFiltProds);
			userFiltProds.forEach(product -> System.out.println(product.product));
			System.out.println("we are running a discount today if you agree to terms...");
			System.out.println(" would you like a 10% on these items? ex: 1 | 2 ");
			// int discountChoice = scnr.nextInt();
			int discountChoice = scnr.nextInt();
			// discount cases
			if (discountChoice == (1)) {

				// System.out.println("applied discounts to chosen items");

				// assert 1;
				userOrder.discount(userFiltProds);
				// break;
			}
			if (discountChoice == (2)) {
				System.out.println("ok");

				// System.out.println("invalid choice");
				// break;
			}

		}

		if (typeChoice == 2) {
			List<Product> userFiltProds = userProducts.stream()
					.filter(Product -> "Clothing".equals(Product.type))// .filter(Product ->
												// "Clothing".equals(Product.type)).filter("Grocery".equals(Product.type))

					// .filter()
					.collect(Collectors.toList());
			System.out.println(userFiltProds);
			userFiltProds.forEach(product -> System.out.println(product.product));

			// discount
			System.out.println("we are running a discount today if you agree to terms...");
			System.out.println(" would you like a 10% on these items? ex: 1 | 2");
			int discountChoice = scnr.nextInt();
			// discount cases
			if (discountChoice == (1)) {

				// System.out.println("applied discounts to chosen items");

				// assert 1;
				userOrder.discount(userFiltProds);
				// break;
			}
			if (discountChoice == (2)) {
				System.out.println("ok");

				// System.out.println("invalid choice");
				// break;
			}

		}

		if (typeChoice == 3) {
			List<Product> userFiltProds = userProducts.stream()
					.filter(Product -> "Grocery".equals(Product.type))// .filter(Product ->
												// "Clothing".equals(Product.type)).filter("Grocery".equals(Product.type))

					// .filter()
					.collect(Collectors.toList());
			System.out.println(userFiltProds);
			userFiltProds.forEach(product -> System.out.println(product.product));
			System.out.println("we are running a discount today if you agree to terms...");
			System.out.print(" would you like a 10% on these items?\nex: 1 | 2\n");
			int discountChoice = scnr.nextInt();
			// discount cases
			if (discountChoice == (1)) {

				// System.out.println("applied discounts to chosen items");

				// assert 1;
				userOrder.discount(userFiltProds);
				// break;
			}
			if (discountChoice == (2)) {
				System.out.println("ok");

				// System.out.println("invalid choice");
				// break;
			}

		}

		// order
		// System.out.println("what items would you like to order from my store?");
		// String userChoice = scnr.nextLine();
		// process

		scnr.close();

	}
}
