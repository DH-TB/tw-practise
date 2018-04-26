package practice3;

import java.math.BigDecimal;

public class PriceCaculator {

    private Order order;

    PriceCaculator(Order order) {
        this.order = order;
    }

    public BigDecimal calculate() {
        BigDecimal initSubTotal = new BigDecimal(0);
        BigDecimal subTotal = subTotalOrderLineItem(initSubTotal);
        BigDecimal discountSubTotal = discountSubTotalOrderLineItem(subTotal);
        return getTax(discountSubTotal);
    }

    private BigDecimal subTotalOrderLineItem(BigDecimal subTotal) {
        for (OrderLineItem lineItem : order.orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }
        return subTotal;
    }

    private BigDecimal discountSubTotalOrderLineItem(BigDecimal subTotal) {
        for (BigDecimal discount : order.discounts) {
            subTotal = subTotal.subtract(discount);
        }
        return subTotal;
    }

    private BigDecimal getTax(BigDecimal subTotal){
        BigDecimal tax = subTotal.multiply(this.order.tax);
        return subTotal.add(tax);
    }
}
