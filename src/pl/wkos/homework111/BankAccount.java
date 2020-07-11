package pl.wkos.homework111;

public class BankAccount {
    private Person person;
    private double bankBalance;

    public BankAccount(Person person, double bankBalance) {
        if (person == null)
            throw new NullPointerException("tworzysz konto bez osoby");
        if(bankBalance<0)
            throw new IllegalArgumentException("tworzysz konto z ujemnym saldem");
        this.person = person;
        this.bankBalance = bankBalance;
    }

    public void deposit(double amount) {
        bankBalance += amount;
    }

    public void withdraw(double amount) {
        if (bankBalance - amount < 0)
            throw new IllegalArgumentException("nie masz tyle środków na koncie");
        bankBalance -= amount;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return person + "\n\tstan konta: " + bankBalance;
    }
}
