package backendjavajunit.ej01;

public class DiscountCalculator {
    
    public static final double MAX_DISCOUNT = 0.3;
    
    public double calculateDiscount(Product product, double discount) {
        if (discount > MAX_DISCOUNT)
            discount = MAX_DISCOUNT;
        else if (discount < 0)
            discount = 0;
        
        return product.getPrice() * discount;
    }
    
}
