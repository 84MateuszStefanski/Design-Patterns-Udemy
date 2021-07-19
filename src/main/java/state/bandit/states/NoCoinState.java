package state.bandit.states;

import state.bandit.onearmmachine.OneArmedBandit;

public class NoCoinState implements States {

    @Override
    public void insertCoin(OneArmedBandit bandit) {
        System.out.println("Coin inserted");
        bandit.states = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(OneArmedBandit bandit) {
        System.out.println("Insert the coin");
    }

    @Override
    public void takeYourWinnings(OneArmedBandit bandit) {
        System.out.println("Insert the coin");
    }

    @Override
    public void writeActualState(OneArmedBandit bandit) {
        System.out.println("Actual state is : NO COIN INSERTED");
    }
}
