package templatemethod.workday;

public class MyMomsDay extends WorkDay {

    protected void work() {
        System.out.println("Code monkey get up, get coffee");
    }


    public int goToWork(TypeOfTransport transport) {
        switch(transport) {
            case CAR:
                System.out.println("Nie masz samochodu ");
                return 0;
            case BIKE:
                System.out.println("Nie masz roweru ");
                return 0;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }

}
