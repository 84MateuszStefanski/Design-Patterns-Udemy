package facade.atm.bank;

class BankSystem {

    void transferMoney() {
        System.out.println("Money transfered ");
    }

    boolean validatePin() {
        System.out.println("Pin valid");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transaction valid ");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("Transaction history ");
    }
}
