package com.psl.training.ass1;

public class ElectricityBill {

    public static void main(String[] args) {
        System.out.println(calculateBill(750,"domestic"));
    }

    static double calculateBill(int units, String connectionType) {
        double[] domestic_charges = {4,4.5,4.75,5};
        double[] commercial_charges = {4.25,4.75,5,5.25};

        if (connectionType.equals("domestic")) {
            return calc(units,connectionType,domestic_charges);
        }
        else if (connectionType.equals("commercial")) {
            return calc(units,connectionType,commercial_charges);
        }

        return -1;

    }

    static double calc(int units, String connectionType, double[] charges){
        double bill;

        if (units<=100 && connectionType.equals("domestic")) {
            bill = Math.max(units*charges[0], 250);
        }else if (units<=100 && connectionType.equals("commercial")) {
            bill = Math.max(units*charges[0], 350);
        }else if(units<=300) {
            bill = units*charges[1];
        }else if(units<=500) {
            bill = units*charges[2];
        }else {
            bill = units*charges[3];
        }

        return bill;
    }
}
