package com.mycompany.contabancaria;

import java.util.Scanner;

public class ContaBancariaConsole{

   public static void main(String[] args){

    
    Scanner scanner = new Scanner(System.in);
    
    ContaBancaria conta = new ContaBancaria();
    
    double quantia;
    
       // Exibe o saldo atual:
       System.out.println("Saldo atual: R$" + conta.consultarSaldo());
       
       
       // Depósito
       
       System.out.println("Digite o valor a ser depositado: R$");
       quantia = scanner.nextDouble();
       conta.depositar(quantia);
       System.out.println("Depósito realizado. Novo saldo é: R$" + conta.consultarSaldo());
       
       //Saque
       
        System.out.println("Digite o valor a ser sacado: R$");
        quantia = scanner.nextDouble();
        boolean sucesso = conta.sacar(quantia);
        
        if(sucesso){
            
            System.out.println("Saque realizado com sucesso!. Novo saldo é: R$" + conta.consultarSaldo());
           }else{
            System.out.println("Saque não realizado! Saldo insuficiente ou valor inválido!");
           }
        
        scanner.close();
        }
   } 

   
   
       
   
  

 class ContaBancaria {

    private double saldo = 0; // Encapsulamento do saldo

    // Método para realizar o depósito
    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
            
           System.out.println("Depósito realizado com sucesso! Valor depositado:" + quantia); 
           
           
        }else{
               System.out.println("Valor inválido para depósito!");
             }
        

    }
    

    // Método para realizar o saque
    public boolean sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            return true;
              }else{
                  return false;  
                    }
        }
    

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }
}

        
       


