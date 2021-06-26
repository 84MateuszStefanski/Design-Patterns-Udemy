package decorator.cellphonedecorator;

public class GoldEtuiDecorator extends CellPhoneDecorator {

    public GoldEtuiDecorator(CellPhone decoratedCellPhone) {
        super(decoratedCellPhone);
        addGoldEtui();
    }

    private void addGoldEtui() {
        System.out.println("I`m adding a golden etui to the " + cellPhone.getName() + " cellphone  ");
    }
}
