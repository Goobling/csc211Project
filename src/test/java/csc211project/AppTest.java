package csc211project;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testElectronicInit() {
        Product phone = new Electronics("phone", 999.99f, "apple");

        // Produict test
        assertEquals("phone", phone.product);

        assertEquals("Electronics", phone.type);
        assertEquals(999.99f, phone.price);
        assertEquals("apple", phone.getBrand());

        // User test

        User adam = new Admin("adam", "adamsEmail@email.com");
        assertEquals("adam", adam.name);
        assertEquals("adamsEmail@email.com", adam.email);
        assertEquals("adam is an ADMIN", adam.printIsAdmin());

    }

    @Test
    public void testOrderInit() {
        User adam = new Customer("adam", "adamEmail@email.com");
        Product phone = new Electronics("phone", 999.99f, "apple");
        Product shirt = new Clothing("blackShirt", 700.00f, "amari");
        Product pear = new Grocery("pear", 1.99f, "fruit");
        // ArrayList<String> adamCart = new ArrayList<>();
        ArrayList<Product> adamProducts = new ArrayList<>();

        Order adamsOrder = new Cart(adam, adamProducts);

        /* assertEquals("[" + phone + "]", */
        adamsOrder.addProduct(phone);

        /* assertEquals(phone, */
        adamsOrder.addProduct(pear);

        assertEquals(adamProducts, adamsOrder.addProduct(shirt));
    }
}
