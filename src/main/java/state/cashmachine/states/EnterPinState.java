package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public class EnterPinState implements State {

    @Override
    public void insertCard(CashMachine cashMachine) {
        System.out.println("Enter the PIN code");
    }

    @Override
    public void enterPin(CashMachine cashMachine) {
        System.out.println("PIN Correct .Select the amount to be withdrawn ");
        cashMachine.state = new WithdrawMoneyState();
    }

    @Override
    public void withdrawMoney(CashMachine cashMachine) {
        System.out.println("Enter the PIN code");
    }

    @Override
    public void chechAccountBallance(CashMachine cashMachine) {
        System.out.println("Enter the PIN code");
    }

    @Override
    public void takeCard(CashMachine cashMachine) {
        System.out.println("Enter the PIN code");
    }
}
