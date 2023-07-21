package backendjavajunit.ej01;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    static Product product;
    static DiscountCalculator discountCalculator;
    
    @BeforeClass
    public static void setUpClass() {
        discountCalculator = new DiscountCalculator();
        product = new Product(100);
    }

    @Test
    public void testCalculateZeroDiscount() {
        double result = discountCalculator.calculateDiscount(product, 0);
        assertEquals(0, result, 0);
    }
    
    @Test
    public void testCalculateDiscount() {
        double result = discountCalculator.calculateDiscount(product, 0.16);
        assertEquals(16.0, result, 0);
    }
    
    @Test
    public void testCalculateMaxDiscount() {
        double result = discountCalculator.calculateDiscount(product, 0.4);
        assertEquals(30, result, 0);
    }
    
    @Test
    public void testCalculateMinDiscount() {
        double result = discountCalculator.calculateDiscount(product, -0.1);
        assertEquals(0, result, 0);
    }
    
}
