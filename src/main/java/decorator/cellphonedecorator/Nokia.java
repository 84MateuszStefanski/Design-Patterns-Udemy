package decorator.cellphonedecorator;

public class Nokia extends CellPhone {

    private String name = "Nokia ";

    @Override
    public void createCellphone() {
        System.out.println("I am putting together the "+ name + " phone from the parts");
    }

    @Override
    public String getName() {
        return name;
    }
}
