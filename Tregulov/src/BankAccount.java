public class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double popolnenie) {
        balance = balance + popolnenie;
    }

    void snyatieSoScheta (double snyatie) {
        balance = balance - snyatie;
    }



    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.id = 56789;
        myBankAccount.name = "Lena";
        myBankAccount.balance = 56.78;

    }
}
