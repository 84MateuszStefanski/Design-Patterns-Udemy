package decorator.cellphonedecorator;

public class ColorfullStickersDecorator extends CellPhoneDecorator {

    public ColorfullStickersDecorator(CellPhone decoratedCellPhone) {
        super(decoratedCellPhone);
    }

    @Override
    public void createCellphone() {
        cellPhone.createCellphone();
        addStickers();
    }

    private void addStickers() {
        System.out.println("I`m adding colorfull stickers to the " + cellPhone.getName() + " cellphone ");
    }
}
