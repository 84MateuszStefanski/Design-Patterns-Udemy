package state.cashmachine;

import state.cashmachine.atm.CashMachine;

public class Main {

    public static void main(String[] args) {


        CashMachine cashMachine = new CashMachine();

        cashMachine.state.insertCard(cashMachine);
        cashMachine.state.withdrawMoney(cashMachine);
        cashMachine.state.chechAccountBallance(cashMachine);
        cashMachine.state.enterPin(cashMachine);

    }
}
