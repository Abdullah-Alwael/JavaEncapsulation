package com.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Accounts
        // create 5 objects

        // has zero balance = default
        Account ac1 = new Account("1000", "Abdulkareem");
        Account ac2 = new Account("2000", "Ahmed", 500); // has balance 500SAR
        Account ac3 = new Account("3000", "Mohammed", 12000);
        Account ac4 = new Account("4000", "Yasser");
        Account ac5 = new Account("5000", "Mukhtar", 100000);


        ac1.setBalance(-500); // an error message shows when the amount is negative
        ac1.setBalance(80000); // no error message
        System.out.println(ac1.getName()+" with account number "+ac1.getId()+" has "+ ac1.getBalance()+"SAR");

        ac2.debit(1000); // can not remove more than what is available
        ac2.debit(0); // can not take 0 amounts out from ATMs
        ac2.debit(400); // no errors
        // 100 remaining
        System.out.println(ac2.getName()+" with account number "+ac2.getId()+" has "+ ac2.getBalance()+"SAR");
        System.out.println("your remaining balance is: "+ac2.debit(100)+"SAR"); // can take out all his money


        ac3.setId("6000"); // change id to new one
        System.out.println(ac3); // prints the toString method

        ac4.setName("Yahya"); // change the name of owner for the 4th account
        ac4.credit(-5000); // negative numbers are not accepted
        ac4.credit(0); // can not add 0 amounts to the bank
        System.out.println(ac4.getName()+", Your new balance is "+ac4.credit(5000)+"SAR");; // no errors

        ac5.transferTo(ac2,-5000); //can not transfer negative amount
        ac5.transferTo(ac2, 0); // can not transfer 0 amounts
        ac5.transferTo(ac2, 500000); // can not transfer more than available
        System.out.println("Your remaining balance is "+ac5.transferTo(ac2, 50000)+"SAR");


        // -------------------------------------------------------------------------------------------------------
        // Employees
        // create 5 objects

        Employee e1 = new Employee("10","Ahmed",21631);
        Employee e2 = new Employee("20","Mohammed", 16070);
        Employee e3 = new Employee("30", "Khalid", 14980);
        Employee e4 = new Employee("40", "Raghad", 17030);
        Employee e5 = new Employee("50", "Khulood", 22603);



    }
}
