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

        ac1.setName("Abdullah");
        ac1.setId("1100");
        ac1.setBalance(-500); // an error message shows when the amount is negative
        ac1.setBalance(80000); // no error message
        System.out.println(ac1.getName()+" with account number "+ac1.getId()+" has "+ ac1.getBalance()+"SAR");
        System.out.println("Debit 500 from "+ac1.getName()+", remaining is: "+ ac1.debit(500)+"SAR");
        System.out.println("Adding 100 to account, the new balance is: "+ac1.credit(100));
        System.out.println("Transferring 350 to another account, remaining: "+ac1.transferTo(ac4, 350));
        System.out.println(ac1);

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

        System.out.println("Employee "+e1.getName()+" has ID of: "+e1.getId()+" and his salary is: "+e1.getSalary());

        e2.setId("60");
        e2.setName("Mahmood");
        e2.setSalary(-600); // can't live
        e2.setSalary(0); // can have zero salary, if he is a trainee i.e. co-op.
        e2.setSalary(15370); // no errors

        System.out.println(e2); // print the toString method

        System.out.println(e3.getName()+" Annual salary is: "+e3.getAnnualSalary()+"SAR");

        e4.raisedSalary(-100); // can not be negative
        e4.raisedSalary(0); // can not be zero

        System.out.println("Raising "+e5.getName()+"'s salary by 25%");
        System.out.println("The new salary will be: "+e5.raisedSalary(25));


    }
}
