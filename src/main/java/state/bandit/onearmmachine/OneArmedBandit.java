package state.bandit.onearmmachine;

import state.bandit.states.NoCoinState;
import state.bandit.states.States;

public class OneArmedBandit {


    public States states;

    public OneArmedBandit() {
        this.states = new NoCoinState();
    }

    public void insertCoin() {
        states.insertCoin(this);
    }

    public void pullTheLever() {
        states.pullTheLever(this);
    }

    public void takeYourWinnings() {
        states.takeYourWinnings(this);
    }

    public void writeActualState() {
        states.writeActualState(this);
    }



}
