package strategy.saleprice.pricecalculator.pricestrategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println(" The lower price for signed up clinet is " + price/2);
        }else {
            System.out.println("User is not signed up for newsletter , you have to change pricing strategy ");
        }
    }
}
