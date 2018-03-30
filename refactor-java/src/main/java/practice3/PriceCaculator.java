package practice3;

import java.math.BigDecimal;

public class PriceCaculator {

    private Order order;

    PriceCaculator(Order order) {
        this.order = order;
    }

    public BigDecimal calculate() {
        BigDecimal subTotal = new BigDecimal(0);

        for (OrderLineItem lineItem : order.orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }

        for (BigDecimal discount : order.discounts) {
            subTotal = subTotal.subtract(discount);
        }

        BigDecimal tax = subTotal.multiply(this.order.tax);

        BigDecimal grandTotal = subTotal.add(tax);

        return grandTotal;
    }
}
