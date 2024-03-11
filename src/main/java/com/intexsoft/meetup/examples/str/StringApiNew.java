package com.intexsoft.meetup.examples.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringApiNew {
    public static void main(String[] args) {
        var message = "one two three four five";
        //  6<= index <8
        var index = message.indexOf("o", 6, 8);
        System.out.println(index);
        repeat();
        regexGroup();
    }

    public static void isEmoji() {
        Character.isEmoji(Integer.parseInt("0x0040"));
        Character.isEmojiComponent(Integer.parseInt("0x0040"));
        Character.isEmojiModifier(Integer.parseInt("0x0040"));
        Character.isEmojiModifierBase(Integer.parseInt("0x0040"));
        Character.isEmojiPresentation(Integer.parseInt("0x0040"));
    }

    public static void repeat() {
        var sb = new StringBuilder();
        sb.repeat("one ", 5);
        System.out.println(sb);
    }

    public static void regexGroup() {
        String line = "1;New York;8 888 337";
        String regexPattern = "(?<id>\\d+);(?<location>[^;]+);(?<phoneNumber>[^;]+)";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            String id = matcher.group("id");
            String location = matcher.group("location");
            String phoneNumber = matcher.group("phoneNumber");

            System.out.println("ID: " + id);
            System.out.println("Location: " + location);
            System.out.println("Phone Number: " + phoneNumber);
        } else {
            System.out.println("No match found.");
        }
    }
}
