package csc211project;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

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

        // ASSERTTT
        assertEquals("phone", phone.product);

        assertEquals("Electronics", phone.type);
        assertEquals(999.99f, phone.price);
        assertEquals("apple", phone.getBrand());
    }
}
