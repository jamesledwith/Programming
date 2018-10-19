package com.jamesl;

public class Main {

    public static void main(String[] args) {
        BankAccount jimmysAccount = new BankAccount("01222",1500,"Jimmy Leddy", "JimLed@hotmail.com","087123211");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "jim@l.com");
        System.out.println(person3.getName());
    }
}
