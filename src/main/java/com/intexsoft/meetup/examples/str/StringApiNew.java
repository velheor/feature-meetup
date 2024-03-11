package com.intexsoft.meetup.examples.str;

public class StringApiNew {
    public static void main(String[] args) {
        var message = "one two three four five";
        //  6<= index <8
        var index = message.indexOf("o", 6, 8);
        System.out.println(index);
    }
}
