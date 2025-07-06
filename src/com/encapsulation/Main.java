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
        System.out.println(ac1.getName() + " with account number " + ac1.getId() + " has " + ac1.getBalance() + "SAR");
        System.out.println("Debit 500 from " + ac1.getName() + ", remaining is: " + ac1.debit(500) + "SAR");
        System.out.println("Adding 100 to account, the new balance is: " + ac1.credit(100) + "SAR");
        System.out.println("Transferring 350 to another account, remaining: " + ac1.transferTo(ac4, 350) + "SAR");
        System.out.println(ac1);

        ac2.setName("Ahmad");
        ac2.setId("2100");
        ac2.setBalance(4000 + ac2.getBalance()); //4000 + 500
        ac2.debit(1000); // can not remove more than what is available
        ac2.debit(0); // can not take 0 amounts out from ATMs
        ac2.debit(400); // no errors
        System.out.println(ac2.getName() + " with account number " + ac2.getId() + " has " + ac2.getBalance() + "SAR");
        System.out.println("your remaining balance is: " + ac2.debit(100) + "SAR");
        ac2.credit(600);
        ac2.credit(800);
        System.out.println("Transferring 5000 from " + ac2.getName() + ", remaining:" + ac2.transferTo(ac3, 5000) + "SAR");
        System.out.println(ac2);

        ac3.setId("3600"); // change id to new one
        ac3.setName("Mahmood");
        ac3.setBalance(950 + ac3.getBalance());
        System.out.println("Welcome " + ac3.getName() + ", your ID is " + ac3.getId());
        ac3.credit(6000700); // trying big amounts
        ac3.debit(5000000);
        ac3.transferTo(ac5, 3000000);
        System.out.println(ac3); // prints the toString method

        ac4.setName("Yahya"); // change the name of owner for the 4th account
        ac4.setId("4200");
        ac4.setBalance(50 + ac4.getBalance()); // 50+0
        ac4.credit(-5000); // negative numbers are not accepted
        ac4.credit(0); // can not add 0 amounts to the bank
        System.out.println(ac4.getName() + ", Your new balance is " + ac4.credit(5000) + "SAR"); // no errors
        System.out.println("Your account number is: " + ac4.getId());
        ac4.debit(4050);
        ac4.transferTo(ac5, 1000);
        System.out.println(ac4);

        ac5.transferTo(ac2, -5000); //can not transfer negative amount
        ac5.transferTo(ac2, 0); // can not transfer 0 amounts
        ac5.transferTo(ac2, 500000); // can not transfer more than available
        System.out.println("account with ID: " + ac5.getId() + "'s remaining balance  after transfer is "
                + ac5.transferTo(ac2, 50000) + "SAR");
        ac5.setName(ac5.getName() + "_2");
        ac5.setId("5500");
        ac5.setBalance(800 + ac5.getBalance());
        ac5.credit(400);
        ac5.credit(50);
        ac5.debit(50000);
        System.out.println("Your remaining balance is: " + ac5.getBalance() + "SAR");
        System.out.println(ac5);


        // -------------------------------------------------------------------------------------------------------
        // Employees
        // create 5 objects

        Employee e1 = new Employee("10", "Ahmed", 21631);
        Employee e2 = new Employee("20", "Mohammed", 16070);
        Employee e3 = new Employee("30", "Khalid", 14980);
        Employee e4 = new Employee("40", "Raghad", 17030);
        Employee e5 = new Employee("50", "Khulood", 22603);

        e1.setName("Ahmad");
        e1.setId("11");
        e1.setSalary(500 + e1.getSalary());
        System.out.println("Employee " + e1.getName() + " has ID of: " + e1.getId() + " and his salary is: " + e1.getSalary() + "SAR");
        System.out.println("His annual salary is: " + e1.getAnnualSalary() + "SAR");
        System.out.println("salary after 30% raise: " + e1.raisedSalary(30) + "SAR");
        System.out.println(e1);

        e2.setId("60");
        e2.setName("Mahmood");
        e2.setSalary(-600); // can't live
        e2.setSalary(0); // can have zero salary, if he is a trainee i.e. co-op.
        e2.setSalary(15370); // no errors
        System.out.println("Agent " + e2.getName() + "'s salary is: " + e2.getSalary() + "SAR");
        System.out.println("His ID is: " + e2.getId());
        System.out.println("raise 15% salary: " + e2.raisedSalary(15) + "SAR");
        System.out.println("Annual salary is: " + e2.getAnnualSalary() + "SAR");
        System.out.println(e2); // print the toString method

        e3.setName(e3.getName() + "_10");
        e3.setId(e3.getId() + "5");
        e3.setSalary(7000 + e3.getSalary());
        System.out.println(e3.getName() + " Annual salary is: " + e3.getAnnualSalary() + "SAR");
        System.out.println("Raise 50% is: " + e3.raisedSalary(50) + "SAR");
        System.out.println(e3);

        e4.raisedSalary(-100); // can not be negative
        e4.raisedSalary(0); // can not be zero
        e4.raisedSalary(11);
        e4.setName(e4.getName() + "_new");
        e4.setSalary(5600 + e4.getSalary());
        e4.setId(e4.getId() + 10); // string concatenation
        System.out.println(e4.getId() + " Account holder " + e4.getName() + " has " + e4.getAnnualSalary() + "SAR annually");
        System.out.println(e4);

        e5.setName(e5.getName()+"_second_Account");
        e5.setId(e5.getId()+"8");
        e5.setSalary(3500+e5.getSalary());
        System.out.println("Raising " + e5.getName() + "'s salary by 25%");
        System.out.println("The new salary will be: " + e5.raisedSalary(25)+"SAR");
        System.out.println("He will get: "+e5.getAnnualSalary()+"SAR");
        System.out.println(e5);


    }
}
