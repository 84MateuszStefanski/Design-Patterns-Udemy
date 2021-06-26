package builder;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").price(50).build();

        leg.setDelayed(true);

        System.out.println(leg);
        leg.setPrice(120);
        leg.setDelayed(false);
        System.out.println();
        System.out.println(leg);
    }
}
