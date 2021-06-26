package adapter.shop.api;

import adapter.shop.Product;

public class SaleManager {

    private Product product;
    private Sale22vat sale;

    public SaleManager(Product product, Sale22vat sale) {
        this.product = product;
        this.sale = sale;
    }

     public void saleProductGross(Product product) {
        sale.saleProduct(product);
    }
}
