package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public class CheckBalanceState implements State {

    @Override
    public void insertCard(CashMachine cashMachine) {
        System.out.println("Checking account ballance");
    }

    @Override
    public void enterPin(CashMachine cashMachine) {
        System.out.println("Checking account ballance");
    }

    @Override
    public void withdrawMoney(CashMachine cashMachine) {
        System.out.println("Checking account ballance");
    }

    @Override
    public void chechAccountBallance(CashMachine cashMachine) {
        System.out.println("Your account ballance is ...");
    }

    @Override
    public void takeCard(CashMachine cashMachine) {
        System.out.println("Checking account ballance");
    }
}
