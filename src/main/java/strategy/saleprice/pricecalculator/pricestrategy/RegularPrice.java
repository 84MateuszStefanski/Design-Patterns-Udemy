package strategy.saleprice.pricecalculator.pricestrategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Regular price is : " + price);
        }else {
            System.out.println("The user is signed up for newsletter , you have to change pricing strategy ");
        }
    }
}
