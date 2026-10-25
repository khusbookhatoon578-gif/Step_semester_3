package Practice8_problems;

import java.util.Scanner;

abstract class Customer {
    double amount;

    Customer(double amount) {
        this.amount = amount;
    }

    abstract double calculateFinalAmount();
}

class StudentCustomer extends Customer {
    StudentCustomer(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return amount * 0.90;
    }
}

class StaffCustomer extends Customer {
    StaffCustomer(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return amount * 0.95;
    }
}

class GuestCustomer extends Customer {
    GuestCustomer(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return amount + 10;
    }
}

public class A4_CanteenBillingCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next().toUpperCase();
            double amount = sc.nextDouble();

            Customer customer = null;

            switch (type) {
                case "STUDENT":
                    customer = new StudentCustomer(amount);
                    break;

                case "STAFF":
                    customer = new StaffCustomer(amount);
                    break;

                case "GUEST":
                    customer = new GuestCustomer(amount);
                    break;
            }

            double finalAmount = customer.calculateFinalAmount();

            System.out.printf("%s: %.2f%n", type, finalAmount);

            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}