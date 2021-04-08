package com.psl.training.ass2;

public class MakeReverse {

    public static void main(String[] args) {
        System.out.println(makeReverse("To be or not to be"));
    }

    static String  makeReverse(String str){
        String[] words=str.split("\\s+");

        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            words[i] = sb.toString();
        }

        return String.join(" ",words);
    }
}
