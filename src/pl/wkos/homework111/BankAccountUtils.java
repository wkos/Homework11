package pl.wkos.homework111;

public class BankAccountUtils {
    public static BankAccount createAccount(Person person, double amount) {
        try {
            BankAccount bankAccount = new BankAccount(person, amount);
            System.out.println("Konto utworzone");
            System.out.println(bankAccount.toString());
            return  bankAccount;
        } catch (NullPointerException e) {
            System.out.println("Tworzysz konto bez osoby. Konto nie zostało utworzone");
        } catch (IllegalArgumentException e) {
            System.out.println("nie możesz tworzyć kont z ujemnym saldem. Konto nie zostało utworzone");
        }
        return  null;
    }
}
