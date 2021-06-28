package templatemethod.mttools;

public class WarehouseWorkDay extends WorkDayInMtTools {

    public void startStandardWorkDuties() {
        System.out.println("Zbieram towar zamówiony przez klientów  ");
    }

    public void continueOtherWorkDuties() {
        System.out.println("Przygotowuję wysyłki do odbioru przez kuriera ");
    }
}
