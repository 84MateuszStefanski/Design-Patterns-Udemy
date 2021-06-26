package decorator.cellphonedecorator;

public class LedLightDecorator extends CellPhoneDecorator {

    public LedLightDecorator(CellPhone decoratedCellPhone) {
        super(decoratedCellPhone);
    }

    @Override
    public void createCellphone() {
        cellPhone.createCellphone();
        addLedLight();
    }

    private void addLedLight() {
        System.out.println("I`m adding led light to the " + cellPhone.getName() + " cellphone");
    }
}

