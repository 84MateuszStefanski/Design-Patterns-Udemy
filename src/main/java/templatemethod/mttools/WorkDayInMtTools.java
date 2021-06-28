package templatemethod.mttools;

public abstract class WorkDayInMtTools {

    public final void organizationOfTheWorkingDay() {
        comeToWork();
        drinkCoffee();
        startStandardWorkDuties();
        takeAbreak();
        continueOtherWorkDuties();
        finishWork();
    }

    private void comeToWork() {
        System.out.println("Przychodzę do pracy ");
    }

    private void drinkCoffee() {
        System.out.println("Piję poranną kawę ");
    }

    protected abstract void startStandardWorkDuties();

    private void takeAbreak() {
        System.out.println("Robię przerwę obiadową ");
    }

    protected abstract void continueOtherWorkDuties();

    private void finishWork() {
        System.out.println("Kończę pracę ");
    }
}
