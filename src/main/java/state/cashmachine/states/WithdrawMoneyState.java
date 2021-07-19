package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public class WithdrawMoneyState implements State {

    @Override
    public void insertCard(CashMachine cashMachine) {
        System.out.println("Select the amount to be withdrawn");
    }

    @Override
    public void enterPin(CashMachine cashMachine) {
        System.out.println("Select the amount to be withdrawn");
    }

    @Override
    public void withdrawMoney(CashMachine cashMachine) {
        System.out.println("Take your money");
        cashMachine.state = new TakeCardState();
    }

    @Override
    public void chechAccountBallance(CashMachine cashMachine) {
        System.out.println("Select the amount to be withdrawn");
    }

    @Override
    public void takeCard(CashMachine cashMachine) {
        System.out.println("Select the amount to be withdrawn");
    }
}
