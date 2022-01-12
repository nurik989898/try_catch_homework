package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public  void deposit(double sum) {
        amount += sum;
        System.out.println("Vy popolnili schet");
    }
    public  void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("u vas ostalos", amount);
        }
        else {
            amount -= sum;
            System.out.println("vy snyali dengi");
        }
    }
}
