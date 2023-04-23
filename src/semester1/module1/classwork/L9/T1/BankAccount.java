package semester1.module1.classwork.L9.T1;

public class BankAccount {
    int id;
    String name;
    double balance;

    void showData() {
        System.out.println("User: " + name);
    }
}

class BankAccount_test {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount herAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Vasily";
        myAccount.balance = 1222;
    }
}