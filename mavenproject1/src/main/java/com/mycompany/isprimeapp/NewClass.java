package com.mycompany.isprimeapp;


public class NewClass {


    boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0) 
   // boolean isPrime(int n){
        return true;
    }

    int getPrimeSum(int[] nums){
        int sm=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sm+=nums[i];
            }
        }
        return sm;
    }

    public static void main(String[] args) {
        NewClass nc= new NewClass();
        int x= 7;
        System.out.println("Number "+x+" is " +(
                nc.isPrime(x)?"":" not a "
                )+ " prime "   );
        int[] arr={3,4,8,7,9,10,12,5,11};
        int sum= nc.getPrimeSum(arr);
        System.out.println("The sum of the primes in the array is "+ sum );


    }
}