package com.psl.training.ass1;

public class CalculateProfit {
    public static void main(String[] args) {
        System.out.println(calculateProfit(1));
    }

    static float calculateProfit( int numAttendees){
        return (float)(4.5 * numAttendees - 20);
    }
}
