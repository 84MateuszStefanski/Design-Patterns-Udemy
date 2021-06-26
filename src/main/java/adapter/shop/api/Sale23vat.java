package adapter.shop.api;

import adapter.shop.Product;

import java.math.BigDecimal;

public class Sale23vat implements Sale{

    private final BigDecimal NEW_TAX = new BigDecimal("0.23");
    private Product product;

    public Sale23vat(Product product) {
        this.product = product;
    }

    public BigDecimal countNewPrice(Product product) {
        BigDecimal newPrice = new BigDecimal("product.getPriceNet().add(product.getPriceNet().multiply(NEW_TAX))");
        return newPrice;

    }

    @Override
    public void saleProduct(Product product) {
        System.out.println("Sale product with new tax by price " + countNewPrice(product));
    }



}
