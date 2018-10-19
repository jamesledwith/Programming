package com.jamesl;

public class BankAccount {

    private String accountNum;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){
        System.out.println("Empty default account");
    }

    public BankAccount(String accountNum, double balance, String customerName, String email, String phone){
        this.accountNum = accountNum;
        this.balance = balance;
        this.phone = phone;
        this.email = email;
        this.customerName = customerName;
    }

    public BankAccount(String customerName, String email, String phone) {
        this("9988", 1000.5,customerName,"dfs@email.com","08627272");
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double amount){
        System.out.println(balance);
        this.balance += amount;

        System.out.println(balance);
    }

    public void withdraw(double amount){

        if ((this.balance - amount) < 0 ){
            System.out.println("Insufficient Funds :( you only have " + this.balance + " available" );
        }
        else{
            this.balance -= amount;
            System.out.println(balance);
        }
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
