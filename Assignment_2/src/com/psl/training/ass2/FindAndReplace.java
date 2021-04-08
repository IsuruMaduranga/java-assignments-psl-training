package com.psl.training.ass2;

public class FindAndReplace {

    public static void main(String[] args) {
        System.out.println(findAndReplace("apple orange apple","apple","wine"));
    }

    static String findAndReplace(String str, String word, String newword){
        return str.replaceAll(word,newword);
    }
}
