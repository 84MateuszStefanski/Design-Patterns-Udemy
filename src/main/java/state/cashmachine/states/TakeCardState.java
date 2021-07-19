package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public class TakeCardState implements State {

    @Override
    public void insertCard(CashMachine cashMachine) {
        System.out.println("Take your card");
    }

    @Override
    public void enterPin(CashMachine cashMachine) {
        System.out.println("Take your card");
    }

    @Override
    public void withdrawMoney(CashMachine cashMachine) {
        System.out.println("Take your card");
    }

    @Override
    public void chechAccountBallance(CashMachine cashMachine) {
        System.out.println("Take your card");
    }

    @Override
    public void takeCard(CashMachine cashMachine) {
        System.out.println("Thank you Goodbye");
        cashMachine.state = new InsertCardState();
    }
}
