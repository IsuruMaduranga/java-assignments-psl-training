package com.psl.training.ass1;

public class CalTax {

    public static void main(String[] args) {
        System.out.println(calTax(500));
    }

    static double calTax(int gp){
        double tax;

        if(gp<=240){
            tax = gp * (0);
        }else if(gp<=480){
            tax = gp * (0.15);
        }else{
            tax = gp * (0.28);
        }

        return tax;
    }
}
