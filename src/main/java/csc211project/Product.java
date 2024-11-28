package csc211project;

//Product phone = new ...
abstract class Product {
	String product;
	float price;
	String type;

	// constructor
	public Product(String product, float price, String type) {
		this.product = product;
		this.price = price;
		this.type = type;
	}

	// METHODS
	abstract double discount();

	abstract String getBrand();
}

// Product phone = new Electronic("phone,100,"apple")
class Electronics extends Product {
	String brand;

	// constr
	public Electronics(String name, float price, String brand) {
		super(name, price, "Electronics");
		this.brand = brand;
	}

	@Override
	double discount() {
		// 10%
		return price * 0.1;
	}

	@Override
	String getBrand() {
		return brand;
	}
}

// Product sweater = new Clothing("sweater",800,"amiri")
class Clothing extends Product {
	String brand;

	// constr
	public Clothing(String name, float price, String brand) {
		super(name, price, "Clothing");
		this.brand = brand;

	}

	@Override
	double discount() {
		return price * 0.1;
	}

	@Override
	String getBrand() {
		return brand;
	}
}

// Product apple = new ("apple",5,"fruit")
class Grocery extends Product {
	String what;

	// constr
	public Grocery(String name, float price, String what) {
		super(name, price, "Grocery");
		this.what = what;

	}

	@Override
	double discount() {
		return price * 0.1;
	}

	@Override
	String getBrand() {
		return what;
	}
}
