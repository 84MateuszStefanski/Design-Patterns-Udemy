package adapter.shop;

import adapter.shop.api.Sale22vat;
import adapter.shop.api.Sale23vat;
import adapter.shop.api.SaleManager;
import adapter.shop.api.SwitchTax;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("SmartPhone","af546a",new BigDecimal("20"));
        Sale22vat sale22vat = new Sale22vat(product);
        Sale23vat sale23vat = new Sale23vat(product);

        SaleManager manager = new SaleManager(product,sale22vat);
        SwitchTax switchTax = new SwitchTax(product);

        sale22vat.saleProduct(product);

        manager.saleProductGross(product);


        sale23vat.saleProduct(product);





    }
}
