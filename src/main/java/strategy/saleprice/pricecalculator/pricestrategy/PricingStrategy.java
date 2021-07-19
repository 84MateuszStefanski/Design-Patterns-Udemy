package strategy.saleprice.pricecalculator.pricestrategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
