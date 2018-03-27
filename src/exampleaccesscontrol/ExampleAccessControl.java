/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleaccesscontrol;

import atm.ATM;
import bank.BankAccount;
import bank.BankTeller;

/**
 *
 * @author auyon.j6356
 */
public class ExampleAccessControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccount a = new BankAccount(1234,100.00 );
        BankAccount b = new BankAccount(5678, 200.00);
        
        BankTeller john = new BankTeller();
        
        john.deposit(a,100);
        
        ATM xyz = new ATM(222);
        xyz.withdraw(b, 100.00);
        
        
    }
    
}
