package com.psl.training.ass1;

public class CalPayback {
    public static void main(String[] args) {
        System.out.println(calPayBack(400));
        System.out.println(calPayBack(1400));
        System.out.println(calPayBack(2000));
        System.out.println(calPayBack(2600));
    }

    static float calPayBack(int charge) {

        float[] rates = {0.0025f,0.005f,0.0075f,0.01f};
        int[] cutoffs = {500,1000,1000,0};
        float payBack = 0;

        for(int i=0; i<=3; i++){
            if(charge<cutoffs[i]) {
                payBack = payBack + charge * rates[i];
                break;
            }
            payBack = payBack + cutoffs[i] * rates[i];
            charge = charge - cutoffs[i];
        }
        return payBack;
    }

}
