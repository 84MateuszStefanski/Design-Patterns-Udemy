package state.cashmachine.atm;

import state.cashmachine.states.InsertCardState;
import state.cashmachine.states.State;

public class CashMachine {

    public State state;

    public CashMachine() {
        this.state = new InsertCardState();
    }

    void insertCard() {
        state.insertCard(this);
    }

    void enterPin() {
        state.enterPin(this);
    }

    void withdrawMoney() {
        state.withdrawMoney(this);
    }

    void chechAccountBallance() {
        state.chechAccountBallance(this);
    }

    void takeCard() {
        state.takeCard(this);
    }
}
