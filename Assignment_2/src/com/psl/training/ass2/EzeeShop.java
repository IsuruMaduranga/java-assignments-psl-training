package com.psl.training.ass2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EzeeShop {

    public static void main(String[] args) {
        String[] productNames = {"baby oil", "apple"};
        System.out.println(isPresent(productNames,"oil"));
    }

    static boolean isPresent(String[] productNames, String keyword){

        Pattern pattern = Pattern.compile(keyword,Pattern.CASE_INSENSITIVE);

        for(String name:productNames){
            Matcher matcher = pattern.matcher(name);
            if(matcher.find()){
                return true;
            }
        }

        return false;

    };
}
