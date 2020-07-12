package pl.wkos.homework111;

public class CashMachine {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Jan", "Abacki");
        people[1] = new Person("Ewa", "Babacka");

        BankAccount[] bankAccounts = new BankAccount[3];

        bankAccounts[0] = BankAccountUtils.createAccount(people[0], 100);
        if (bankAccounts[0] != null) {
            try {
                bankAccounts[0].withdraw(100);
                bankAccounts[0].withdraw(100);
                System.out.println(bankAccounts[0].toString());
            } catch (IllegalArgumentException e) {
                System.out.println("Nie masz tyle środków na koncie");
            }
            bankAccounts[0].deposit(200);
            System.out.println(bankAccounts[0].toString());
        } else
            System.out.println("Nie ma takiego konta");

        bankAccounts[1] = BankAccountUtils.createAccount(people[1], -100);

        bankAccounts[2] = BankAccountUtils.createAccount(people[2], 100);

        bankAccounts[2] = BankAccountUtils.createAccount(new Person("Ala", "Cabacka"), 100_000);
    }
}
