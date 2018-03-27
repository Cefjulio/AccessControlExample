/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author auyon.j6356
 */
public class BankTeller {
    
    public void deposit(BankAccount account, double amount){
        boolean result = account.deposit(amount);
    
        if (result){
            System.out.println("Succesful Deposito fo $: " + amount);
        }else{
            System.out.println("Error on Deposit! ");
        }
       
    }
    
public void withdraw(BankAccount account, double amount){
        
    boolean result = account.withdraw(amount);
    
    if (result){
    
        System.out.println("Successful Withdraw of $ : " + amount);
    
    }else{
    
        System.out.println("Error on Withdraw! ");
    }
    
    
    
}
      



    
    
}
