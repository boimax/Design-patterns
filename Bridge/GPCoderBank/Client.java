/*
NOTE: 
Vietcombank: child of Bank 
CheckingAccount: child of Account
Bank HAS-A Account -> new Vietcombank(new CheckingAccount()): wrapped

Vì thằng abstract sở hữu toàn bộ thằng implement (bằng cách bỏ vào constructor), mà thằng implement 
được thừa kế bởi hết tất cả các thằng con. Nên thằng abstract có thể access vô bất kỳ thằng con nào 
của implement.
*/
public class Client {
    public static void main(String[] args) {
        Bank vietcombank = new Vietcombank(new CheckingAccount());
        vietcombank.openAccount();// this openAccount() will call to openAccount() of CheckingAccount class.
        // Access vào thằng con thì phải gọi method của thằng con.

        Bank tpbank = new TPBank(new SavingAccount());
        tpbank.openAccount();
    }
}
