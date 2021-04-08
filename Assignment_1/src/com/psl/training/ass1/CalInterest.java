package com.psl.training.ass1;

public class CalInterest {

    public static void main(String[] args) {
        System.out.println(calInterest(12900));
    }

    static double calInterest(int amt){
        double interest;

        if(amt<=1000){
            interest = amt * (0.04);
        }else if(amt<=5000){
            interest = amt * (0.045);
        }else{
            interest = amt * (0.05);
        }

        return interest;
    }
}
