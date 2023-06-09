/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SY NGUYEN
 */
public class MinMaxAccount extends BankingAccount {

    private int minBalance;
    private int maxBalance;

    public MinMaxAccount(Startup s) {
        super(s);
        minBalance = s.getBalance();
        maxBalance = s.getBalance();
    }

    public void debit(Debit d) {
        super.debit(d);
        int balance = getBalance();
        if (balance < minBalance) {
            minBalance = balance;
        }
        if (balance > maxBalance) {
            maxBalance = balance;
        }
    }

    public void credit(Credit c) {
        super.credit(c);
        int balance = getBalance();
        if (balance < minBalance) {
            minBalance = balance;
        }
        if (balance > maxBalance) {
            maxBalance = balance;
        }
    }

    public int getMin() {
        return minBalance;
    }

    public int getMax() {
        return maxBalance;
    }
}
