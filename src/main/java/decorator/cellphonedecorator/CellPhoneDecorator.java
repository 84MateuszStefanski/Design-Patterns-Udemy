package decorator.cellphonedecorator;

public abstract class CellPhoneDecorator extends CellPhone {
    CellPhone cellPhone;

    public CellPhoneDecorator(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public void createCellphone() {
        cellPhone.createCellphone();
    }
}
