package decorator.cellphonedecorator;

public class WhiteEtuiDecorator extends CellPhoneDecorator {

    public WhiteEtuiDecorator(CellPhone decoratedCellPhone) {
        super(decoratedCellPhone);
    }

    @Override
    public void createCellphone() {
        cellPhone.createCellphone();
        addWhiteEtui();
    }

    private void addWhiteEtui() {
        System.out.println("I`m adding a white etui to the " + cellPhone.getName() + " cellphone ");
    }
}
