package state.bandit.states;

import state.bandit.onearmmachine.OneArmedBandit;

public interface States {
    void insertCoin(OneArmedBandit bandit);
    void pullTheLever(OneArmedBandit bandit);
    void takeYourWinnings(OneArmedBandit bandit);
    void writeActualState(OneArmedBandit bandit);
}
