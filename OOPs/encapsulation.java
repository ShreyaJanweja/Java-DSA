//encapsulation - data hiding (for unautherized users)
package OOPs;
class BankAccount{
    private double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    double getBalance(){
        return balance;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.deposit(1000);
        obj.withdraw(400);
        System.out.println(obj.getBalance());
    }
}
