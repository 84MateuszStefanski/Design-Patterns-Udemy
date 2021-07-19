package state.bandit.states;

import state.bandit.onearmmachine.OneArmedBandit;

public class WinState implements States{

    @Override
    public void insertCoin(OneArmedBandit bandit) {
        System.out.println("Please take your winnings or end the game");
    }

    @Override
    public void pullTheLever(OneArmedBandit bandit) {
        System.out.println("Please take your winnings or end the game");
    }

    @Override
    public void takeYourWinnings(OneArmedBandit bandit) {
        System.out.println("Winnings taked");
        bandit.states = new NoCoinState();
    }

    @Override
    public void writeActualState(OneArmedBandit bandit) {
        System.out.println("You won ");

    }
}
