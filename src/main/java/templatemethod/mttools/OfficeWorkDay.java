package templatemethod.mttools;

public class OfficeWorkDay extends WorkDayInMtTools {

    public void startStandardWorkDuties() {
        System.out.println("Przyjmuję zamówienia od klientów i przekazuję do realizacji na magazyn ");
    }

    public void continueOtherWorkDuties() {
        System.out.println("Odpisuję na maile od klientów oraz rozpatruję zwroty i reklamacje ");
    }
}
