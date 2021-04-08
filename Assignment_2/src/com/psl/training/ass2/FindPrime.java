package com.psl.training.ass2;

import java.util.ArrayList;

public class FindPrime {

    public static void main(String[] args) {
        int [] primes = findPrime(10,100);
        for(int p:primes){
            System.out.println(p);
        }
    }

    static int[] findPrime(int start, int end){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int i = start; i<=end; i++){
            if (isPrimeNumber(i)) {
                primes.add(i);
            }
        }

        int[] prime_arr = new int[primes.size()];

        for(int i=0;i<primes.size();i++){
            prime_arr[i] = primes.get(i);
        }

        return prime_arr;
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
