package facade.atm;

import facade.atm.bank.AtmMachineFacade;

public class Main {

    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
