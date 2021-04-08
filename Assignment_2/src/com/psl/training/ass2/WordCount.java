package com.psl.training.ass2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordCount {
    public static void main(String[] args) {

        String s = "This method returns the string left justified " +
                "in a string of length width. Padding is done using the specified " +
                "fillchar. The original " +
                "string is returned if width is less than len(s).";

        System.out.println(check(s,"string"));

    }

    static int check(String sentence,String word){

        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;

    }
}
