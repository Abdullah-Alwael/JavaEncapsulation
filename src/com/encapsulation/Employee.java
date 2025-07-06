package com.encapsulation;

public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("He can not work while also providing you his money!");
            System.out.println("His salary can not be negative");
        }
    }

    public int getAnnualSalary() {
        return salary * 12; // 12 months
    }

    public int raisedSalary(int percent) {
        if (percent > 0) {
            salary += (salary * (percent / 100));
        }
        return salary;
    }

    public String toString() { // return the details
        return "Employee name: " + name +
                ", with ID" + id +
                " Has this amount of salary: " + salary + "SAR";
    }
}
