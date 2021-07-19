package state.bandit;

import state.bandit.onearmmachine.OneArmedBandit;

public class Main {

    public static void main(String[] args) {

        OneArmedBandit bandit = new OneArmedBandit();

        bandit.insertCoin();
        bandit.writeActualState();
        bandit.pullTheLever();
        bandit.writeActualState();
        bandit.takeYourWinnings();
        bandit.writeActualState();

    }
}
