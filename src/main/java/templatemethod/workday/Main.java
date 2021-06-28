package templatemethod.workday;

public class Main {

    public static void main(String[] args) {
        WorkDay myDay = new MyDay();

        myDay.everyDayIsExaclyTheSame(TypeOfTransport.TRAM);

        WorkDay momsDay = new MyMomsDay();

        momsDay.everyDayIsExaclyTheSame(TypeOfTransport.CAR);
    }
}
