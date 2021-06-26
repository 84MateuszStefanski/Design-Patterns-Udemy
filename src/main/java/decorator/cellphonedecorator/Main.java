package decorator.cellphonedecorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("New cellphone");

        CellPhone goldenNokia = new GoldEtuiDecorator(new Nokia());
        goldenNokia.createCellphone();

        System.out.println("\nNew cellphone: ");

        CellPhone whiteMotorolaWithExtras = new LedLightDecorator(new ColorfullStickersDecorator(new WhiteEtuiDecorator(new Motorola())));
        whiteMotorolaWithExtras.createCellphone();

        System.out.println("\nNew cellphone: ");

        CellPhone nextNokia = new ColorfullStickersDecorator(new LedLightDecorator(new Nokia()));
        nextNokia.createCellphone();

    }
}
