

import java.util.ArrayList;

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {                                                            //get
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {                                                  //set
        this.name = name;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {                                             //deposit
        balance += amount;                
    }
    public void withdraw(double amount) {                                            //withdraw
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public String getInfo() {                      
        super.toString();                
        return "Account Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

class Bank {
    private ArrayList<Account> accountL;

    public Bank() {
        accountL = new ArrayList<Account>();
    }

    public void addAccount(Account account) {               //parametru account                                  
        accountL.add(account);
    }

    public void removeAccount(String accountNumber) {
        //accountL.removeIf(a -> a.getAccountNumber().equals(accountNumber));   
        for (Account a : accountL) {                                                         //pt fiecare a   de  Account   din  accountL 
            if (a.getAccountNumber().equals(accountNumber)) {
                accountL.remove(a);
                break;
            }
        }
    }

    public ArrayList<Account> getAccounts() {
        return accountL;
    }
}

public class A {
    
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("John Doe", "123456", 89900.0);
        Account account2 = new Account("Jane Smith", "789012", 500000.0);
        Account account3 = new Account("Alice Johnson", "345678", 100000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        System.out.println("All Accounts:");
        for (Account a : bank.getAccounts()) {
            System.out.println(a.getInfo());
        }
        // accountL.forEach(a -> System.out.println(a.getInfo()));

        System.out.println("\n account1 after deposit 20000.0:");
        account1.deposit(20000);
        System.out.println(account1.getInfo());

        System.out.println("\n account2 after withdraw 100000.0:");
        account2.withdraw(100000);
        System.out.println(account2.getInfo());

        System.out.println("\n account3 after withdraw 20000.0:");
        account3.withdraw(20000);
        System.out.println(account3.getInfo());

    }
}
