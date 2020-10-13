package com.raweshau;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank 1");

        if (bank.addBranch("Branch 1")) {
            System.out.println("Branch 1 created.");
        }
        bank.addCustomer("Branch 1","Customer 1",50.05);
        bank.addCustomer("Branch 1","Customer 2",175.34);
        bank.addCustomer("Branch 1","Customer 3",220.12);

        bank.addBranch("Branch 2");
        bank.addCustomer("Branch 2","Customer 1",150.54);

        bank.addCustomerTransaction("Branch 1","Customer 1",44.22);
        bank.addCustomerTransaction("Branch 1","Customer 1",12.44);
        bank.addCustomerTransaction("Branch 1","Customer 2",1.65);

        bank.listCustomers("Branch 1",true);

        bank.listCustomers("Branch 2",true);

        bank.addBranch("Branch 3");
        if (!bank.addCustomer("Branch 3","Customer 1",5.53)) {
            System.out.println("Error Branch 3 does not exist.");
        }

        if (!bank.addBranch("Branch 1")) {
            System.out.println("Branch 1 branch already exists.");
        }

        if (!bank.addCustomerTransaction("Branch 1", "Customer 4", 52.32)) {
            System.out.println("Customer does not exist in branch.");
        }

        if (!bank.addCustomer("Branch 1", "Customer 1",12.21)) {
            System.out.println("Customer 1 already exists.");
        }
    }
}
