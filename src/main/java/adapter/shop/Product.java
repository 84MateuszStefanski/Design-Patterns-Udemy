package adapter.shop;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String catalogNumber;
    private BigDecimal priceNet;

    public Product(String name, String catalogNumber, BigDecimal priceNet) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.priceNet = priceNet;
    }

    public String getName() {
        return name;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public BigDecimal getPriceNet() {
        return priceNet;
    }
}
