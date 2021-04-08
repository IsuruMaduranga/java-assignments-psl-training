package com.psl.training.ass1;

public class PrintPrime {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));

        printPrime(100);
    }

    static void printPrime(int maxVal){

        for(int i=2; i<=maxVal; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrimeNumber(int num){

        if(num<=2) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }
}
