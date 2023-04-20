import java.util.ArrayList;
import java.util.Date;

public class practice1 {
    public static void main(String[] args) {
        Account1 account = new Account1("George", 1122, 1000);
        Account1.Transaction transaction = new Account1.Transaction();
        account.setAnnualInterestRate(1.65);
        account.deposit(30,0);
        account.deposit(40,1);
        account.deposit(50,2);
        account.withdraw(5,3);
        account.withdraw(4,4);
        account.withdraw(2,5);
        System.out.println("Name: George");
        System.out.println("Annual interest rate: "+account.getAnnualInterestRate());
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Date"+"\t\t\t\t\t\t\t\t"+"type"+"\t"+"Amount"+"\t\t"+"Balance");
        for (int i = 0; i < 6; i++) {
            System.out.println(account.transactions[i]);
        }
    }
    public static class Account {
        private int id;
        double balance=0;
        private double annualInterestRate;
        protected java.util.Date dateCreated;

        public Account() {
            dateCreated = new java.util.Date();
        }

        public Account(int newId, double newBalance) {
            id = newId;
            balance = newBalance;
            dateCreated = new java.util.Date();
        }

        public int getId() {
            return this.id;
        }

        public double getBalance() {
            return balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setId(int newId) {
            id = newId;
        }

        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        public void setAnnualInterestRate(double newAnnualInterestRate) {
            annualInterestRate = newAnnualInterestRate;
        }

        public double getMonthlyInterest() {
            return balance * (annualInterestRate / 1200);
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void deposit(double amount) {
            balance += amount;
        }
    }

    public static class Account1 extends Account {
        private String name;

        public static String[] transactions = new String[6];

        Account1(String name, int id, double balance) {
            this.name = name;
            setId(id);
            setBalance(balance);
        }
        public void withdraw(double amount,int i) {
            balance-=amount;
            Transaction transaction = new Transaction('W', amount, balance);
            Transaction.add(transaction.description,i);
        }

        public void deposit(double amount,int i) {
            balance+=amount;
            Transaction transaction = new Transaction('D', amount, balance);
            Transaction.add(transaction.description,i);
        }

        public static class Transaction{
            //private static java.util.Date date;
            private static char type;
            private static double amount;
            private static double balance;
            private String description;
            Transaction(){
                //date=new java.util.Date();
            }
            Transaction(char type, double amount, double balance){
                this.type = type;
                this.amount = amount;
                this.balance = balance;
            }
            public static void add(String description, int i){
                Date date = new Date();
                description = date.toString()+"\t"+type+"\t\t"+amount+"\t\t"+balance;
                transactions[i]+=description;
            }
        }
    }
}