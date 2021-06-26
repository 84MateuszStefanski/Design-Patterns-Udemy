package decorator.cellphonedecorator;

public class Motorola extends CellPhone {

    private String name = "Motorola ";

    @Override
    public void createCellphone() {
        System.out.println("I am putting together the " + name + " phone from the parts");
    }

    @Override
    public String getName() {
        return name;
    }

}
