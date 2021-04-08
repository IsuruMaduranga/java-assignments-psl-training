package com.psl.training.ass1;

public class MultiplicationMatrix {
    public static void main(String[] args) {
        displayMultiplicationMatrix();
    }

    static void displayMultiplicationMatrix(){
        int[][] table = new int[13][13];

        for (int i=1; i<=12; i++) {
            for(int j=i; j<=12; j++) {
                table[i][j] = i*j;
                table[j][i] = i*j;
            }
            table[0][i]=i;
            table[i][0]=i;
        }

        for(int i=0; i<=12; i++){
            for(int j=0; j<=12; j++){
                int val = table[i][j];
                if(val == 0){
                    System.out.print("\t");
                }else {
                    System.out.print("\t" + val);
                }
            }
            System.out.println();
        }

    }
}
