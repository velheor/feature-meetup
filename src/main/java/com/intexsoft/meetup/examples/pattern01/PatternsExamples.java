package com.intexsoft.meetup.examples.pattern01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class PatternsExamples {
    public static void main(String[] args) {
    }

    public void processValue_old(Object obj) {
        if (obj instanceof String) {
            System.out.println("String: " + ((String) obj).trim());
        } else if (obj instanceof LocalDate) {
            System.out.println("Date: " + DateTimeFormatter.ISO_DATE.format((TemporalAccessor) obj));
        } else if (obj instanceof Number) {
            System.out.println("Number: " + ((Number) obj).longValue());
        } else {
            System.out.println("Something else");
        }
    }

    public void processValue(Object obj) {
        if (obj instanceof String s) {
            System.out.println("String: " + s.trim());
        } else if (obj instanceof LocalDate date) {
            System.out.println("Date: " + DateTimeFormatter.ISO_DATE.format(date));
        } else if (obj instanceof Number number) {
            System.out.println("Number: " + number.longValue());
        } else {
            System.out.println("Something else");
        }
    }
}
