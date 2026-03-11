package com.bank.main;

import com.bank.accounts.SavingsAccount;
import com.bank.exception.InsufficientBalanceException;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount(101, 5000);

        try {
            acc.deposit(2000);
            acc.withdraw(3000);

            FileWriter fw = new FileWriter("transactions.txt");
            fw.write("Deposit: 2000\n");
            fw.write("Withdraw: 3000\n");
            fw.close();

            System.out.println("Transaction saved to file");

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}
