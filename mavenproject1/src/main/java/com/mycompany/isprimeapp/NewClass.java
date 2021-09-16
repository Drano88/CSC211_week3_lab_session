package com.mycompany.isprimeapp;


public class NewClass {
    boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0) 
            {
                return false;
            }  
        }
        return true;
    }

    public static void main(String[] args) {
        NewClass nc= new NewClass();
        int x= 7;
        System.out.println("Number "+x+" is " +(
                nc.isPrime(x)?"":" not a "
                )+ " prime "   );
    }
}