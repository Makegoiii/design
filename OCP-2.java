// Violating OCP: Modifying the class for new discount rules
class DiscountService {
    public double getDiscount(String customerType) {
        if (customerType.equals("Regular")) {
            return 10.0;
        } else if (customerType.equals("Premium")) {
            return 20.0;
        }
        return 0.0;
    }
}


// Following OCP: Extend behavior using polymorphism
interface Discount {
    double getDiscount();
}

class RegularCustomerDiscount implements Discount {
    public double getDiscount() {
        return 10.0;
    }
}

class PremiumCustomerDiscount implements Discount {
    public double getDiscount() {
        return 20.0;
    }
}
