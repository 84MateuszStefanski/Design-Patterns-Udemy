package state.bandit.states;

import state.bandit.onearmmachine.OneArmedBandit;

public class CoinInsertedState implements States {

    @Override
    public void insertCoin(OneArmedBandit bandit) {
        System.out.println("Coin is inserted ,pull the lever");
    }

    @Override
    public void pullTheLever(OneArmedBandit bandit) {
        System.out.println("The draw is in progress");
        bandit.states = new WinState();
    }

    @Override
    public void takeYourWinnings(OneArmedBandit bandit) {
        System.out.println("Pull the lever");
    }

    @Override
    public void writeActualState(OneArmedBandit bandit) {
        System.out.println("The actual status is : COIN INSERTED");
    }
}
