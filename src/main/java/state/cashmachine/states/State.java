package state.cashmachine.states;

import state.cashmachine.atm.CashMachine;

public interface State {

    void insertCard(CashMachine cashMachine);
    void enterPin(CashMachine cashMachine);
    void withdrawMoney(CashMachine cashMachine);
    void chechAccountBallance(CashMachine cashMachine);
    void takeCard(CashMachine cashMachine);

}
