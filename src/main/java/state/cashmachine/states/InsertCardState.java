package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public class InsertCardState implements State {

    @Override
    public void insertCard(CashMachine cashMachine) {
        System.out.println("Card inserted , enter pin");
        cashMachine.state = new EnterPinState();
    }

    @Override
    public void enterPin(CashMachine cashMachine) {
        System.out.println("Insert the card");
    }

    @Override
    public void withdrawMoney(CashMachine cashMachine) {
        System.out.println("Insert the card");
    }

    @Override
    public void chechAccountBallance(CashMachine cashMachine) {
        System.out.println("Insert the card");
    }

    @Override
    public void takeCard(CashMachine cashMachine) {
        System.out.println("Insert the card");
    }
}
