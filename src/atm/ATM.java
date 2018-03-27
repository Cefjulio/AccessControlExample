/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import bank.BankAccount;

/**
 *
 * @author auyon.j6356
 */
public class ATM {
 
    private int id;
    
    public ATM(int id){
        this.id = id;
    }
    
    public void withdraw(BankAccount account, double amount){
        boolean result = account.withdraw(amount);
        
        if(result){
            System.out.println("Successful withdrwaw on ATM of $: " + amount);
        
        }else{
            System.out.println("Error on withdraw on ATM");
        
        }
        
    
    }
    
}
