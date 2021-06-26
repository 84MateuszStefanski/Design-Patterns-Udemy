package adapter.shop.api;

import adapter.shop.Product;

import java.math.BigDecimal;

public class Sale22vat implements Sale{

    private final BigDecimal TAX = new BigDecimal("0.22");
    private Product product;

    public Sale22vat(Product product) {
        this.product = product;
    }

    @Override
    public void saleProduct(Product product) {
        System.out.println("Sale product by price " + product.getPriceNet().add(product.getPriceNet().multiply(TAX)));
    }
}
