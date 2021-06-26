package adapter.shop.api;

import adapter.shop.Product;

public class SwitchTax implements Sale{

    private final Product product;
    private Sale23vat sale23vat;


    public SwitchTax(Product product) {
        this.product = product;
        this.sale23vat = sale23vat;
    }

    @Override
    public void saleProduct(Product product) {
        saleProduct(product);
    }
}
