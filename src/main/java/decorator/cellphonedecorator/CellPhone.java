package decorator.cellphonedecorator;

public abstract class CellPhone {

    private String name;

    public void createCellphone() {
        System.out.println("I am putting together the phone from the parts");
    }

    public String getName() {
        return name;
    }
}
